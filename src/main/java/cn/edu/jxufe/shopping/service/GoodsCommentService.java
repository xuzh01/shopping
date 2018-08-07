package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.entity.Goodsinfo;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/7.
 */
public interface GoodsCommentService {
    public List findAll();

    public int save(GoodsComment comment);

    public int delete(Integer id);

    public int update(GoodsComment comment);
}
