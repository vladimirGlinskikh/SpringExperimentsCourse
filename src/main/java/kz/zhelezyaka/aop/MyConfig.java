package kz.zhelezyaka.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("kz.zhelezyaka.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
