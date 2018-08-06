package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Orderinfo;
import cn.edu.jxufe.shopping.entity.OrderinfoExample;
import org.springframework.stereotype.Repository;

/**
 * OrderinfoDAO继承基类
 */
@Repository
public interface OrderinfoDAO extends MyBatisBaseDao<Orderinfo, Orderinfo, OrderinfoExample> {
}