package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.GoodsCategoryExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsCategoryDAO继承基类
 */
@Repository
public interface GoodsCategoryDAO extends MyBatisBaseDao<GoodsCategory, Integer, GoodsCategoryExample> {
}