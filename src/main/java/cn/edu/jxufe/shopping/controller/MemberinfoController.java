package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.Memberinfo;
import cn.edu.jxufe.shopping.service.GoodsInfoService;
import cn.edu.jxufe.shopping.service.MemberInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-08 14:51:50
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */

@Controller
@RequestMapping(value = "Memberinfo")
public class MemberinfoController {
    @Autowired
    private MemberInfoService memberInfoService;

    private static Logger log = Logger.getLogger(GoodsinfoController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "Memberinfo/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            Memberinfo memberinfo = new Memberinfo();
            memberinfo.setMemberName(easyUIDataPageRequest.getText());
//        if (StringUtils.isNumber(text)) {
//            GoodsInfo.setIsOffline(Integer.parseInt(text));
//        }
            return memberInfoService.findByPage(memberinfo, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return new EasyUIData();
        }
    }

    @RequestMapping(value = "getAll")
    @ResponseBody
    public List findAll() {
        try {
            return memberInfoService.findAll();
        } catch (Exception e) {
            log.trace(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "byId")
    @ResponseBody
    public Memberinfo findDataById(Integer id) {
        try {
            log.info(id);
            return memberInfoService.findById(id);
        } catch (Exception e) {
            log.trace(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(Memberinfo memberinfo) {
        Message message = new Message();
        try {
            log.info(memberinfo);
            int num = memberInfoService.update(memberinfo);
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
    public Message insert(Memberinfo memberinfo) {
        log.info(memberinfo);
        Message message = new Message();
        try {
            int num = memberInfoService.save(memberinfo);
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
    public Message delete(Memberinfo memberinfo) {
        log.info(memberinfo.getMemberId());
        Message message = new Message();
        try {
            int num = memberInfoService.delete(memberinfo.getMemberId());
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
