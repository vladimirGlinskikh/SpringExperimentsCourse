package kz.zhelezyaka.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* test*(..))")
    public void allAddMethods() {
    }
}
