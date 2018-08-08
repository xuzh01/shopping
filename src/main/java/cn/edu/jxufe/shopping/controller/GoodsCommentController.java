package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.Advertisement;
import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.mapper.GoodsCommentDAO;
import cn.edu.jxufe.shopping.service.GoodsCommentService;
import cn.edu.jxufe.shopping.service.GoodsInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/7.
 */
@Controller
@RequestMapping("/GoodsComment")
public class GoodsCommentController {
    @Autowired
    private GoodsCommentService goodsCommentService;

    private static Logger log = Logger.getLogger(GoodsCommentController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "GoodsComment/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            GoodsComment goodsComment=new GoodsComment();
            goodsComment.setScommContent(easyUIDataPageRequest.getText());
            return goodsCommentService.findByPage(goodsComment, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return new EasyUIData();
        }
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(GoodsComment goodsComment) {
        Message message = new Message();
        log.info(goodsComment);
        int num = goodsCommentService.update(goodsComment);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("更新商品评论成功");
        } else {
            message.setCode(-1);
            message.setMsg("更新商品评论失败");
        }
        return message;
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Message insert(GoodsComment goodsComment) {
        log.info(goodsComment);
        Message message = new Message();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sDate = simpleDateFormat.format(new Date());
        goodsComment.setScommTime(sDate);
        goodsComment.setCreateTime(new Date().getTime());
        int num = goodsCommentService.save(goodsComment);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("添加商品评论成功");
        } else {
            message.setCode(-1);
            message.setMsg("添加商品评论失败");
        }
        return message;
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public Message delete(GoodsComment goodsComment) {
        log.info(goodsComment.getScommId());
        Message message = new Message();
        int num = goodsCommentService.delete(goodsComment.getScommId());
        if (num > 0) {
            message.setCode(0);
            message.setMsg("删除商品评论成功");
        } else {
            message.setCode(-1);
            message.setMsg("删除商品评论失败");
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
