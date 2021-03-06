package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.entity.Loginfo;
import cn.edu.jxufe.shopping.service.imp.LogInfoServiceImpl;
import cn.edu.jxufe.shopping.service.imp.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/8.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;
    @Autowired
    private LogInfoServiceImpl logService;


    @PostMapping("/Login")
    @ResponseBody
    public String Login(String username, String password, HttpSession session,HttpServletRequest request) {
        Admin login = loginService.Login(username, password);
        if (login != null) {
            session.setAttribute("username", login);
            login.setAdminLoginNum(login.getAdminLoginNum() + 1);
            login.setAdminLoginTime(new Date());
            loginService.update(login);
            String ipAddr = request.getRemoteAddr();
            System.out.println("ip=======>"+ipAddr);
            Loginfo log=new Loginfo();
            log.setAdminId(login.getAdminId());
            log.setAdminName(login.getAdminName());
            log.setLoginIp(ipAddr);
            log.setLoginTime(new Date());
            logService.save(log);
            return "登录成功！！！";
        } else return "";
    }

    @RequestMapping("Logout")
    public void reset(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        try {
            session.invalidate();
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
            System.out.println(basePath);
            response.sendRedirect(basePath);
        } catch (Exception e) {

        }
    }

    @RequestMapping("/reset")
    public String reset() {
        return "Manage/grid";
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
