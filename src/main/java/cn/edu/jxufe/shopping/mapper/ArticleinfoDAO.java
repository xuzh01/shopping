package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.ArticleinfoExample;
import cn.edu.jxufe.shopping.entity.GoodsComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ArticleinfoDAO继承基类
 */
@Repository
public interface ArticleinfoDAO extends MyBatisBaseDao<Articleinfo, Integer, ArticleinfoExample> {
    public List<Articleinfo> findByCondition(Articleinfo articleinfo);
    List selectByExampleWithBLOBs(Object o);
    public Articleinfo selectByPrimaryKey(Articleinfo articleinfo);
    int updateByPrimaryKeyWithBLOBs(Articleinfo articleinfo);
    Articleinfo selectByPrimaryKey(int i);
    int updateContentById(@Param("id") int id,@Param("content") String content);
}