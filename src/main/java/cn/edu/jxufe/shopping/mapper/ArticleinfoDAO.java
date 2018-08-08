package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.ArticleinfoExample;
import cn.edu.jxufe.shopping.entity.GoodsComment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ArticleinfoDAO继承基类
 */
@Repository
public interface ArticleinfoDAO extends MyBatisBaseDao<Articleinfo, Integer, ArticleinfoExample> {
    public List<Articleinfo> findByCondition(Articleinfo articleinfo);

}