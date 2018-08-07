package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.GoodsCategoryExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GoodsCategoryDAO继承基类
 */
@Repository
public interface GoodsCategoryDAO extends MyBatisBaseDao<GoodsCategory, Integer, GoodsCategoryExample> {
    public List<GoodsCategory> findByCondition(GoodsCategory goodsCategory);
}