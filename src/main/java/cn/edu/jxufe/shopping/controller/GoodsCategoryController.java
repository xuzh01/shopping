package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.service.GoodsCategoryService;
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
    public List<GoodsCategory> findAll() {
        List<GoodsCategory> list = goodsCategoryService.findAll();
        log.info(list);
        return list;
    }

    @RequestMapping(value = "save")
    @ResponseBody
    public int save(GoodsCategory goodsCategory) {
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
