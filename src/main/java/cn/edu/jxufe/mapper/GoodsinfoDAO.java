package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Goodsinfo;
import cn.edu.jxufe.entity.GoodsinfoExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsinfoDAO继承基类
 */
@Repository
public interface GoodsinfoDAO extends MyBatisBaseDao<Goodsinfo, Integer, GoodsinfoExample> {
}