package com.currencypayment.service;

public class CurrencyPayment {

	public static void countRequiredCurrency(int[] denominations, int amount) {
		// TODO Auto-generated method stub
		int noteCounter[] = new int[denominations.length];
	
		for(int i = 0; i < denominations.length; i++) {
			if(amount >= denominations[i]) {
				noteCounter[i] = amount / denominations[i];
				amount %= denominations[i];
				
				if(amount == 0)
					break;
			}
		}
		
		if(amount > 0) {
			System.out.println("Exact amount can not be given with the highest denominations");
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i = 0; i < denominations.length; i++) {
				if(noteCounter[i] != 0) {
					System.out.println(denominations[i] + ":" + noteCounter[i]);
				}
			}
		}
	}

}
