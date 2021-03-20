package fudan.zx;

import fudan.Pojo.*;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author zhangxing
 * @Date 2021/3/18
 */
public class Start {
    /**
     * 对数据进行初始化操作
     */
    public void initData(){
        //读取文本数据
        ReadData readData = new ReadData();
        readData.getData();
        //对服务器进行性价比排序操作
        PublicDataPool.servicesToSale = PublicDataPool.servicesToSale.stream().sorted(Comparator.comparingDouble(ServiceMachine::getCostPriceRate)).collect(Collectors.toList());
        //对虚拟机进行排序操作
        PublicDataPool.virtualToSale = PublicDataPool.virtualToSale.stream().sorted(Comparator.comparing(VirtualMachine::getVmName)).collect(Collectors.toList());
    }

    /**
     * 处理每天的数据
     */
    public void dealDailyRequest(DailyRequest dailyRequest){
        System.out.println("处理第["+dailyRequest.getDay()+"]天数据["+dailyRequest.getNum()+"]条");
        for(UserRequest userRequest : dailyRequest.getRequests()){
            if(userRequest.getOperationType().equals(RequestEnum.ADD.getCode())){
                //添加的请求
                if(checkStockService(Utils.getVirtualMachine(userRequest.getVirtualMachineType()))){

                }
            }else{
                //删除的请求
            }
        }

    }

    /**
     * 检查存量服务器是否足够
     * @param virtualMachine
     * @return
     */
    public boolean checkStockService(VirtualMachine virtualMachine){
        StockServiceInfo serviceInfo = PublicDataPool.stockServiceInfo;
        if(serviceInfo.getCpusNumber() < virtualMachine.getCpuNumber() || serviceInfo.getMemoryNumber() < virtualMachine.getMemoryNumber()){
            //如果存量服务器的Cpus/Memorys小于虚拟机要求的
            return false;
        }else{
            //遍历一遍是否能够放入并找到
            Optional<StockService> stockService = serviceInfo.getStockService().stream().filter(item ->{
                if(virtualMachine.getType() == 0){
                    //单节点部署
                    if((item.getNodes().get(NodeType.A).getCpuNumber() > virtualMachine.getCpuNumber() &&
                            item.getNodes().get(NodeType.A).getMemoryNumber() > virtualMachine.getMemoryNumber()) ||
                            (item.getNodes().get(NodeType.B).getCpuNumber() > virtualMachine.getCpuNumber() &&
                            item.getNodes().get(NodeType.B).getMemoryNumber() > virtualMachine.getMemoryNumber())){
                        return true;
                    }
                    return false;
                }else{
                    //双节点
                    if((item.getNodes().get(NodeType.A).getCpuNumber() > virtualMachine.getCpuNumber()/2 &&
                            item.getNodes().get(NodeType.A).getMemoryNumber() > virtualMachine.getMemoryNumber()/2) &&
                            (item.getNodes().get(NodeType.B).getCpuNumber() > virtualMachine.getCpuNumber()/2 &&
                                    item.getNodes().get(NodeType.B).getMemoryNumber() > virtualMachine.getMemoryNumber()/2)){
                        return true;
                    }
                    return false;
                }
            }).findFirst();
            if(stockService.get() != null){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Start start = new Start();
        start.initData();

        VirtualMachine vm = Utils.getVirtualMachine("vmFS8Q0");
        System.out.println(vm);
    }
}
