package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Orderinfo;
import cn.edu.jxufe.shopping.entity.OrderinfoGoods;
import cn.edu.jxufe.shopping.entity.OrderinfoGoodsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderinfoGoodsDAO继承基类
 */
@Repository
public interface OrderinfoGoodsDAO extends MyBatisBaseDao<OrderinfoGoods, OrderinfoGoods, OrderinfoGoodsExample> {
    public List<OrderinfoGoods> findByCondition(OrderinfoGoods orderinfo);
    public int deleteByPrimaryKey(@Param("recId") int recId);
}