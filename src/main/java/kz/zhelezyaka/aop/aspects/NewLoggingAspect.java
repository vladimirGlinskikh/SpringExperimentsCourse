package kz.zhelezyaka.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "They are trying to return a book to the library");

        long start = System.currentTimeMillis();
        final Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: " +
                "A book was successfully returned to the library");
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook " +
                "did the job for " + (end - start) + " milliseconds");
        return targetMethodResult;
    }
}
