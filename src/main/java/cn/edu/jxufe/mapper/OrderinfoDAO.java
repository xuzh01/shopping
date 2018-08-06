package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Orderinfo;
import cn.edu.jxufe.entity.OrderinfoExample;
import org.springframework.stereotype.Repository;

/**
 * OrderinfoDAO继承基类
 */
@Repository
public interface OrderinfoDAO extends MyBatisBaseDao<Orderinfo, Orderinfo, OrderinfoExample> {
}