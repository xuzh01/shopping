package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.Orderinfo;
import cn.edu.jxufe.shopping.service.OrderInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/8.
 */
@Controller
@RequestMapping("/OrderInfo")
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;

    private static Logger log = Logger.getLogger(GoodsCommentController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "OrderInfo/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public List<Orderinfo> findData(String text) {
        List<Orderinfo> list = orderInfoService.findAll();
        log.info(list);
        return list;
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(Orderinfo orderinfo) {
        Message message = new Message();
        log.info(orderinfo);
        int num = orderInfoService.update(orderinfo);
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
    public Message insert(Orderinfo orderinfo) {
        log.info(orderinfo);
        Message message = new Message();
        int num = orderInfoService.save(orderinfo);
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
    public Message delete(Orderinfo orderinfo) {
        log.info(orderinfo.getOrderId());
        Message message = new Message();
        int num = orderInfoService.delete(orderinfo.getOrderId());
        if (num > 0) {
            message.setCode(0);
            message.setMsg("删除订单成功");
        } else {
            message.setCode(-1);
            message.setMsg("删除订单失败");
        }
        return message;
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
