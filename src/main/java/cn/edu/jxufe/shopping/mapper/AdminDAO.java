package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.entity.AdminExample;
import org.springframework.stereotype.Repository;

/**
 * AdminDAO继承基类
 */
@Repository
public interface AdminDAO extends MyBatisBaseDao<Admin, Admin, AdminExample> {
}