package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.ArticleinfoExample;
import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.mapper.ArticleinfoDAO;
import cn.edu.jxufe.shopping.service.ArticleInfoService;
import cn.edu.jxufe.shopping.service.WxService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/7.
 */
@Service
public class ArticleInfoImpl implements ArticleInfoService {
    @Autowired
    private ArticleinfoDAO articleinfoDAO;

    @Autowired
    private WxService wxService;

    @Override
    public List findAll() {
        return articleinfoDAO.selectByExampleWithBLOBs(null);
    }

    private String jsonStr = "{\n" +
            "    \"touser\":\"OPENID\",\n" +
            "    \"msgtype\":\"news\",\n" +
            "    \"news\":{\n" +
            "        \"articles\": [\n" +
            "         {\n" +
            "             \"title\":\"TITLE\",\n" +
            "             \"description\":\"DESCRIPTION\",\n" +
            "             \"url\":\"URL\",\n" +
            "             \"picurl\":\"PIC_URL\"\n" +
            "         }\n" +
            "         ]\n" +
            "    }\n" +
            "}";


    @Override
    public int save(Articleinfo articleinfo) {
        articleinfo.setCreateTime(new Date());
        //articleinfo.setArticleShow(true);
        this.pushMSG(articleinfo);
        return articleinfoDAO.insert(articleinfo);
    }

    @Override
    public int delete(Integer id) {
        return articleinfoDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Articleinfo articleinfo) {
        articleinfo.setUpdateTime(new Date());
        ArticleinfoExample articleinfoExample = new ArticleinfoExample();
        articleinfoExample.createCriteria().andArticleIdEqualTo(articleinfo.getArticleId());

        this.pushMSG(articleinfo);
        return articleinfoDAO.updateByExample(articleinfo, articleinfoExample);
    }

    @Override
    public List<Articleinfo> findByCondition(Articleinfo obj) {
        return articleinfoDAO.findByCondition(obj);
    }

    @Override
    public EasyUIData<Articleinfo> findByPage(Articleinfo obj, int page, int row) {
        EasyUIData<Articleinfo> easyUIData = new EasyUIData();
        PageHelper.startPage(page, row);
        PageInfo pageInfo = new PageInfo(findByCondition(obj));
        easyUIData.setTotal(pageInfo.getTotal());
        easyUIData.setRows(pageInfo.getList());
        return easyUIData;
    }

    private void pushMSG(Articleinfo articleinfo) {
        jsonStr = jsonStr.replace("PIC_URL", articleinfo.getArticlePicUrl());
        jsonStr = jsonStr.replace("URL", articleinfo.getArticlePicUrl());
        jsonStr = jsonStr.replace("TITLE", articleinfo.getArticleTitle());
        jsonStr = jsonStr.replace("DESCRIPTION", articleinfo.getArticleContent());
        wxService.sendImgTextMSGToALL(jsonStr);
    }


    @Override
    public Articleinfo getById(int id) {
        return articleinfoDAO.selectByPrimaryKey(id);
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
