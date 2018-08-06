package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Searchinfo;
import cn.edu.jxufe.shopping.entity.SearchinfoExample;
import org.springframework.stereotype.Repository;

/**
 * SearchinfoDAO继承基类
 */
@Repository
public interface SearchinfoDAO extends MyBatisBaseDao<Searchinfo, Searchinfo, SearchinfoExample> {
}