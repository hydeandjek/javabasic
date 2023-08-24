package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i=1; i<= 10;i++) {
			if(i%2 !=0) continue;//if문이 맞다면 밑의 내용을 출력하지않고 다음으로 반복
			
			System.out.println(i+" ");
		}
		System.out.println("\n반복문 종료!");
		
	}

}
