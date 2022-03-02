package com.loonycorn.main;

import com.loonycorn.pointcuts.Item;
import com.loonycorn.pointcuts.ItemList2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Creating join points matching multiple pointcuts
public class Main6 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext6.xml");

        Item itemOne=(Item) applicationContext.getBean("itemBeanOne");
        Item itemTwo=(Item) applicationContext.getBean("itemBeanTwo");

        ItemList2 myList=(ItemList2) applicationContext.getBean("listBean");


      myList.printNumItems();
      myList.displayItemList();

        System.out.println("===================================");
        System.out.println("\n Displaying the items one at time...\n");
        itemOne.printItemDetails();
        itemTwo.printItemDetails();


    }

}
