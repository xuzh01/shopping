package cn.edu.jxufe.shopping.service;

import cn.edu.jxufe.shopping.bean.EasyUIData;
import cn.edu.jxufe.shopping.entity.GoodsCategory;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-08 14:53:34
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public interface PublicService<T> {
    public List<T> findAll();

    public int save(T obj);

    public int delete(Integer id);

    public int update(T obj);

    public List<T> findByCondition(T obj);

    public EasyUIData<T> findByPage(T obj, int page, int row);
}
