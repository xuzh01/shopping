package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.entity.AdminExample;
import cn.edu.jxufe.shopping.entity.Memberinfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AdminDAO继承基类
 */
@Repository
public interface AdminDAO extends MyBatisBaseDao<Admin, Integer, AdminExample> {
    public List<Admin> findByCondition(Admin admin);
}