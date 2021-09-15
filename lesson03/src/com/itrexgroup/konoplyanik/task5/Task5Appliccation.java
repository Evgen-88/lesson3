package com.itrexgroup.konoplyanik.task5;

import com.itrexgroup.konoplyanik.task5.service.Task5Service;

public class Task5Appliccation {

	public static void main(String[] args) {
		
		System.out.println(Task5Service.sumOfOddNumbersInRange(0, 0));
		
		System.out.println(Task5Service.sumOfOddNumbersInRange(7, 9));
		
		System.out.println(Task5Service.sumOfOddNumbersInRange(21, 30));
		
	}

}
