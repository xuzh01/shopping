package cn.edu.jxufe.mapper;

import cn.edu.jxufe.entity.Advertisement;
import cn.edu.jxufe.entity.AdvertisementExample;
import org.springframework.stereotype.Repository;

/**
 * AdvertisementDAO继承基类
 */
@Repository
public interface AdvertisementDAO extends MyBatisBaseDao<Advertisement, Integer, AdvertisementExample> {
}