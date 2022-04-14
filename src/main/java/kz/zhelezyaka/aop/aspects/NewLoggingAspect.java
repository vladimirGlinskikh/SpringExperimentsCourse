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

        Object targetMethodResult;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.err.println("aroundReturnBookLoggingAdvice: " +
                    "an exception was caught " + e);
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "A book was successfully returned to the library");
        return targetMethodResult;
    }
}
