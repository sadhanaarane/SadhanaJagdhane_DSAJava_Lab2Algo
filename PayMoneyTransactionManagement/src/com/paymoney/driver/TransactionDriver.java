package com.paymoney.driver;

import java.util.Scanner;

import com.paymoney.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Get the size of transaction array
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		
		//Get transaction values
		int transactions[] = new int[size];
		System.out.println("Enter the values of array");
		
		for(int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}
		
		//Get total number of targets that needs to be achieved
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numTargets = sc.nextInt();
		
		//Check target in transactions
		for(int i = 1; i <= numTargets; i++) {
			System.out.println();
			System.out.println("Enter the value of target");
			
			int targetValue = sc.nextInt();
			TransactionService.checkTransactions(transactions, targetValue);
		}
		sc.close();
	}

}
