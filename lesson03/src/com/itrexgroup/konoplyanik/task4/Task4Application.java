package com.itrexgroup.konoplyanik.task4;

import com.itrexgroup.konoplyanik.task4.service.Task4Service;

public class Task4Application {

	public static void main(String[] args) {
		
		System.out.println(Task4Service.factorial(0));
		
		System.out.println(Task4Service.factorial(1));
		
		System.out.println(Task4Service.factorial(2));
		
	}

}
