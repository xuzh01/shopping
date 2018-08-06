package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.GoodsComment;
import cn.edu.jxufe.entity.GoodsCommentExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsCommentDAO继承基类
 */
@Repository
public interface GoodsCommentDAO extends MyBatisBaseDao<GoodsComment, Integer, GoodsCommentExample> {
}