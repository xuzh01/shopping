package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.*;
import cn.edu.jxufe.shopping.mapper.GoodsCategoryDAO;
import cn.edu.jxufe.shopping.service.GoodsCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        return goodsCategoryDAO.updateByPrimaryKeySelective(goodsCategory);
    }

    @Override
    public List findByCondition(GoodsCategory goodsCategory) {
        return goodsCategoryDAO.findByCondition(goodsCategory);
    }

    @Override
    public EasyUIData<GoodsCategory> findByPage(GoodsCategory goodsCategory, int page, int row) {
        EasyUIData<GoodsCategory> easyUIData = new EasyUIData();
        PageHelper.startPage(page, row);
        PageInfo pageInfo = new PageInfo(findByCondition(goodsCategory));
        easyUIData.setTotal(pageInfo.getTotal());
        easyUIData.setRows(pageInfo.getList());
        return easyUIData;
    }

    @Override
    public GoodsCategory findById(Integer id) {
        GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
        goodsCategoryExample.createCriteria().andCatIdEqualTo(id);
        List<GoodsCategory> list = goodsCategoryDAO.selectByExample(goodsCategoryExample);
        if (list.size() > 0) return list.get(0);
        else return null;
    }
}
