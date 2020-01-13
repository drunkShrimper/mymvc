package com.scau.myframework.mvc.annotation;


import java.lang.annotation.*;

/**
 * @description: 标注该类为service组件
 * @author: lipan
 * @time: 2019/10/26 13:23
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
    String value() default "";
}
