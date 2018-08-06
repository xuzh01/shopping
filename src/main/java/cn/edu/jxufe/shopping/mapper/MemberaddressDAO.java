package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Memberaddress;
import cn.edu.jxufe.shopping.entity.MemberaddressExample;
import org.springframework.stereotype.Repository;

/**
 * MemberaddressDAO继承基类
 */
@Repository
public interface MemberaddressDAO extends MyBatisBaseDao<Memberaddress, Integer, MemberaddressExample> {
}