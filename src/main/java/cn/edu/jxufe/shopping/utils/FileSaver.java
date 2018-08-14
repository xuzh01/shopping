package cn.edu.jxufe.shopping.utils;

import com.aliyun.oss.OSSClient;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
    public static String save(String imagesPath, HttpServletRequest request, MultipartFile file)  {
        String rs = "-1";

        String endpoint = "oss-cn-beijing.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI98muHU0MBzqi";
        String accessKeySecret = "ulZlJQHRanJ1kHdxYVdUElW90OST7q";
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        // 上传文件流。
        InputStream inputStream = null;
        if (!file.isEmpty()) {
            try {
                inputStream = file.getInputStream();
                String fileName = imagesPath + UUID.randomUUID().toString() + file.getOriginalFilename();
                ossClient.putObject("shoppingimage", fileName, inputStream);
                rs="https://shoppingimage.oss-cn-beijing.aliyuncs.com/"+fileName;
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // 关闭OSSClient。
                ossClient.shutdown();
            }
        }


//            try {
//                String fileName = imagesPath + UUID.randomUUID().toString() + file.getOriginalFilename();
//                String filePath = request.getSession().getServletContext().getRealPath("/") + fileName;
//                file.transferTo(new File(filePath));
//                rs = fileName;
//            } catch (Exception e) {
//                e.getMessage();
//            }
//        }
        return rs;
    }
}
