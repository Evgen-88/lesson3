package com.itrexgroup.konoplyanik.task7;

import java.util.ArrayList;
import java.util.List;

import com.itrexgroup.konoplyanik.task7.model.Account;
import com.itrexgroup.konoplyanik.task7.model.State;
import com.itrexgroup.konoplyanik.task7.model.Transaction;
import com.itrexgroup.konoplyanik.task7.service.Task7Service;

public class Task7Application {

	public static void main(String[] args) {
		Transaction transaction1 = new Transaction(State.CANCELED, 1000L);
		Transaction transaction2 = new Transaction(State.FINISHED, 8000L);
		Transaction transaction3 = new Transaction(State.CANCELED, 10000L);
		
		List<Transaction> transactions1 = new ArrayList<>();
		transactions1.add(transaction1);
		
		List<Transaction> transactions2 = new ArrayList<>();
		transactions2.add(transaction2);
		transactions2.add(transaction3);
		
		Account account1 = new Account(0L, transactions1);
		Account account2 = new Account(8000L, transactions2);
		
		List<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		
		System.out.println(Task7Service.calcSumOfCanceledTransOnNonEmptyAccounts(accounts));

	}

}
