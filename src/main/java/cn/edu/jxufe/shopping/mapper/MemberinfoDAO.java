package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Advertisement;
import cn.edu.jxufe.shopping.entity.Memberinfo;
import cn.edu.jxufe.shopping.entity.MemberinfoExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MemberinfoDAO继承基类
 */
@Repository
public interface MemberinfoDAO extends MyBatisBaseDao<Memberinfo, Integer, MemberinfoExample> {
    public List<Memberinfo> findByCondition(Memberinfo memberinfo);
}