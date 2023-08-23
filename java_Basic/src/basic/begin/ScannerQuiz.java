package basic.begin;


import java.time.LocalDate;
import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		/*
        - 스캐너를 사용하여 이름과 나이를 입력받아서
        
        이름: XXX
        나이: XX세
        출생년도: XXXX년
        
        을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
        출생년도는 입력사항이 아닙니다.)
        */
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine(); 
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("출생년도 : "+(year -age+1));
		sc.close();
	}

}
