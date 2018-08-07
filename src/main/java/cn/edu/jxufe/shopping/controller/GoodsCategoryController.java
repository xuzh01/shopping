package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.service.GoodsCategoryService;
import cn.edu.jxufe.shopping.utils.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-06 19:52:23
 * @Description gitee:www.gitee.com/cgggitee/
 */
@Controller
@RequestMapping(value = "GoodsCategory")
public class GoodsCategoryController {

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    private static Logger log = Logger.getLogger(GoodsCategoryController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "GoodsCategory/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public List<GoodsCategory> findData(String text) {
        GoodsCategory goodsCategory = new GoodsCategory();
        goodsCategory.setCatName(text);
        if (StringUtils.isNumber(text)) {
            goodsCategory.setIsOffline(Integer.parseInt(text));
        }
        List<GoodsCategory> list = goodsCategoryService.findByCondition(goodsCategory);
        log.info(list);
        return list;
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(GoodsCategory goodsCategory) {
        Message message = new Message();
        goodsCategory.setUpdatedTime(new Date());
        log.info(goodsCategory);
        int num = goodsCategoryService.update(goodsCategory);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("更新商品类型信息成功");
        } else {
            message.setCode(-1);
            message.setMsg("更新商品类型信息失败");
        }
        return message;
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Message insert(GoodsCategory goodsCategory) {
        if (goodsCategory.getIsOffline() == null) goodsCategory.setIsOffline(1);
        log.info(goodsCategory);
        Message message = new Message();
        int num = goodsCategoryService.save(goodsCategory);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("更新商品类型信息成功");
        } else {
            message.setCode(-1);
            message.setMsg("更新商品类型信息失败");
        }
        return message;
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public Message delete(GoodsCategory goodsCategory) {
        log.info(goodsCategory.getCatId());
        Message message = new Message();
        int num = goodsCategoryService.delete(goodsCategory.getCatId());
        if (num > 0) {
            message.setCode(0);
            message.setMsg("更新商品类型信息成功");
        } else {
            message.setCode(-1);
            message.setMsg("更新商品类型信息失败");
        }
        return message;
    }
}
