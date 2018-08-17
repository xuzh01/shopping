package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.Admin;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-08 15:00:53
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public interface AdminService extends PublicService<Admin> {
    Admin findById(Integer id);
}
