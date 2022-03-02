package com.loonycorn.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig3 {

    @Pointcut("execution(void com.loonycorn.pointcuts.*.*(..))")
    private void myPointcutMethod(){}

    @Before("myPointcutMethod()")
    public void printLogo(JoinPoint jp)
    {

        System.out.println("\n\nLogo printed before invocation of:"+ jp.getSignature().getName());

        System.out.println("\n********************************************\n"+
                            "******************Q E N E L******************\n"+
                            "*********************************************\n");
    }
}
