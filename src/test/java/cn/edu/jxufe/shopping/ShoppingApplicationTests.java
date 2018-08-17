package cn.edu.jxufe.shopping;

import cn.edu.jxufe.shopping.service.WxService;
import org.apache.tomcat.util.descriptor.web.WebXml;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShoppingApplicationTests {

    @Autowired
    private WxService wxService;

    @Test
    public void contextLoads() {
        wxService.sendImgTextMSGToALL("{\n" +
                "    \"touser\":\"OPENID\",\n" +
                "    \"msgtype\":\"news\",\n" +
                "    \"news\":{\n" +
                "        \"articles\": [\n" +
                "         {\n" +
                "             \"title\":\"群发\",\n" +
                "             \"description\":\"Is Really A Happy Day\",\n" +
                "             \"url\":\"URL\",\n" +
                "             \"picurl\":\"PIC_URL\"\n" +
                "         },\n" +
                "         {\n" +
                "             \"title\":\"Happy Day\",\n" +
                "             \"description\":\"Is Really A Happy Day\",\n" +
                "             \"url\":\"URL\",\n" +
                "             \"picurl\":\"PIC_URL\"\n" +
                "         }\n" +
                "         ]\n" +
                "    }\n" +
                "}");
    }

}
