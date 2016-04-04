package dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<Item> items = new ArrayList<Item>();
	public void add(Item i){
		items.add(i);
	}
	public void list(){
		for (Item i:items){
			i.print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("Owl City",7));
		db.add(new DVD("大话西游","周星驰"));
		db.list();


	}

}
