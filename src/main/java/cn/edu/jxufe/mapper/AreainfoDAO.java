package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Areainfo;
import cn.edu.jxufe.entity.AreainfoExample;
import org.springframework.stereotype.Repository;

/**
 * AreainfoDAO继承基类
 */
@Repository
public interface AreainfoDAO extends MyBatisBaseDao<Areainfo, Integer, AreainfoExample> {
}