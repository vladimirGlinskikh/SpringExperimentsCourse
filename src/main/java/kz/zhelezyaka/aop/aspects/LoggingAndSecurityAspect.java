package kz.zhelezyaka.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* kz.zhelezyaka.aop.UniversityLibrary.get*())")
    private void allGetMethodsFromUnitLibrary() {
    }

    @Pointcut("execution(* kz.zhelezyaka.aop.UniversityLibrary.return*())")
    private void allReturnMethodsFromUnitLibrary() {
    }

    @Pointcut("allGetMethodsFromUnitLibrary() || allReturnMethodsFromUnitLibrary()")
    private void allGetAndReturnedMethodsFromUniversityLibrary() {
    }

    @Before("allGetMethodsFromUnitLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethodsFromUnitLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allGetAndReturnedMethodsFromUniversityLibrary()")
    public void beforeGetAndReturnedLoggingAdvice() {
        System.out.println("beforeGetAndReturningLoggingAdvice: writing log #3");
    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: " +
//                "trying to get book or magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: " +
//                "checking rights for getting books or magazines");
//    }
}
