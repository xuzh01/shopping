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

    @RequestMapping(value = "save")
    @ResponseBody
    public int save(GoodsCategory goodsCategory) {
        Message message = new Message();
        log.info(goodsCategory);
        return goodsCategoryService.save(goodsCategory);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public int update(GoodsCategory goodsCategory) {
        log.info(goodsCategory);
        return goodsCategoryService.update(goodsCategory);
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public int insert(GoodsCategory goodsCategory) {
        log.info(goodsCategory);
        return goodsCategoryService.save(goodsCategory);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public int delete(Integer id) {
        log.info(id);
        return goodsCategoryService.delete(id);
    }
}
