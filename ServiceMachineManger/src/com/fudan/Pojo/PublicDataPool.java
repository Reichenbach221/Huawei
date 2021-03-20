package fudan.Pojo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhangxing
 * @Date 2021/3/18
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
    //存量服务器列表
    public static List<StockService> stockService = new LinkedList<>();
    //日常请求
    public static List<DailyRequest> dailyRequests = new LinkedList<>();
}
