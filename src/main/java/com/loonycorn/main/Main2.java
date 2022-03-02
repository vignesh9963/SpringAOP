package com.loonycorn.main;

import com.loonycorn.pointcuts.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Setting up Aspect Configurations using Annotations
public class Main2 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext2.xml");

        Item item=(Item) applicationContext.getBean("itemBeanOne");
       // item.printItemDetails();

        System.out.println("the items created :"+item.toString());
        item.setAvailableQuantity(20);
        System.out.println("Updated quantity :"+item.getAvailableQuantity());

    }

}
