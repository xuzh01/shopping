package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.entity.Advertisement;
import cn.edu.jxufe.shopping.entity.AdvertisementExample;
import cn.edu.jxufe.shopping.entity.GoodsCategory;
import cn.edu.jxufe.shopping.entity.GoodsCategoryExample;
import cn.edu.jxufe.shopping.mapper.AdvertisementDAO;
import cn.edu.jxufe.shopping.mapper.GoodsCategoryDAO;
import cn.edu.jxufe.shopping.service.AdvertisementService;
import cn.edu.jxufe.shopping.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 09:54:00
 * @Description gitee:www.gitee.com/cgggitee/
 */

@Service
public class AdvertisementImp implements AdvertisementService {

    @Autowired
    private AdvertisementDAO advertisementDAO;

    @Override
    public List findAll() {
        return advertisementDAO.selectByExample(new AdvertisementExample());
    }

    @Override
    public int save(Advertisement advertisement) {
        return advertisementDAO.insert(advertisement);
    }

    @Override
    public int delete(Integer id) {
        return advertisementDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Advertisement advertisement) {
        AdvertisementExample advertisementExample = new AdvertisementExample();
        advertisementExample.createCriteria().andAdvIdEqualTo(advertisement.getAdvId());
        return advertisementDAO.updateByExample(advertisement, advertisementExample);
    }

    @Override
    public List findByCondition(Advertisement advertisement) {
        return advertisementDAO.findByCondition(advertisement);
    }
}
