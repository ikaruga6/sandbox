package com.test.degrade.aspect;

/**
 * 降级支持
 */
public class DegradeSupport {

    /**
     * 是否降级标志
     */
    protected static final ThreadLocal<Boolean> DEGRADE_THREAD_FLAG = new ThreadLocal<>();
}
