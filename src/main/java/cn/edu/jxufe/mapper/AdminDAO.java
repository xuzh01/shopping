package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Admin;
import cn.edu.jxufe.entity.AdminExample;
import org.springframework.stereotype.Repository;

/**
 * AdminDAO继承基类
 */
@Repository
public interface AdminDAO extends MyBatisBaseDao<Admin, Admin, AdminExample> {
}