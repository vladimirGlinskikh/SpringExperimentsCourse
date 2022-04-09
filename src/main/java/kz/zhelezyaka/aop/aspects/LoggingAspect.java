package kz.zhelezyaka.aop.aspects;

import kz.zhelezyaka.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* kz.zhelezyaka.aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUnitLibrary() {
//    }
//
//    @Pointcut("execution(* kz.zhelezyaka.aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUnitLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUnitLibrary() || allReturnMethodsFromUnitLibrary()")
//    private void allGetAndReturnedMethodsFromUniversityLibrary() {
//    }
//
//    @Before("allGetMethodsFromUnitLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUnitLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allGetAndReturnedMethodsFromUniversityLibrary()")
//    public void beforeGetAndReturnedLoggingAdvice() {
//        System.out.println("beforeGetAndReturningLoggingAdvice: writing log #3");
//    }

    @Before("kz.zhelezyaka.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " +
                methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " +
                methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " +
                methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Information of a book: " + myBook.getName() +
                            ", author: " + myBook.getAuthor() +
                            ", year of publication: " + myBook.getYearsOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Book in library added: " + obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: " +
                "trying to get book or magazine");
        System.out.println("--------------------------------------------");
    }
}
