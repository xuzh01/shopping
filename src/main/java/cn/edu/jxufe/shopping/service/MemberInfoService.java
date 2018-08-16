package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.entity.Memberinfo;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-08 15:00:53
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public interface MemberInfoService extends PublicService<Memberinfo> {
    Memberinfo findById(Integer id);
}
