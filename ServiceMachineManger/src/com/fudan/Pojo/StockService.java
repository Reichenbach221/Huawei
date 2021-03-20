package fudan.Pojo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhangxing
 * @Date 2021/3/20
 * 存量服务器类
 */
public class StockService {
    //服务器ID
    private Integer id;

    private Integer cpuNumber;

    private Integer memoryNumber;

    //虚拟机列表
    private List<VirtualMachineOnService> virtualMachines;

    //节点信息
    private HashMap<NodeType,ServiceNode> nodes;

    public StockService() {
        nodes = new HashMap<>(2);
        virtualMachines = new LinkedList<>();
    }

    public List<VirtualMachineOnService> getVirtualMachines() {
        return virtualMachines;
    }

    public void setVirtualMachines(List<VirtualMachineOnService> virtualMachines) {
        this.virtualMachines = virtualMachines;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpuNumber() {
        return cpuNumber;
    }

    public void setCpuNumber(Integer cpuNumber) {
        this.cpuNumber = cpuNumber;
    }

    public Integer getMemoryNumber() {
        return memoryNumber;
    }

    public void setMemoryNumber(Integer memoryNumber) {
        this.memoryNumber = memoryNumber;
    }

    public HashMap<NodeType, ServiceNode> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<NodeType, ServiceNode> nodes) {
        this.nodes = nodes;
    }
}
