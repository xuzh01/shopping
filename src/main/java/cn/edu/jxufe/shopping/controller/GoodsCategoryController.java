package cn.edu.jxufe.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-06 19:52:23
 * @Description gitee:www.gitee.com/cgggitee/
 */
@Controller
@RequestMapping(value = "GoodsCategory")
public class GoodsCategoryController {
    @RequestMapping(value = "grid")
    public String grid(){
        return "GoodsCategory/grid";
    }
}
