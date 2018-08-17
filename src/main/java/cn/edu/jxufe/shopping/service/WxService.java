package cn.edu.jxufe.shopping.service;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-17 11:11:24
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public interface WxService {
    public void sendImgTextMSGToALL(String jsonStr);

    public String getAccessToken();

    public List<String> getAllUser();
}
