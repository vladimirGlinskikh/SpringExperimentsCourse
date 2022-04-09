package kz.zhelezyaka.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("kz.zhelezyaka.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: " +
                "catch an exception when we're trying get book or magazine");
        System.out.println("--------------------------------------------");
    }
}
