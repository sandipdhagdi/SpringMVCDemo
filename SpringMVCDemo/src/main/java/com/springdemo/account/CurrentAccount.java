package com.springdemo.account;

import com.springdemo.cards.Card;

public class CurrentAccount implements Account {
	Card card;

	public CurrentAccount() {
	}

	public CurrentAccount(Card card) {
		super();
		this.card = card;
	}

	public void getInfo() {
		System.out.println("I am CurrentAccount");
		card.getInfo();
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
