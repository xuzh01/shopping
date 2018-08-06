package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Advertisement;
import cn.edu.jxufe.shopping.entity.AdvertisementExample;
import org.springframework.stereotype.Repository;

/**
 * AdvertisementDAO继承基类
 */
@Repository
public interface AdvertisementDAO extends MyBatisBaseDao<Advertisement, Integer, AdvertisementExample> {
}