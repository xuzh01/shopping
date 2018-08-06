package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.GoodsCategory;
import cn.edu.jxufe.entity.GoodsCategoryExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsCategoryDAO继承基类
 */
@Repository
public interface GoodsCategoryDAO extends MyBatisBaseDao<GoodsCategory, Integer, GoodsCategoryExample> {
}