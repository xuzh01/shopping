package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.GoodsinfoExample;
import cn.edu.jxufe.shopping.mapper.GoodsinfoDAO;
import cn.edu.jxufe.shopping.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public List findAll() {
        return goodsinfoDAO.selectByExample(new GoodsinfoExample());
    }

    @Override
    public int save(Goodsinfo goodsinfo) {
        return goodsinfoDAO.insert(goodsinfo);
    }

    @Override
    public int delete(Integer id) {
        return goodsinfoDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Goodsinfo goodsinfo) {
        GoodsinfoExample goodsCategoryExample = new GoodsinfoExample();
        goodsCategoryExample.createCriteria().andGoodsIdEqualTo(goodsinfo.getGoodsId());
        return goodsinfoDAO.updateByExample(goodsinfo, goodsCategoryExample);
    }
    @Override
    public List findByCondition(Goodsinfo goodsinfo) {
        return goodsinfoDAO.findByCondition(goodsinfo);
    }
}
