package com.loonycorn.pointcuts;

import java.util.List;

public class ItemList2 {
    List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public void printNumItems(){
        System.out.println("\n*-------- Method: ItemList.printNumItems() has been called -------*");
        System.out.println("There are " + items.size() + " items in total.");
    }
    @DetailPublisher
    public void displayItemList()
    {
        System.out.println("\n*--------- Method:ItemList.displayItemList() is called --------*");

        String format = "|%1$-16s|%2$-16s|%3$-16s|%4$-16s|\n";
        System.out.println("------------------------------------------------------------------");
        System.out.format(format,"ITEM ID", "ITEM NAME", " ITEM PRICE", "QUANTITY");
        System.out.println("------------------------------------------------------------------");

        for(Item item:items)
        {
            System.out.format(format,item.getItemId(),item.getItemName(),item.getItemPrice(),item.getAvailableQuantity());
        }


        System.out.println("-------------------------------------------------------------------");
    }


    public void addItemToList(Item item)
    {
        this.items.add(item);
    }

    public void addItemToListAtIndex(int index,Item item)
    {
        this.items.add(index,item);
    }


}
