package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.ArticleinfoExample;
import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.mapper.ArticleinfoDAO;
import cn.edu.jxufe.shopping.service.ArticleInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Override
    public List findAll() {
        return articleinfoDAO.selectByExampleWithBLOBs(null);
    }

    @Override
    public int save(Articleinfo articleinfo) {
        articleinfo.setCreateTime(new Date());
        //articleinfo.setArticleShow(true);
        return articleinfoDAO.insert(articleinfo);
    }

    @Override
    public int delete(Integer id) {
        return  articleinfoDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Articleinfo articleinfo) {
        articleinfo.setUpdateTime(new Date());
        ArticleinfoExample articleinfoExample=new ArticleinfoExample();
        articleinfoExample.createCriteria().andArticleIdEqualTo(articleinfo.getArticleId());
        return articleinfoDAO.updateByExample(articleinfo,articleinfoExample);
    }

    @Override
    public List<Articleinfo> findByCondition(Articleinfo obj) {
        return articleinfoDAO.findByCondition(obj);
        //return articleinfoDAO.selectByExampleWithBLOBs(null);
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
