package com.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item{
	String  item_name;
	int item_price;
	int max_item=5;
	
	public Item(String item_name, int item_price, int max_item) {
		super();
		this.item_name = item_name;
		this.item_price = item_price;
		this.max_item = max_item;
	}
	
	
	
	
}
class Category{
	int catid;
	String categoryname;
}
class ItemBought{
	int  itemid;
	int  itemqty;
}
public class Item_purchase_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item name an");
		
		List<String> list = new ArrayList<>();
		
		
		Item i = new Item("chair",600 , 0);

	}

}
