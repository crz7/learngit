package hello;

import java.util.Scanner;
public class TicketMachine {
	private int price = 100;
	private int balance;
	private int total;
	private String name = "";

	public TicketMachine(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("here "+i);
		price =i;
	}
	public TicketMachine(String name){

		this.name=name;
	}
	public TicketMachine(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void showPrompt(){
		System.out.println("Welcome to buy "+name+"line ticket");
		System.out.println("The price is "+price);
	}
	public void insertMoney(int bill){
		balance+=bill;
		printBalance();
	}
	public void printTicket(){
		if(balance>=price){
			System.out.println("THE TICKET");
			if(balance >price){
				System.out.println("change is "+(balance-price));
			}
			balance -=price;
		}
	}
	public void printBalance(){
		System.out.println("Balance is "+balance);
	}
	public boolean isEnough(){
		return balance >= price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketMachine tm = new TicketMachine("blue",65);
		tm.showPrompt();
		//    tm.insertMoney(80);
		//  s  tm.printBalance();
		//    tm.insertMoney(30);
		//    tm.printTicket();
		int bill;
		Scanner in = new Scanner(System.in);
		do{
			bill = in.nextInt();
			tm.insertMoney(bill);
			if(tm.isEnough()){
				tm.printTicket();
				break;
			}
		} while(true);

	}


}

