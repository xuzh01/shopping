package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.GoodsinfoExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsinfoDAO继承基类
 */
@Repository
public interface GoodsinfoDAO extends MyBatisBaseDao<Goodsinfo, Integer, GoodsinfoExample> {
}