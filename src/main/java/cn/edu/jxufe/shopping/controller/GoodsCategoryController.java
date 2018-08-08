package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
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
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            GoodsCategory goodsCategory = new GoodsCategory();
            goodsCategory.setCatName(easyUIDataPageRequest.getText());
            if (StringUtils.isNumber(easyUIDataPageRequest.getText())) {
                goodsCategory.setIsOffline(Integer.parseInt(easyUIDataPageRequest.getText()));
            }
            return goodsCategoryService.findByPage(goodsCategory, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(GoodsCategory goodsCategory) {
        Message message = new Message();
        try {
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
        } catch (Exception e) {
            log.trace(e.getMessage());
            message.setCode(-1);
            return message;
        }
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Message insert(GoodsCategory goodsCategory) {
        if (goodsCategory.getIsOffline() == null) goodsCategory.setIsOffline(1);
        log.info(goodsCategory);
        Message message = new Message();
        try {
            int num = goodsCategoryService.save(goodsCategory);
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
    public Message delete(GoodsCategory goodsCategory) {
        log.info(goodsCategory.getCatId());
        Message message = new Message();
        try {
            int num = goodsCategoryService.delete(goodsCategory.getCatId());
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
}
