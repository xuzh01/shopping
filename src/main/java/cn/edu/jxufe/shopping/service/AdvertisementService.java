package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Advertisement;
import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.Goodsinfo;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 09:53:39
 * @Description gitee:www.gitee.com/cgggitee/
 */
public interface AdvertisementService {
    public List findAll();

    public int save(Advertisement advertisement);

    public int delete(Integer id);

    public int update(Advertisement advertisement);

    public List<Advertisement> findByCondition(Advertisement advertisement);

    public EasyUIData<Advertisement> findByPage(Advertisement advertisement, int page, int row);
}
