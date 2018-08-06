package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Memberinfo;
import cn.edu.jxufe.shopping.entity.MemberinfoExample;
import org.springframework.stereotype.Repository;

/**
 * MemberinfoDAO继承基类
 */
@Repository
public interface MemberinfoDAO extends MyBatisBaseDao<Memberinfo, Integer, MemberinfoExample> {
}