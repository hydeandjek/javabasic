package oop.encap.good;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.year = 1992;
		my.setYear(1992);
		my.setMonth(9);
		my.setDay(31);
		
		Scanner sc = new Scanner(System.in);
		
		my.birthInfo();
		
	}

}
