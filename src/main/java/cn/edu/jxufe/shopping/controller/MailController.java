package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.utils.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/9.
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String Sender;

    @PostMapping("/registPassword")
    @ResponseBody
    public String SendMail(String email){
        System.out.println("-----------来到邮件控制器---------");
        MimeMessage message = null;
        String password=PasswordUtil.randomPassword();
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(Sender);  //发送方
            helper.setTo(email);   //发送给谁？
            helper.setSubject("主题：密码重置");
            StringBuffer sb = new StringBuffer();
            sb.append("<h1>密码重置</h1>")
                    .append("密码已重置为<span style='color:#F00'>"+password+"</span>，请尽快<a href='www.baidu.com'>修改您的密码<a>");
            helper.setText(sb.toString(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.send(message);
        return "新密码已发送至您的邮箱，请注意查收";
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
