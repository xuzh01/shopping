package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.entity.GoodsCommentExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GoodsCommentDAO继承基类
 */
@Repository
public interface GoodsCommentDAO extends MyBatisBaseDao<GoodsComment, Integer, GoodsCommentExample> {
    public List<GoodsComment> findByCondition(GoodsComment goodsComment);
}