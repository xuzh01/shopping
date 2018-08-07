package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.GoodsCategoryExample;
import cn.edu.jxufe.shopping.mapper.GoodsCategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.log4j.Logger;
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
    private GoodsCategoryDAO goodsCategoryDAO;

    private static Logger log = Logger.getLogger(GoodsCategoryController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "GoodsCategory/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public List<GoodsCategory> findAll() {
        return goodsCategoryDAO.selectByExample(new GoodsCategoryExample());
    }

    @RequestMapping(value = "save")
    public String save() {
        return "GoodsCategory/grid";
    }

    @RequestMapping(value = "insert")
    public String insert() {
        return "GoodsCategory/grid";
    }

    @RequestMapping(value = "delete")
    public String delete() {
        return "GoodsCategory/grid";
    }
}
