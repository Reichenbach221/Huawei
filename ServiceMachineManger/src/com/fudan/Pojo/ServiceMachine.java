package fudan.Pojo;

import java.util.HashMap;

/**
 * 服务器类
 * @author zhangxing
 * @Date 2021/3/18
 */
public class ServiceMachine {
    private Integer id;

    private String serviceName;

    private Integer cpuNumber;

    private Integer memoryNumber;
    //节点信息
    private HashMap<String,ServiceNode> nodes;

    private Integer cost;

    private Integer dailyCost;


    public ServiceMachine() {
        nodes = new HashMap<>(2);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getCpuNumber() {
        return cpuNumber;
    }

    public void setCpuNumber(Integer cpuNumber) {
        this.cpuNumber = cpuNumber;
    }

    public HashMap<String, ServiceNode> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<String, ServiceNode> nodes) {
        this.nodes = nodes;
    }

    public Integer getMemoryNumber() {
        return memoryNumber;
    }

    public void setMemoryNumber(Integer memoryNumber) {
        this.memoryNumber = memoryNumber;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(Integer dailyCost) {
        this.dailyCost = dailyCost;
    }
}
