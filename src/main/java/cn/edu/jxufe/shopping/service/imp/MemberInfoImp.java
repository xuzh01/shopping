package cn.edu.jxufe.shopping.service.imp;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.*;
import cn.edu.jxufe.shopping.mapper.AdvertisementDAO;
import cn.edu.jxufe.shopping.mapper.GoodsinfoDAO;
import cn.edu.jxufe.shopping.mapper.MemberinfoDAO;
import cn.edu.jxufe.shopping.service.AdvertisementService;
import cn.edu.jxufe.shopping.service.MemberInfoService;
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
public class MemberInfoImp implements MemberInfoService {

    @Autowired
    private MemberinfoDAO memberinfoDAO;

    @Override
    public List findAll() {
        return memberinfoDAO.selectByExample(new MemberinfoExample());
    }

    @Override
    public int save(Memberinfo memberinfo) {
        return memberinfoDAO.insert(memberinfo);
    }

    @Override
    public int delete(Integer id) {
        return memberinfoDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Memberinfo memberinfo) {
        return memberinfoDAO.updateByPrimaryKeySelective(memberinfo);
    }

    @Override
    public List findByCondition(Memberinfo memberinfo) {
        return memberinfoDAO.findByCondition(memberinfo);
    }

    @Override
    public EasyUIData<Memberinfo> findByPage(Memberinfo memberinfo, int page, int row) {
        EasyUIData<Memberinfo> easyUIData = new EasyUIData();
        PageHelper.startPage(page, row);
        PageInfo pageInfo = new PageInfo(findByCondition(memberinfo));
        easyUIData.setTotal(pageInfo.getTotal());
        easyUIData.setRows(pageInfo.getList());
        easyUIData.getRows().iterator().forEachRemaining((obj) -> {
            obj.setMemberPasswd(null);
        });
        return easyUIData;
    }
}
