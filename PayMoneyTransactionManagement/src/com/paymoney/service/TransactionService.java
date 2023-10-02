package com.paymoney.service;

public class TransactionService {

	public static void checkTransactions(int[] transactions, int targetValue) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int transactionsToAchieveTarget = 0;
		for(int i = 0; i < transactions.length; i++) {
			sum += transactions[i];
			transactionsToAchieveTarget++;
			if(sum >= targetValue) {
				System.out.println("Target achieved after " + transactionsToAchieveTarget + " transactions");
				return;
			}
		}
		System.out.println("Given target is not achieved");
	}
	
}
