package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.entity.AdminExample;
import cn.edu.jxufe.shopping.mapper.AdminDAO;
import cn.edu.jxufe.shopping.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/8.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AdminDAO adminDAO;
    @Override
    public boolean Login(String username, String password) {
        AdminExample adminExample=new AdminExample();
        adminExample.createCriteria().andAdminNameEqualTo(username).andAdminPasswordEqualTo(password);
        List<Admin> a= adminDAO.selectByExample(adminExample);
        System.out.println(a);
        if (a.size()!=0) return true;
        else return false;
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
