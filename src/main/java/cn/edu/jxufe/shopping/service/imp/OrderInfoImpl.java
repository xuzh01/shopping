package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.Orderinfo;
import cn.edu.jxufe.shopping.entity.OrderinfoExample;
import cn.edu.jxufe.shopping.mapper.OrderinfoDAO;
import cn.edu.jxufe.shopping.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/8.
 */
@Service
public class OrderInfoImpl implements OrderInfoService {
    @Autowired
    private OrderinfoDAO orderinfoDAO;

    @Override
    public List findAll() {
        return orderinfoDAO.selectByExample(null);
    }

    @Override
    public int save(Orderinfo orderinfo) {
        orderinfo.setCreatedTime(new Date());
        return orderinfoDAO.insert(orderinfo);
    }

    @Override
    public int delete(Integer id) {
        return orderinfoDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Orderinfo orderinfo) {
        orderinfo.setUpdatedTime(new Date());
        OrderinfoExample orderinfoExample = new OrderinfoExample();
        orderinfoExample.createCriteria().andOrderIdEqualTo(orderinfo.getOrderId());
        return orderinfoDAO.updateByExample(orderinfo, orderinfoExample);
    }

    @Override
    public List<Orderinfo> findByCondition(Orderinfo obj) {
        return null;
    }

    @Override
    public EasyUIData<Orderinfo> findByPage(Orderinfo obj, int page, int row) {
        return null;
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
