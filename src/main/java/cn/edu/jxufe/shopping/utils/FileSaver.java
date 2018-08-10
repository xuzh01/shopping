package cn.edu.jxufe.shopping.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-10 16:15:57
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class FileSaver {
    /**
     * @param imagesPath 图片路径
     * @param request    请求
     * @param file       文件
     * @return 运行消息结果
     */
    public static String save(String imagesPath, HttpServletRequest request, MultipartFile file) {
        String rs = "-1";
        if (!file.isEmpty()) {
            try {
                String fileName = imagesPath + UUID.randomUUID().toString() + file.getOriginalFilename();
                String filePath = request.getSession().getServletContext().getRealPath("/") + fileName;
                file.transferTo(new File(filePath));
                rs = fileName;
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return rs;
    }
}
