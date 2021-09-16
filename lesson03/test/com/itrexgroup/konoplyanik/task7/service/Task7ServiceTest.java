package com.itrexgroup.konoplyanik.task7.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.itrexgroup.konoplyanik.task7.model.Account;
import com.itrexgroup.konoplyanik.task7.model.State;
import com.itrexgroup.konoplyanik.task7.model.Transaction;

public class Task7ServiceTest {
	private List<Account> accounts;
	
	@SuppressWarnings("serial")
	@Before
	public void presetAccounts() {
		Transaction transaction1 = new Transaction(State.CANCELED, 1000L);
		Transaction transaction2 = new Transaction(State.FINISHED, 8000L);
		Transaction transaction3 = new Transaction(State.CANCELED, 10000L);
		
		List<Transaction> transactions1 = new ArrayList<>();
		transactions1.add(transaction1);
		
		List<Transaction> transactions2 = new ArrayList<>() {{
			add(transaction2);
			add(transaction3);
		}};
		
		Account account1 = new Account(0L, transactions1);
		Account account2 = new Account(8000L, transactions2);
		
		accounts = new ArrayList<>() {{
			add(account1);
			add(account2);
		}};
	}
	
	@Test
	public void calcSumOfCanceledTransOnNonEmptyAccountsTest() {
		Assert.assertEquals(Task7Service.calcSumOfCanceledTransOnNonEmptyAccounts(accounts), 10000);
	}
	
}
