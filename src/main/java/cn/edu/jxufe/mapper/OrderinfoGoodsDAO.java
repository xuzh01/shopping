package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.OrderinfoGoods;
import cn.edu.jxufe.entity.OrderinfoGoodsExample;
import org.springframework.stereotype.Repository;

/**
 * OrderinfoGoodsDAO继承基类
 */
@Repository
public interface OrderinfoGoodsDAO extends MyBatisBaseDao<OrderinfoGoods, OrderinfoGoods, OrderinfoGoodsExample> {
}