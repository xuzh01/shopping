package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.entity.AdminExample;
import cn.edu.jxufe.shopping.mapper.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/10.
 */
@Controller
@RequestMapping("/reset")
public class ResetPwdController {
    @Autowired
    private AdminDAO adminDAO;

    @PostMapping("/resetPwd")
    public void resetPwd(String password, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        AdminExample adminExample=new AdminExample();
        Admin admin= (Admin)session.getAttribute("username");
        admin.setAdminPassword(password);
        admin.setUpdatedTime(new Date());
        adminExample.createCriteria().andAdminIdEqualTo(admin.getAdminId());
        adminDAO.updateByExample(admin,adminExample);
        try {
            session.invalidate();
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
            System.out.println(basePath);
            response.sendRedirect(basePath);
        } catch (IOException e) {
            e.printStackTrace();
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
