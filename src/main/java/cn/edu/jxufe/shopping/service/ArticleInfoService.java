package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.Articleinfo;
import cn.edu.jxufe.shopping.entity.GoodsComment;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/7.
 */
public interface ArticleInfoService {
    public List findAll();

    public int save(Articleinfo articleinfo);

    public int delete(Integer id);

    public int update(Articleinfo articleinfo);
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
