package com.test.degrade.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 降级增强
 */
@Aspect
public class CrudServiceWrapperAspect extends DegradeSupport{

    @Pointcut("execution(public * com.test.degrade.service.base.CurdWrapperStandardService.*(..))")
    public void aroundCrudServiceWrapper() {}

    @Around(value = "aroundCrudServiceWrapper()")
    public Object aroundCrudServiceWrapper(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            DEGRADE_THREAD_FLAG.set(true);
            
        } finally {

        }

    }

}
