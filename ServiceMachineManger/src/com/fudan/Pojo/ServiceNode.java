package fudan.Pojo;

/**
 * @author zhangxing
 * @Date 2021/3/20
 * 服务器节点信息类
 */
public class ServiceNode {
    private NodeType nodeType;

    private Integer cpuNumber;

    private Integer memoryNumber;

    public ServiceNode() {
    }
    public ServiceNode(NodeType nodeType){
        this.nodeType =  nodeType;
    }
    public ServiceNode(NodeType nodeType, Integer cpuNumber, Integer memoryNumber) {
        this.nodeType = nodeType;
        this.cpuNumber = cpuNumber;
        this.memoryNumber = memoryNumber;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
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
