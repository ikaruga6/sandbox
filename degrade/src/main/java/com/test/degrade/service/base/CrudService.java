package com.test.degrade.service.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 基础的curd接口
 *
 * @param <T> 实体
 * @param <ID> ID
 */
public interface CrudService<T, ID extends Serializable> {

    T get(ID id);

    List<T> getList(Iterable<ID> ids);

    void delete(ID id);

    <S extends T> S save(S entity);
}
