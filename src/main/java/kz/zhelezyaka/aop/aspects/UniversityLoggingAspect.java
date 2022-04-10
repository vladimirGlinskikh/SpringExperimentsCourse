package kz.zhelezyaka.aop.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @AfterThrowing(pointcut = "execution(* getStudents())"
            , throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice:" +
                " Logging an exception throw " + exception);
    }
}
