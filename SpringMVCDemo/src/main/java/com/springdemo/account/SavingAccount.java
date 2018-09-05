/**
 * 
 */
package com.springdemo.account;

import com.springdemo.cards.Card;

/**
 * @author Sandip
 *
 */
public class SavingAccount implements Account {

	Card card;
	
	public SavingAccount(Card card) {
		super();
		this.card = card;
	}

	public void getInfo() {
		System.out.println("I am saving account");
		card.getInfo();
	}
	
}
