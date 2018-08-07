package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.GoodsCategoryExample;
import cn.edu.jxufe.shopping.mapper.GoodsCategoryDAO;
import cn.edu.jxufe.shopping.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 09:54:00
 * @Description gitee:www.gitee.com/cgggitee/
 */

@Service
public class GoodsCategoryImp implements GoodsCategoryService {

    @Autowired
    private GoodsCategoryDAO goodsCategoryDAO;

    @Override
    public List findAll() {
        return goodsCategoryDAO.selectByExample(new GoodsCategoryExample());
    }

    @Override
    public int save(GoodsCategory goodsCategory) {
        return goodsCategoryDAO.insert(goodsCategory);
    }

    @Override
    public int delete(Integer id) {
        return goodsCategoryDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(GoodsCategory goodsCategory) {
        GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
        goodsCategoryExample.createCriteria().andCatIdEqualTo(goodsCategory.getCatId());
        return goodsCategoryDAO.updateByExample(goodsCategory, goodsCategoryExample);
    }
}
