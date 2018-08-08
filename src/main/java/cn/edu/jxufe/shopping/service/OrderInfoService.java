package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.Orderinfo;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/8.
 */
public interface OrderInfoService {
    public List findAll();

    public int save(Orderinfo orderinfo);

    public int delete(Integer id);

    public int update(Orderinfo orderinfo);
}
