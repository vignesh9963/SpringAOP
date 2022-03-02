package com.loonycorn.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class AspectConfig5 {

    @Pointcut("execution(public * *.print*(..))")
    private void printPointcut(){}


    @Pointcut("execution(* *.display*(..))")
    private void displayPointcut(){}


    @Pointcut("execution(* *.get*(..))")
    private void getterPointcut(){}

    @Pointcut("within(com.loonycorn.pointcuts.ItemList)")
    private void itemListAllMethodsPointcut(){}

    @Pointcut("printPointcut() || displayPointcut()")
    private void printOrDisplayMethodPointcut(){}

    @Pointcut("printPointcut() && itemListAllMethodsPointcut()")
    private void printMethodFromItemListPointcut(){}

    @Pointcut("printOrDisplayMethodPointcut() || getterPointcut()")
    private void doesNotPublishOrGet(){}


    @Before("printOrDisplayMethodPointcut()")
    public void printLogo(JoinPoint jp)
    {

        System.out.println("\n\nLogo printed before invocation of:"+ jp.getSignature().getName());

        System.out.println("\n********************************************\n"+
                            "******************Q E N E L******************\n"+
                            "*********************************************\n");
    }


    @Before("printMethodFromItemListPointcut()")
    public void printFromItemList(JoinPoint jp)
    {
        System.out.println("##################### Printing from ItemList ###########################");
        System.out.println("Performing an add operation by invoking :" +jp.getSignature().getName() + "\n");

    }




    @Before("doesNotPublishOrGet()")
    public void doesNotPublishOrGetAdvice(JoinPoint jp)
    {
        System.out.println("A method which does not publish to the console "+"or retrieve data has been called");
    }



}
