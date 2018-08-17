package cn.edu.jxufe.shopping.mapper;

import cn.edu.jxufe.shopping.entity.GoodsComment;
import cn.edu.jxufe.shopping.entity.Loginfo;
import cn.edu.jxufe.shopping.entity.LoginfoExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * LoginfoDAO继承基类
 */
@Repository
public interface LoginfoDAO extends MyBatisBaseDao<Loginfo, Integer, LoginfoExample> {
    public List<Loginfo> findByCondition(Loginfo loginfo);

}