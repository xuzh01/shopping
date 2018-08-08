package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.GoodsCategoryExample;
import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.entity.GoodsCommentExample;
import cn.edu.jxufe.shopping.mapper.GoodsCommentDAO;
import cn.edu.jxufe.shopping.service.GoodsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/7.
 */
@Service
public class GoodsCommentImpl implements GoodsCommentService {
    @Autowired
    private  GoodsCommentDAO goodsCommentDAO;

    @Override
    public List findAll() {
        return goodsCommentDAO.selectByExample(null);
    }

    @Override
    public int save(GoodsComment comment) {
        return  goodsCommentDAO.insert(comment);
    }

    @Override
    public int delete(Integer id) {
        return goodsCommentDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(GoodsComment comment) {
        comment.setUpdateTime(new Date().getTime());
        GoodsCommentExample goodsCategoryExample = new GoodsCommentExample();
        goodsCategoryExample.createCriteria().andScommIdEqualTo(comment.getScommId());
        return goodsCommentDAO.updateByExample(comment, goodsCategoryExample);
    }

    @Override
    public List<GoodsComment> findByCondition(GoodsComment obj) {
        return null;
    }

    @Override
    public EasyUIData<GoodsComment> findByPage(GoodsComment obj, int page, int row) {
        return null;
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
