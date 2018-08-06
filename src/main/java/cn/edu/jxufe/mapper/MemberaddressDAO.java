package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Memberaddress;
import cn.edu.jxufe.entity.MemberaddressExample;
import org.springframework.stereotype.Repository;

/**
 * MemberaddressDAO继承基类
 */
@Repository
public interface MemberaddressDAO extends MyBatisBaseDao<Memberaddress, Integer, MemberaddressExample> {
}