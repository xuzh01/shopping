package cn.edu.jxufe.shopping.controller;

import cn.edu.jxufe.shopping.bean.Message;
import cn.edu.jxufe.shopping.utils.FileSaver;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-10 16:15:38
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
@Controller
@RequestMapping("file")
public class FileController {
    /**
     * @param request    接收HttpServletRequest对象数据
     * @param uploadFile 接收上传文件的MultipartFile对象数据
     * @return 将图像保存处理结果Message对象以JSON格式返回
     */
    @RequestMapping(value = "saveImg", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String saveHeadImg(HttpServletRequest request, @RequestParam("filePathName") MultipartFile uploadFile) {
        return FileSaver.save("upload/", request, uploadFile);
    }
}
