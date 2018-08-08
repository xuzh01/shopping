package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.service.imp.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/8.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;

    @PostMapping("/Login")
    public String Login(String username,String password,HttpSession session){
        System.out.println(username+"\t"+password+"\t");
        Admin login = loginService.Login(username, password);
        if (login!=null)
        {
            session.setAttribute("username",login);
            return "ArticleInfo/grid";
        }
        else return null;
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
