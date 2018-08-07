package cn.edu.jxufe.shopping.utils;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 14:00:24
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class StringUtils {
    public static boolean isNumber(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
