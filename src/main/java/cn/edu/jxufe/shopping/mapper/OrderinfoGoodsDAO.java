package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.OrderinfoGoods;
import cn.edu.jxufe.shopping.entity.OrderinfoGoodsExample;
import org.springframework.stereotype.Repository;

/**
 * OrderinfoGoodsDAO继承基类
 */
@Repository
public interface OrderinfoGoodsDAO extends MyBatisBaseDao<OrderinfoGoods, OrderinfoGoods, OrderinfoGoodsExample> {
}