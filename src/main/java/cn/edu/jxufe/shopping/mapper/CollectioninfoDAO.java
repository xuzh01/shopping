package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Collectioninfo;
import cn.edu.jxufe.shopping.entity.CollectioninfoExample;
import org.springframework.stereotype.Repository;

/**
 * CollectioninfoDAO继承基类
 */
@Repository
public interface CollectioninfoDAO extends MyBatisBaseDao<Collectioninfo, Integer, CollectioninfoExample> {
}