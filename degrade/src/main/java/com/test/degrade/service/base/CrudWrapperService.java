package com.test.degrade.service.base;

import java.io.Serializable;
import java.util.List;

/**
 * 扩展crud接口带业务方法
 *
 * @param <T> 实体
 * @param <ID> ID
 */
public interface CrudWrapperService<T, ID extends Serializable> extends CrudService {

    List<T> getListBiz(Iterable<ID> ids);

}
