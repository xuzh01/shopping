package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.service.ArticleInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/7.
 */
@Controller
@RequestMapping("ArticleInfo")
public class ArticleInfoController {
    @Autowired
    private ArticleInfoService articleInfoService;

    private static Logger log = Logger.getLogger(ArticleInfoController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "ArticleInfo/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            Articleinfo articleinfo=new Articleinfo();
            articleinfo.setArticleContent(easyUIDataPageRequest.getText());
            return articleInfoService.findByPage(articleinfo, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return new EasyUIData();
        }
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(Articleinfo articleinfo) {
        Message message = new Message();
        log.info(articleinfo);
        int num = articleInfoService.update(articleinfo);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("更新文章成功");
        } else {
            message.setCode(-1);
            message.setMsg("更新文章失败");
        }
        return message;
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public Message insert(Articleinfo articleinfo) {
        log.info(articleinfo);
        Message message = new Message();
        int num = articleInfoService.save(articleinfo);
        if (num > 0) {
            message.setCode(0);
            message.setMsg("添加文章成功");
        } else {
            message.setCode(-1);
            message.setMsg("添加文章失败");
        }
        return message;
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public Message delete(Articleinfo articleinfo) {
        log.info(articleinfo.getArticleId());
        Message message = new Message();
        int num = articleInfoService.delete(articleinfo.getArticleId());
        if (num > 0) {
            message.setCode(0);
            message.setMsg("删除文章成功");
        } else {
            message.setCode(-1);
            message.setMsg("删除文章失败");
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
