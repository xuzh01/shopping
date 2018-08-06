package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.AreainfoCopy;
import cn.edu.jxufe.entity.AreainfoCopyExample;
import org.springframework.stereotype.Repository;

/**
 * AreainfoCopyDAO继承基类
 */
@Repository
public interface AreainfoCopyDAO extends MyBatisBaseDao<AreainfoCopy, Integer, AreainfoCopyExample> {
}