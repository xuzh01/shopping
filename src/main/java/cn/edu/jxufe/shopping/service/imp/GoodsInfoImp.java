package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.GoodsinfoExample;
import cn.edu.jxufe.shopping.mapper.GoodsinfoDAO;
import cn.edu.jxufe.shopping.service.GoodsCategoryService;
import cn.edu.jxufe.shopping.service.GoodsInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 09:54:00
 * @Description gitee:www.gitee.com/cgggitee/
 */

@Service
public class GoodsInfoImp implements GoodsInfoService {

    @Autowired
    private GoodsinfoDAO goodsinfoDAO;

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @Override
    public List findAll() {
        return goodsinfoDAO.selectByExample(new GoodsinfoExample());
    }

    @Override
    public int save(Goodsinfo goodsinfo) {
        GoodsCategory goodsCategory = goodsCategoryService.findById(goodsinfo.getGcId());
        if (goodsCategory != null) goodsinfo.setGcName(goodsCategory.getCatName());
        return goodsinfoDAO.insert(goodsinfo);
    }

    @Override
    public int delete(Integer id) {
        Goodsinfo goodsinfo = new Goodsinfo();
        goodsinfo.setGoodsId(id);
        goodsinfo.setUpdateTime(new Date());
        goodsinfo.setIsDel(1);
        return goodsinfoDAO.updateByPrimaryKeySelective(goodsinfo);
    }

    @Override
    public int update(Goodsinfo goodsinfo) {
        GoodsCategory goodsCategory = goodsCategoryService.findById(goodsinfo.getGcId());
        if (goodsCategory != null) goodsinfo.setGcName(goodsCategory.getCatName());

        GoodsinfoExample goodsCategoryExample = new GoodsinfoExample();
        goodsCategoryExample.createCriteria().andGoodsIdEqualTo(goodsinfo.getGoodsId());
        return goodsinfoDAO.updateByExample(goodsinfo, goodsCategoryExample);
    }

    @Override
    public List findByCondition(Goodsinfo goodsinfo) {
        return goodsinfoDAO.findByCondition(goodsinfo);
    }

    @Override
    public EasyUIData<Goodsinfo> findByPage(Goodsinfo goodsinfo, int page, int row) {
        EasyUIData<Goodsinfo> easyUIData = new EasyUIData();
        PageHelper.startPage(page, row);
        PageInfo pageInfo = new PageInfo(findByCondition(goodsinfo));
        easyUIData.setTotal(pageInfo.getTotal());
        easyUIData.setRows(pageInfo.getList());
        return easyUIData;
    }
}
