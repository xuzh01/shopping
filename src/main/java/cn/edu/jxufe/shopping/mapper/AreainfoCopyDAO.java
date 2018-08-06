package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.AreainfoCopy;
import cn.edu.jxufe.shopping.entity.AreainfoCopyExample;
import org.springframework.stereotype.Repository;

/**
 * AreainfoCopyDAO继承基类
 */
@Repository
public interface AreainfoCopyDAO extends MyBatisBaseDao<AreainfoCopy, Integer, AreainfoCopyExample> {
}