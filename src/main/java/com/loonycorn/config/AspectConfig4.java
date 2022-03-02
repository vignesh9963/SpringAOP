package com.loonycorn.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class AspectConfig4 {

    @Pointcut("execution(public * *.print*(..))")
    private void myPointcutMethod(){}


    @Pointcut("execution(* *.add*(..))")
    private void addPointcut(){}


    @Before("myPointcutMethod()")
    public void printLogo(JoinPoint jp)
    {

        System.out.println("\n\nLogo printed before invocation of:"+ jp.getSignature().getName());

        System.out.println("\n********************************************\n"+
                            "******************Q E N E L******************\n"+
                            "*********************************************\n");
    }


    @Before("addPointcut()")
    public void addMessage(JoinPoint jp)
    {
        System.out.println("#####################ADD###########################");
        System.out.println("Performing an add operation by invoking :" +jp.getSignature().getName());
        System.out.println("Argumnets supplied :" + Arrays.toString(jp.getArgs())+"\n");

    }



}
