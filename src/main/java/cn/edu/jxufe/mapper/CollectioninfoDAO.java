package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Collectioninfo;
import cn.edu.jxufe.entity.CollectioninfoExample;
import org.springframework.stereotype.Repository;

/**
 * CollectioninfoDAO继承基类
 */
@Repository
public interface CollectioninfoDAO extends MyBatisBaseDao<Collectioninfo, Integer, CollectioninfoExample> {
}