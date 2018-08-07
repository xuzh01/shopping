package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.Advertisement;
import cn.edu.jxufe.shopping.entity.AdvertisementExample;
import cn.edu.jxufe.shopping.entity.Goodsinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AdvertisementDAO继承基类
 */
@Repository
public interface AdvertisementDAO extends MyBatisBaseDao<Advertisement, Integer, AdvertisementExample> {
    public List<Advertisement> findByCondition( Advertisement advertisement);
}