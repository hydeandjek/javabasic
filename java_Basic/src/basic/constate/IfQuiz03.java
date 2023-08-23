package basic.constate;

import java.util.Scanner;

public class IfQuiz03 {
public static void main(String[] args) {
	

	/*
	         - 정수 3개를 입력 받습니다.
	         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
	         
	         # max, mid, min이라는 변수를 미리 선언하셔서
	          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
	          마지막에 한번에 출력하시면 되겠습니다.
	         */
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 3개를 입력하십시오 (ex: 3 3 3): ");
	int num1 =sc.nextInt();
	int num2 =sc.nextInt();
	int num3 =sc.nextInt();
	int max = 0;
	int min = 0;
	int mid = 0;
	if(num1>num2 && num1>num3) {
		if(num2>num3) {
			max += num1;
			mid += num2;
			min += num3;
		}else if(num3>num2) {
			max += num1;
			mid += num3;
			min += num2;
		}
	}else if(num1<num2 && num2>num3) {
		if(num1>num3) {
			max += num2;
			mid += num1;
			min += num3;
		}else if(num3>num1) {
			max += num2;
			mid += num3;
			min += num1;
		}
	}else if(num3>num2 && num1<num3) {
		if(num2>num1) {
			max += num3;
			mid += num2;
			min += num1;
		}else if(num1>num2) {
			max += num3;
			mid += num1;
			min += num2;
		}
	}
	System.out.printf("가장큰값: %d, 가장작은값 : %d, 중간값 : %d",max,min,mid);
}
}
