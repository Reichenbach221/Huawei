package fudan.Pojo;

/**
 * @author zhangxing
 * @Date 2021/3/20
 */
public class ServiceNode {
    private String nodeType;

    private Integer cpuNumber;

    private Integer memoryNumber;

    public ServiceNode() {
    }

    public ServiceNode(String nodeType, Integer cpuNumber, Integer memoryNumber) {
        this.nodeType = nodeType;
        this.cpuNumber = cpuNumber;
        this.memoryNumber = memoryNumber;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
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
}
