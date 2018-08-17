package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.service.AdminService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-08 14:51:50
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */

@Controller
@RequestMapping(value = "Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    private static Logger log = Logger.getLogger(GoodsinfoController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "Admin/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            Admin admin = new Admin();
            admin.setAdminName(easyUIDataPageRequest.getText());
//        if (StringUtils.isNumber(text)) {
//            GoodsInfo.setIsOffline(Integer.parseInt(text));
//        }
            return adminService.findByPage(admin, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return new EasyUIData();
        }
    }

    @RequestMapping(value = "getAll")
    @ResponseBody
    public List findAll() {
        try {
            return adminService.findAll();
        } catch (Exception e) {
            log.trace(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "byId")
    @ResponseBody
    public Admin findDataById(Integer id) {
        try {
            log.info(id);
            return adminService.findById(id);
        } catch (Exception e) {
            log.trace(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(Admin admin, HttpSession sess) {
        admin.setUpdatedTime(new Date());
        Message message = new Message();
        Admin cur = (Admin) sess.getAttribute("username");
        if (StringUtils.isEmpty(admin.getAdminPassword())) admin.setAdminPassword(cur.getAdminPassword());
        int num = 0;
        try {
            log.info(admin);
            if (cur == null) {
                message.setCode(-1);
                message.setMsg("当前用户未登录");
                return message;
            } else {
                if (cur.getAdminIsSuper().equals(1)) {//超级管理员
                    num = adminService.update(admin);
                } else {
                    if (!admin.getAdminId().equals(cur.getAdminId()) || !admin.getAdminIsSuper().equals(cur.getAdminIsSuper())) {
                        message.setCode(-1);
                        message.setMsg("当前管理员权限限制，只能更改自己的信息且不能自主提升权限");
                        return message;
                    } else {
                        num = adminService.update(admin);
                    }
                }
                if (num > 0) {
                    message.setCode(0);
                    message.setMsg("更新管理员信息成功");
                } else {
                    message.setCode(-1);
                    message.setMsg("更新管理员信息失败");
                }
            }
            sess.setAttribute("username", admin);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            message.setCode(-1);
            message.setMsg("更新失败");
        }
        return message;
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Message insert(Admin admin, HttpSession sess) {
        log.info(admin);
        admin.setCreatedTime(new Date());
        admin.setAdminLoginNum(0);
        Message message = new Message();
        Admin cur = (Admin) sess.getAttribute("username");
        int num = 0;
        try {
            log.info(admin);
            if (cur == null) {
                message.setCode(-1);
                message.setMsg("当前用户未登录");
                return message;
            } else {
                if (cur.getAdminIsSuper().equals(1)) {//超级管理员
                    num = adminService.save(admin);
                } else {
                    if (!admin.getAdminId().equals(cur.getAdminId())) {
                        message.setCode(-1);
                        message.setMsg("当前管理员权限限制，只能更改自己的信息");
                        return message;
                    } else num = adminService.save(admin);
                }
                if (num > 0) {
                    message.setCode(0);
                    message.setMsg("增加管理员信息成功");
                } else {
                    message.setCode(-1);
                    message.setMsg("增加管理员信息失败");
                }
            }
        } catch (Exception e) {
            log.trace(e.getMessage());
            message.setCode(-1);
            message.setMsg("增加失败");
        }
        return message;
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public Message delete(Admin admin, HttpSession sess) {
        log.info(admin.getAdminId());

        log.info(admin);
        Message message = new Message();
        Admin cur = (Admin) sess.getAttribute("username");
        int num = 0;
        try {
            log.info(admin);
            if (cur == null) {
                message.setCode(-1);
                message.setMsg("当前用户未登录");
                return message;
            } else {
                if (cur.getAdminIsSuper().equals(1)) {//超级管理员
                    num = adminService.delete(admin.getAdminId());
                } else {
                    if (!admin.getAdminId().equals(cur.getAdminId())) {
                        message.setCode(-1);
                        message.setMsg("当前管理员权限限制，只能更改自己的信息");
                        return message;
                    } else num = adminService.delete(admin.getAdminId());
                }
                if (num > 0) {
                    message.setCode(0);
                    message.setMsg("删除管理员信息成功");
                } else {
                    message.setCode(-1);
                    message.setMsg("删除管理员信息失败");
                }
            }
        } catch (Exception e) {
            log.trace(e.getMessage());
            message.setCode(-1);
            message.setMsg("删除失败");
        }
        return message;
    }
}
