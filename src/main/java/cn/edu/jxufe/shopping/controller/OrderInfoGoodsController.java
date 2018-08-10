package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.OrderinfoGoods;
import cn.edu.jxufe.shopping.service.imp.OrderInfoGoodsImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/9.
 */
@Controller
@RequestMapping("/OrderInfoGoods")
public class OrderInfoGoodsController {
    @Autowired
    private OrderInfoGoodsImpl orderInfoGoodsService;

    private static Logger log = Logger.getLogger(GoodsCommentController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "OrderInfoGoods/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            OrderinfoGoods orderinfo=new OrderinfoGoods();
            orderinfo.setOrderId(easyUIDataPageRequest.getText());
            return orderInfoGoodsService.findByPage(orderinfo, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return new EasyUIData();
        }
    }
    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(OrderinfoGoods orderinfo) {
        Message message = new Message();
        log.info(orderinfo);
        int num = orderInfoGoodsService.update(orderinfo);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("更新订单成功");
        } else {
            message.setCode(-1);
            message.setMsg("更新订单失败");
        }
        return message;
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Message insert(OrderinfoGoods orderinfo) {
        log.info(orderinfo);
        Message message = new Message();
        int num = orderInfoGoodsService.save(orderinfo);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("添加订单成功");
        } else {
            message.setCode(-1);
            message.setMsg("添加订单失败");
        }
        return message;
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public Message delete(OrderinfoGoods orderinfo) {
        log.info(orderinfo.getOrderId());
        Message message = new Message();
        int num = orderInfoGoodsService.delete(orderinfo.getRecId());
        if (num > 0) {
            message.setCode(0);
            message.setMsg("删除订单成功");
        } else {
            message.setCode(-1);
            message.setMsg("删除订单失败");
        }
        return message;
    }

    @RequestMapping("/getByOrderid")
    @ResponseBody
    public List<OrderinfoGoods> getByOrderid(String orderid){
        return orderInfoGoodsService.getByOrderId(orderid);
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
