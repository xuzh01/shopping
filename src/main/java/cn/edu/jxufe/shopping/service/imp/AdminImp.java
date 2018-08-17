package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.Admin;
import cn.edu.jxufe.shopping.entity.AdminExample;
import cn.edu.jxufe.shopping.entity.Memberinfo;
import cn.edu.jxufe.shopping.entity.MemberinfoExample;
import cn.edu.jxufe.shopping.mapper.AdminDAO;
import cn.edu.jxufe.shopping.mapper.MemberinfoDAO;
import cn.edu.jxufe.shopping.service.AdminService;
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
public class AdminImp implements AdminService {

    @Autowired
    private AdminDAO adminDAO;

    @Override
    public List findAll() {
        return adminDAO.selectByExample(new AdminExample());
    }

    @Override
    public int save(Admin admin) {
        return adminDAO.insert(admin);
    }

    @Override
    public int delete(Integer id) {
        return adminDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Admin admin) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminIdEqualTo(admin.getAdminId());
        return adminDAO.updateByExampleSelective(admin, adminExample);
    }

    @Override
    public List findByCondition(Admin admin) {
        return adminDAO.findByCondition(admin);
    }

    @Override
    public EasyUIData<Admin> findByPage(Admin admin, int page, int row) {
        EasyUIData<Admin> easyUIData = new EasyUIData();
        PageHelper.startPage(page, row);
        PageInfo pageInfo = new PageInfo(findByCondition(admin));
        easyUIData.setTotal(pageInfo.getTotal());
        easyUIData.setRows(pageInfo.getList());
        easyUIData.getRows().iterator().forEachRemaining((obj) -> {
            obj.setAdminPassword(null);
        });
        return easyUIData;
    }

    @Override
    public Admin findById(Integer id) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminIdEqualTo(id);
        List<Admin> list = adminDAO.selectByExample(adminExample);
        if (list.size() > 0) return list.get(0);
        else return null;
    }
}
