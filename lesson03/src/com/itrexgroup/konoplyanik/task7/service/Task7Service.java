package com.itrexgroup.konoplyanik.task7.service;

import java.util.List;

import com.itrexgroup.konoplyanik.task7.model.Account;
import com.itrexgroup.konoplyanik.task7.model.State;

public class Task7Service {

	public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
		return accounts.stream().filter(acc -> acc.getBalance() > 0).flatMap(acc -> acc.getTransactions().stream())
				.filter(t -> t.getState().equals(State.CANCELED)).mapToLong(t -> t.getSum())
				.reduce(0, (sum, s) -> sum + s);
	}

}
