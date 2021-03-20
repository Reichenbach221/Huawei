package fudan.Pojo;

import java.util.*;

/**
 * @author zhangxing
 * @Date 2021/3/18
 * 数据池
 */
public class PublicDataPool {
    //可以购买的服务器列表
    public static List<ServiceMachine> servicesToSale = new ArrayList<>();
    //可以代售的虚拟机列表
    public static List<VirtualMachine> virtualToSale = new ArrayList<>();

    //已经购买的服务器列表
    public static List<ServiceMachine> haveServices = new ArrayList<>();
    //已经购买的虚拟机列表
    public static List<VirtualMachine> runingVms = new ArrayList<>();
    /**
     * 服务器与虚拟机的映射关系
     * -----      ---    ---
     * |    |--->|  |-->|  |
     * -----     ---    ---
     * |    |
     * -----
     */
    public static Map<Integer,List<VirtualMachine>> serviceToVitualMachine = new TreeMap<>();

    //存量服务器信息
    public static StockServiceInfo stockServiceInfo = new StockServiceInfo();
    //日常请求
    public static List<DailyRequest> dailyRequests = new LinkedList<>();
}
