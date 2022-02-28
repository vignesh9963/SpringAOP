package com.loonycorn.main;

import com.loonycorn.pointcuts.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



//Running aop
public class Main1 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        Item item=(Item) applicationContext.getBean("itemBeanOne");
        item.printItemDetails();

    }

}
