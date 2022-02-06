package com.bridgelabz.day11_12;
import java.util.*;

public class Bank {
	private long accNum;
	private String accName;
	private long balance;
;
	public void openAcc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		accNum = sc.nextInt();
		System.out.println("Enter Account Name : ");
		accName = sc.next();
		System.out.println("Enter Balance You want to Add :");
		balance= sc.nextLong();
		
	}
	public void creditAmt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to credit : ");
		int amount = sc.nextInt();
		balance = balance + amount;
	}
	public void debitAmt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to debit : ");
		int amount = sc.nextInt();
		if (amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Debit amount Exceded Account Balance");
		}
	}

	public static void main(String[] args) {
		Bank account1 = new Bank();
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice \n 1: Open Account \n 2: Credit Amount \n 3: Debit Amount \n 0: Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				account1.openAcc();
				break;
			case 2:
				account1.creditAmt();
				break;
			case 3:
				account1.debitAmt();
				break;
			default:
				System.out.println("Exit");
				choice = 4;
			}
		}
		while (choice < 4);	
	}
}
