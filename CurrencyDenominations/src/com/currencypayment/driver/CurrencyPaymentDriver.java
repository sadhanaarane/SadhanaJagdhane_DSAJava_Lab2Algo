package com.currencypayment.driver;

import java.util.Scanner;

import com.currencypayment.service.CurrencyPayment;
import com.currencypayment.service.MergeSort;

public class CurrencyPaymentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Get size of currency denominations
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		
		//Get currency denomination values
		int denominations[] = new int[size];
		
		System.out.println("Enter the denominations values");
		for(int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}
		
		//Get amount to pay
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		//sort denominations in descending order
		MergeSort.sort(denominations);
		
		//Calculate number of notes 
		CurrencyPayment.countRequiredCurrency(denominations, amount);
		
		sc.close();
	}

}
