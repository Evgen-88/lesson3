package com.itrexgroup.konoplyanik.task7.model;

import java.util.List;

public class Account {
	Long balance;
	List<Transaction> transactions;

	public Account(Long balance, List<Transaction> transactions) {
		this.balance = balance;
		this.transactions = transactions;
	}

	public Long getBalance() {
		return balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

}
