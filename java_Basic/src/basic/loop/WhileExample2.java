package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		
		//48~150사이의 정수중 8의 배수만을 가로로 출력
		//48부터 숫자를 하나씩 올려가며 8배수 판별 반복
		int i =48;
		while(i<=150){
			if(i%8==0) {
				System.out.print(i+"\n");	
			}
			i++;
		}
		//1~100까지의 정수중 4의 배수이면서 8의배수는아닌것
		System.out.println("----------------------------------");
		int n=1;
		while(n<=100) {
			if(n%4==0 && n%8!=0) {
				System.out.println(n+" ");
			}
			n++;
		}
		//1~30000까지의 정수중 258의 배수의 개수를 출력
		int a= 1;
		int count = 0;//배수의 개수를 세 줄 변수
		while(a <= 30000) {
			if(a%258 == 0) {
				count++; 
			}
			a++;
		}
		System.out.println("1~30000중 258의 배수의 개수 : "+count);
		
		//1000의 약수의 개수를 구하시오
		int b= 1;
		int total = 0;
		while(b <=1000) {
			if(1000%b==0) {
				total++;
			}
			b++;
		}
		System.out.println("1000의 약수의 개수 : "+total+"개");
	}

}
