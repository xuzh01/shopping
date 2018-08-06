package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Memberinfo;
import cn.edu.jxufe.entity.MemberinfoExample;
import org.springframework.stereotype.Repository;

/**
 * MemberinfoDAO继承基类
 */
@Repository
public interface MemberinfoDAO extends MyBatisBaseDao<Memberinfo, Integer, MemberinfoExample> {
}