package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.Goodsinfo;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 09:53:39
 * @Description gitee:www.gitee.com/cgggitee/
 */
public interface GoodsInfoService {
    public List findAll();

    public int save(Goodsinfo goodsinfo);

    public int delete(Integer id);

    public int update(Goodsinfo goodsinfo);

    public List<Goodsinfo> findByCondition(Goodsinfo goodsinfo);
}