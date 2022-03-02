package com.loonycorn.main;

import com.loonycorn.pointcuts.Item;
import com.loonycorn.pointcuts.ItemList;
import com.loonycorn.pointcuts.ItemList2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Creating join points matching mutiple pointscuts
public class Main4 {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext4.xml");

        Item itemOne=(Item) applicationContext.getBean("itemBeanOne");
        Item itemTwo=(Item) applicationContext.getBean("itemBeanTwo");

        ItemList2 myList=(ItemList2) applicationContext.getBean("listBean");


        Item itemThree=new Item();
        itemThree.setItemId(103);
        itemThree.setItemPrice(20.3f);
        itemThree.setItemName("Butter");
        itemThree.setAvailableQuantity(12);


        Item itemFour=new Item();
        itemFour.setItemId(104);
        itemFour.setItemPrice(22.09f);
        itemFour.setItemName("Honey");
        itemFour.setAvailableQuantity(27);

        myList.addItemToList(itemThree);
        myList.addItemToListAtIndex(0,itemFour);

        myList.displayItemList();

    }

}
