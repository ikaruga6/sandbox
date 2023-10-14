package com.test.degrade.service.base;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * 标准实现
 *
 * @param <T> 实体
 * @param <ID> ID
 */
@Slf4j
public class CurdWrapperStandardService<T, ID extends Serializable> implements CrudWrapperService<T, ID> {
    @Override
    public Object get(Serializable serializable) {
        return null;
    }

    @Override
    public List getList(Iterable iterable) {
        return null;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public List<T> getListBiz(Iterable<ID> ids) {
        log.debug("getListBiz使用了标准实现");
        return null;
    }
}
