package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.*;
import cn.edu.jxufe.shopping.mapper.AdvertisementDAO;
import cn.edu.jxufe.shopping.mapper.GoodsCategoryDAO;
import cn.edu.jxufe.shopping.service.AdvertisementService;
import cn.edu.jxufe.shopping.service.GoodsCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        return advertisementDAO.updateByPrimaryKeySelective(advertisement);
    }

    @Override
    public List findByCondition(Advertisement advertisement) {
        return advertisementDAO.findByCondition(advertisement);
    }

    @Override
    public EasyUIData<Advertisement> findByPage(Advertisement advertisement, int page, int row) {
        EasyUIData<Advertisement> easyUIData = new EasyUIData();
        PageHelper.startPage(page, row);
        PageInfo pageInfo = new PageInfo(findByCondition(advertisement));
        easyUIData.setTotal(pageInfo.getTotal());
        easyUIData.setRows(pageInfo.getList());
        return easyUIData;
    }
}
