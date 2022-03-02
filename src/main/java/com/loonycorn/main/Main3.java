package com.loonycorn.main;

import com.loonycorn.pointcuts.Item;
import com.loonycorn.pointcuts.ItemList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Defining Pointcuts spanning multiple classes(Item and ItemList)
public class Main3 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext3.xml");

        Item itemOne=(Item) applicationContext.getBean("itemBeanOne");
        Item itemTwo=(Item) applicationContext.getBean("itemBeanTwo");

        ItemList myList=(ItemList) applicationContext.getBean("listBean");

        itemOne.printItemDetails();
        itemTwo.printItemDetails();

        myList.printNumItems();
        myList.displayItemList();

    }

}
