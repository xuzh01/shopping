package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.bean.EasyUIDataPageRequest;
import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.entity.Advertisement;
import cn.edu.jxufe.shopping.service.AdvertisementService;
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
@RequestMapping(value = "Advertisement")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    private static Logger log = Logger.getLogger(AdvertisementController.class);

    @RequestMapping(value = "grid")
    public String grid() {
        return "Advertisement/grid";
    }

    @RequestMapping(value = "getData")
    @ResponseBody
    public EasyUIData findData(EasyUIDataPageRequest easyUIDataPageRequest) {
        try {
            log.info("分页请求" + easyUIDataPageRequest);
            Advertisement advertisement = new Advertisement();
            advertisement.setAdvTitle(easyUIDataPageRequest.getText());
            return advertisementService.findByPage(advertisement, easyUIDataPageRequest.getPage(), easyUIDataPageRequest.getRows());
        } catch (Exception e) {
            log.trace(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Message update(Advertisement advertisement) {
        Message message = new Message();
        try {
            advertisement.setAdvUpdatetime(new Date());
            log.info(advertisement);
            int num = advertisementService.update(advertisement);
            if (num > 0) {
                message.setCode(0);
                message.setMsg("更新广告信息成功");
            } else {
                message.setCode(-1);
                message.setMsg("更新广告信息失败");
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
    public Message insert(Advertisement advertisement) {
        log.info(advertisement);
        Message message = new Message();
        try {
            int num = advertisementService.save(advertisement);
            if (num > 0) {
                message.setCode(0);
                message.setMsg("更新广告信息成功");
            } else {
                message.setCode(-1);
                message.setMsg("更新广告信息失败");
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
    public Message delete(Advertisement advertisement) {
        log.info(advertisement.getAdvId());
        Message message = new Message();
        try {
            int num = advertisementService.delete(advertisement.getAdvId());
            if (num > 0) {
                message.setCode(0);
                message.setMsg("更新广告信息成功");
            } else {
                message.setCode(-1);
                message.setMsg("更新广告信息失败");
            }
            return message;
        } catch (Exception e) {
            log.trace(e.getMessage());
            message.setCode(-1);
            return message;
        }
    }
}
