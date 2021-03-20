package fudan.Pojo;

/**
 * @author zhangxing
 * @Date 2021/3/18
 */
public class VirtualMachine {

    private String vmName;

    private Integer cpuNumber;

    private Integer memoryNumber;

    private Integer type;

    public VirtualMachine() {
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
