package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.service.WxService;
import cn.edu.jxufe.shopping.utils.RequestUtils;
import cn.edu.jxufe.shopping.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-17 11:14:37
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
@Service
public class WxImp implements WxService {
    @Override
    public void sendImgTextMSGToALL(String jsonStr) {
        String url = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
        url = url.replace("ACCESS_TOKEN", this.getAccessToken());
        List<String> list = this.getAllUser();
        for (int i = 0; i < list.size(); i++) {
            String tmp = jsonStr;
            tmp = tmp.replace("OPENID", list.get(i));
            System.out.println(tmp);
            String rs = RequestUtils.post(url, tmp);
            System.out.println(rs);
        }
    }

    @Override
    public String getAccessToken() {
        String accessToken = "";
        String url = "http://111.230.223.115/wx/accesstoken/get";
        String rs = RequestUtils.get(url);
        if (rs != null) {
            JSONObject jsonObject = JSON.parseObject(rs);
            if (jsonObject.containsKey("accessToken")) {
                accessToken = jsonObject.getString("accessToken");
            }
        }
        return accessToken;
    }

    @Override
    public List<String> getAllUser() {
        List<String> list = new ArrayList<>();
        String url = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN";
        url = url.replace("ACCESS_TOKEN", this.getAccessToken());
        String rs = RequestUtils.get(url);
        if (rs != null) {
            JSONObject jsonObject = JSON.parseObject(rs);
            if (jsonObject.containsKey("data")) {
                jsonObject = jsonObject.getJSONObject("data");
                JSONArray jsonArray = jsonObject.getJSONArray("openid");
                for (int i = 0; i < jsonArray.size(); i++) {
                    list.add(jsonArray.getString(i));
                }
            }
        }
        return list;
    }
}
