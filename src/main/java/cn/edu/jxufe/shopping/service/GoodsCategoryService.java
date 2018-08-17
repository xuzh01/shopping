package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.Memberinfo;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 09:53:39
 * @Description gitee:www.gitee.com/cgggitee/
 */
public interface GoodsCategoryService extends PublicService<GoodsCategory> {
    GoodsCategory findById(Integer id);
}
