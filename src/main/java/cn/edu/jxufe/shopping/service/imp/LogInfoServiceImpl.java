package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import cn.edu.jxufe.shopping.entity.Loginfo;
import cn.edu.jxufe.shopping.mapper.LoginfoDAO;
import cn.edu.jxufe.shopping.service.LogInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/17.
 */

/*
* 日志操作逻辑
* */
@Service
public class LogInfoServiceImpl implements LogInfoService {

    @Autowired
    private LoginfoDAO logDAO;


    @Override
    public List findAll() {
        return null;
    }

    @Override
    public int save(Loginfo obj) {
        return logDAO.insert(obj);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public int update(Loginfo obj) {
        return 0;
    }

    @Override
    public List<Loginfo> findByCondition(Loginfo obj) {
        return logDAO.findByCondition(obj);
    }

    @Override
    public EasyUIData<Loginfo> findByPage(Loginfo obj, int page, int row) {
        EasyUIData<Loginfo> easyUIData = new EasyUIData();
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
