package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Areainfo;
import cn.edu.jxufe.shopping.entity.AreainfoExample;
import org.springframework.stereotype.Repository;

/**
 * AreainfoDAO继承基类
 */
@Repository
public interface AreainfoDAO extends MyBatisBaseDao<Areainfo, Integer, AreainfoExample> {
}