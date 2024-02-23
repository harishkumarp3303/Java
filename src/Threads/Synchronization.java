package com.designpatterns;

public class Synchronization {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Bank b=new Bank();
		
		System.out.println(b);
		
//		b.WithDraw(500);
//		
//		System.out.println(b);
//		
//		b.deposit(300);
//		
//		System.out.println(b);
		
		
		Thread t1=new Thread(()->{
			System.out.println("Before Deposit : "+b.balance);
			b.deposit(300);
			System.out.println("After Deposit : "+b.balance);
//			System.out.println(b.balance);
		});
		Thread t2=new Thread(()->{
			System.out.println("Before Withdraw : "+b.balance);
			b.WithDraw(300);
			System.out.println("After Withdraw : "+b.balance);
//			System.out.println(b.balance);
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Result : "+b.balance);
		
		
	}

}

class Bank{
	int balance=1000;
	
	public synchronized void deposit(int amount) {
		balance=balance+amount;
	}
	public synchronized void WithDraw(int amount) {
		balance=balance-amount;
	}
	@Override
	public String toString() {
		return "Bank [balance=" + balance + "]";
	}
	
	
}
