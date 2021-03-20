package fudan.Pojo;

import java.util.HashMap;

/**
 * @author zhangxing
 * @Date 2021/3/20
 */
public class StockService {
    private Integer id;

    private Integer cpuNumber;

    private Integer memoryNumber;

    //节点信息
    private HashMap<String,ServiceNode> nodes;

    public StockService() {
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

    public HashMap<String, ServiceNode> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<String, ServiceNode> nodes) {
        this.nodes = nodes;
    }
}
