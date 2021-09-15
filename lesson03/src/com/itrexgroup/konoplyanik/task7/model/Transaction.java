package com.itrexgroup.konoplyanik.task7.model;

public class Transaction {
	State state;
	Long sum;

	public Transaction(State state, Long sum) {
		this.state = state;
		this.sum = sum;
	}

	public State getState() {
		return state;
	}

	public Long getSum() {
		return sum;
	}

}
