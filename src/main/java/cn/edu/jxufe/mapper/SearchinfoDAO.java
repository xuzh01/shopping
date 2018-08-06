package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Searchinfo;
import cn.edu.jxufe.entity.SearchinfoExample;
import org.springframework.stereotype.Repository;

/**
 * SearchinfoDAO继承基类
 */
@Repository
public interface SearchinfoDAO extends MyBatisBaseDao<Searchinfo, Searchinfo, SearchinfoExample> {
}