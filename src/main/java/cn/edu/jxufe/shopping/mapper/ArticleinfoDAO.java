package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.ArticleinfoExample;
import org.springframework.stereotype.Repository;

/**
 * ArticleinfoDAO继承基类
 */
@Repository
public interface ArticleinfoDAO extends MyBatisBaseDao<Articleinfo, Integer, ArticleinfoExample> {
}