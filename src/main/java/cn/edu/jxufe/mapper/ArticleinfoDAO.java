package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Articleinfo;
import cn.edu.jxufe.entity.ArticleinfoExample;
import org.springframework.stereotype.Repository;

/**
 * ArticleinfoDAO继承基类
 */
@Repository
public interface ArticleinfoDAO extends MyBatisBaseDao<Articleinfo, Integer, ArticleinfoExample> {
}