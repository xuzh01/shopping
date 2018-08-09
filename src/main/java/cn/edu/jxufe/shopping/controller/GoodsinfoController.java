package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.service.GoodsInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 15:07:59
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
@Controller
@RequestMapping(value = "GoodsInfo")
public class GoodsinfoController {
    @Autowired
    private GoodsInfoService goodsInfoService;

    private static Logger log = Logger.getLogger(GoodsinfoController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "GoodsInfo/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            Goodsinfo goodsinfo = new Goodsinfo();
            goodsinfo.setGoodsName(easyUIDataPageRequest.getText());
//        if (StringUtils.isNumber(text)) {
//            GoodsInfo.setIsOffline(Integer.parseInt(text));
//        }
            return goodsInfoService.findByPage(goodsinfo, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return new EasyUIData();
        }
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(Goodsinfo goodsInfo) {
        Message message = new Message();
        try {
            log.info(goodsInfo);
            int num = goodsInfoService.update(goodsInfo);
            if (num > 0) {
                message.setCode(0);
                message.setMsg("更新商品类型信息成功");
            } else {
                message.setCode(-1);
                message.setMsg("更新商品类型信息失败");
            }
            return message;
        } catch (Exception e) {
            log.trace(e.getMessage());
            message.setCode(-1);
            return message;
        }
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Message insert(Goodsinfo goodsInfo) {
        log.info(goodsInfo);
        Message message = new Message();
        try {
            goodsInfo.setGoodsClick(0);
            goodsInfo.setCommentNum(0);
            goodsInfo.setThumbsUpNum(0L);
            goodsInfo.setSalenumNum(0);
            goodsInfo.setGoodsCollectNum(0);
            goodsInfo.setCreateTime(new Date());
            goodsInfo.setUpdateTime(goodsInfo.getCreateTime());
            int num = goodsInfoService.save(goodsInfo);
            if (num > 0) {
                message.setCode(0);
                message.setMsg("更新商品类型信息成功");
            } else {
                message.setCode(-1);
                message.setMsg("更新商品类型信息失败");
            }
            return message;
        } catch (Exception e) {
            log.trace(e.getMessage());
            message.setCode(-1);
            return message;
        }
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public Message delete(Goodsinfo goodsInfo) {
        log.info(goodsInfo.getGoodsId());
        Message message = new Message();
        try {
            int num = goodsInfoService.delete(goodsInfo.getGoodsId());
            if (num > 0) {
                message.setCode(0);
                message.setMsg("删除商品类型信息成功");
            } else {
                message.setCode(-1);
                message.setMsg("删除商品类型信息失败");
            }
            return message;
        } catch (Exception e) {
            log.trace(e.getMessage());
            message.setCode(-1);
            return message;
        }
    }
}
