package Controller;

import java.util.ArrayList;

public class Logic {

	private static ArrayList<Item> itemList;
	
	public  static ArrayList<Item>  getItemList(){
		return itemList;
	}
	
	public static Item getItem(int idx) {
		return itemList.get(idx);
	}
	
}
