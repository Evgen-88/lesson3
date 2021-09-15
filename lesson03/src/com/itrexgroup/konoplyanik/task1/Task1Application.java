package com.itrexgroup.konoplyanik.task1;

import com.itrexgroup.konoplyanik.task1.service.Task1Service;

public class Task1Application {

	public static void main(String[] args) {
		
		System.out.println(Task1Service.isPrime(2));
		
		System.out.println(Task1Service.isPrime(3));
		
		System.out.println(Task1Service.isPrime(4));
	}

}
