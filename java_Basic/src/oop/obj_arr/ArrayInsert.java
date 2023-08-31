package oop.obj_arr;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		for(int i =0; i<people.length;i++) {
			people[i] = new Person();
			System.out.println("이름을 입력하세요 : ");
//			String name = sc.next();
			people[i].setName(sc.next());
			System.out.println("나이를 입력하세요 : ");
//			int age = sc.nextInt();
			people[i].setAge(sc.nextInt());

			System.out.println("성별을 입력하세요 : ");
//			String gender = sc.next();
			people[i].setGender(sc.next());
//			people[i] = new Person(name,age,gender);	
			System.out.println("***정보 입력 완료***");
		}
		System.out.println("-------------------------");
		for(Person p : people) {
			p.personInfo();
		}
	}

}
