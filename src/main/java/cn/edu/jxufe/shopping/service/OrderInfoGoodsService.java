package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.Orderinfo;
import cn.edu.jxufe.shopping.entity.OrderinfoGoods;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/9.
 */
public interface OrderInfoGoodsService extends PublicService<OrderinfoGoods> {
    public List<OrderinfoGoods> getByOrderId(String orderid);
}
