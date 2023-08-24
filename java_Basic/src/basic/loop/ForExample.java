package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		/*
		int i =1;
		int total = 0;
		while (i<=10) {
			total += i;
			i++;
		}
		*/
		int total = 0;
		for(int i =1; i<=10;i++) {
			total+=i;
			//1~200 까지의 정수중 6의 배수이면서 12의 배수는 아닌수를 가로로 출력하기 (for)
		
			
			
		}
		for(int i=1; i<=200; i++) {
			if(i% 6 ==0 && i%12 != 0) {
				System.out.println(i +" ");
			}
		}
		System.out.println("_________________________");
		//1~60000까지의 정수중 177의 배수의 개수를 구해보시오
		int count = 0;
		for(int i=1;i<=60000;i++) {
			if(i%177 ==0) {
				count++;
			}
		}
		System.out.println(count);
		
		//정수를 하나 입력받아서
		//입력받은 정수까지의 팩토리얼의 값을 구하시요
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요 : ");
		int X = sc.nextInt();
		int all = 1;
		for(int i=1; i<=X;i++) {
			all*=i; 
		}
//		for(int i=X;i>= 1;i--) {
//			all*=i;
//		} 이렇게도 쓸 수 있다.
		System.out.printf("%d! = %d\n",X,all);
		sc.close();
	}

}
