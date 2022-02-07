package com.bridgelabz.day11_12;
import java.util.Scanner;
import java.util.ArrayList;

class Stock{
	String ShareName;
	int noOfShares;
	int sharePrice;

	public String getShareName() {
		return ShareName;
	}
	public void setShareName(String shareName) {
		ShareName = shareName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
}
class StockPortfolio {
	ArrayList<Stock> portfolio = new ArrayList<>();
	double totalValue = 0;
	int counter = 0;

	public void addStock() {
		Stock stockInfo = new Stock();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of Which Stock You Want to Purchase : ");
		System.out.println("Enter Share Name : ");
		stockInfo.setShareName(sc.next());
		System.out.println("Enter Number of Shares : ");
		stockInfo.setNoOfShares(sc.nextInt());
		System.out.println("Enter Share Price : ");
		stockInfo.setSharePrice(sc.nextInt());	

		portfolio.add(stockInfo);
		System.out.println();
		System.out.println("Stock Added");
		counter++;
	}

	public void addNoOfStocks() {
		System.out.println("Enter the number of Stocks you want to Purshase");
		Scanner sc = new Scanner(System.in);
		int noOfStocks = sc.nextInt();
		for (int i=1;i<=noOfStocks;i++) {
			addStock();
		}
	}

	public void totalValue() {
		for (Stock stock : portfolio) {
			totalValue += stock.sharePrice * stock.noOfShares;
		}
		System.out.println(totalValue);
	}
}

public class StockMangement {
	static StockPortfolio a = new StockPortfolio();
	public static void main(String[] args) {

		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice \n1: Add Stock \n2: Add Multiple of Stocks "
					           + "\n3: Display Total value of Stocks \n0: Exit ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				a.addStock();
				break;
			case 2:
			    a.addNoOfStocks();
				break;
			case 3:
				System.out.println("Total value of your stocks is : ");
				a.totalValue();
				break;
			default:
				System.out.println("Exit");
				choice = 3;
			}
		}
		while (choice < 4);
	}
}

