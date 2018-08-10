package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Orderinfo;
import cn.edu.jxufe.shopping.entity.OrderinfoGoods;
import cn.edu.jxufe.shopping.entity.OrderinfoGoodsExample;
import cn.edu.jxufe.shopping.mapper.OrderinfoGoodsDAO;
import cn.edu.jxufe.shopping.service.OrderInfoGoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/9.
 */
@Service
public class OrderInfoGoodsImpl implements OrderInfoGoodsService {
    @Autowired
    private OrderinfoGoodsDAO goodsDAO;

    @Override
    public List<OrderinfoGoods> findAll() {
        return goodsDAO.selectByExample(null);
    }

    @Override
    public int save(OrderinfoGoods obj) {
        obj.setCreatedTime(new Date());
        return goodsDAO.insert(obj);
    }

    @Override
    public int delete(Integer id) {
        return goodsDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(OrderinfoGoods obj) {
        obj.setUpdatedTime(new Date());
        OrderinfoGoodsExample example=new OrderinfoGoodsExample();
        example.createCriteria().andRecIdEqualTo(obj.getRecId());
        return goodsDAO.updateByExampleSelective(obj,example);
    }

    @Override
    public List<OrderinfoGoods> findByCondition(OrderinfoGoods obj) {
        return goodsDAO.findByCondition(obj);
    }

    @Override
    public EasyUIData<OrderinfoGoods> findByPage(OrderinfoGoods obj, int page, int row) {
        EasyUIData<OrderinfoGoods> easyUIData = new EasyUIData();
        PageHelper.startPage(page, row);
        PageInfo pageInfo = new PageInfo(findByCondition(obj));
        easyUIData.setTotal(pageInfo.getTotal());
        easyUIData.setRows(pageInfo.getList());
        return easyUIData;
    }

    @Override
    public List<OrderinfoGoods> getByOrderId(String orderid) {
        OrderinfoGoodsExample example=new OrderinfoGoodsExample();
        example.createCriteria().andOrderIdEqualTo(orderid);
        return goodsDAO.selectByExample(example);
    }
}

/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
