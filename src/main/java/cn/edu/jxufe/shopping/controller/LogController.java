package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.entity.Loginfo;
import cn.edu.jxufe.shopping.service.imp.LogInfoServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/17.
 */
@Controller
@RequestMapping("/Log")
public class LogController {

    @Autowired
    private LogInfoServiceImpl logServiceImpl;

    private static Logger log = Logger.getLogger(LogController.class);


    @RequestMapping(value = "grid")
    public String grid() {
        return "Log/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            Loginfo loginfo=new Loginfo();
            try{
                int i = Integer.parseInt(easyUIDataPageRequest.getText());
                loginfo.setAdminId(i);
            }catch (Exception e){
                e.printStackTrace();
            }
            return logServiceImpl.findByPage(loginfo, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return new EasyUIData();
        }
    }
}

/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
