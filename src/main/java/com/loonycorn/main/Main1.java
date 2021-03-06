package com.loonycorn.main;

import com.loonycorn.pointcuts.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



//Running aop and working with Pointcut Expression
public class Main1 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        Item item=(Item) applicationContext.getBean("itemBeanOne");
       // item.printItemDetails();

        System.out.println("the items created :"+item.toString());
        item.setAvailableQuantity(20);
        System.out.println("Updated quantity :"+item.getAvailableQuantity());

    }

}
