package fudan.Pojo;

/**
 * @author zhangxing
 * @Date 2021/3/20
 * 工具类
 */
public class Utils {

    /**
     * 为了方便后后续虚拟机的查询 此处给与了一个ID值 可以设置查找方法，方便虚拟机的查找
     * @param vmName
     * @return value 字符串的ASCII码
     */
    public static int  getVmid(String vmName){
        int value = 0;
        char[] chars= vmName.toCharArray();
        for(char item : chars){
            value += item;
        }
        return value;
    }
}
