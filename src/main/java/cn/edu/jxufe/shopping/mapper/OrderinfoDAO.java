package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.Orderinfo;
import cn.edu.jxufe.shopping.entity.OrderinfoExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderinfoDAO继承基类
 */
@Repository
public interface OrderinfoDAO extends MyBatisBaseDao<Orderinfo, Orderinfo, OrderinfoExample> {
    public List<Orderinfo> findByCondition(Orderinfo orderinfo);
}