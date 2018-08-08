package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.Goodsinfo;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 09:53:39
 * @Description gitee:www.gitee.com/cgggitee/
 */
public interface GoodsCategoryService {
    public List findAll();

    public int save(GoodsCategory goodsCategory);

    public int delete(Integer id);

    public int update(GoodsCategory goodsCategory);

    public List<GoodsCategory> findByCondition(GoodsCategory goodsCategory);

    public EasyUIData<GoodsCategory> findByPage(GoodsCategory goodsCategory, int page, int row);
}
