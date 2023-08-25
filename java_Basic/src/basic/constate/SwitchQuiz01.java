package basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		/*
		         - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		          다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		          연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		          연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		          결과를 말씀해 주세요.
		         */
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 하나 입력하십시오. : ");
		int num1 = sc.nextInt();
		System.out.println("연산자를 입력하십시오. (ex :* + - / ): ");
		String opt = sc.next();
		System.out.println("정수를 하나 더 입력하십시오 : ");
		int num2 = sc.nextInt();
		int result = 0;
		boolean flag = false;
		switch(opt) {
			case "*" :
				result =	num1 * num2;
				break;
			case "+" : 
				result = num1+num2;
				break;
			case "-" : 
				result = num1-num2;
				break;
			case "/" : 
				if(num2 == 0) {
					System.out.println(num2+"가 0이므로 연산할 수 없습니다.");
					flag = true;
					break;
				}
				result = num1/num2;
				break;
			default :
				System.out.println("연산자를 다시 입력하십시오.");

		}
		if(!flag) {
		System.out.println(result);
		}
		sc.close();
	}

}
