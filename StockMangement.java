package com.bridgelabz.day11_12;
import java.util.Scanner;
import java.util.ArrayList;

class Stocks{
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
class StockPortfolio extends Stocks {
	ArrayList<Stocks> portfolio = new ArrayList<>();
	double totalValue = 0;

	public double totalValue() {
		for (Stocks stock : portfolio) {
			totalValue += stock.sharePrice * stock.noOfShares;
		}
		return totalValue;
	}
}
public class StockMangement {
	public static void addStock() {
		StockPortfolio list = new StockPortfolio();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of Which Stock You Want to Purchase : ");
		System.out.println("Enter Share Name : ");
		list.setShareName(sc.next());
		System.out.println("Enter Number of Shares : ");
		list.setNoOfShares(sc.nextInt());
		System.out.println("Enter Share Price : ");
		list.setSharePrice(sc.nextInt());			
		}
	public static void main(String[] args) {
		StockMangement a = new StockMangement();
		a.addStock();
		System.out.println();
	}
	}

