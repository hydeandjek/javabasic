package basic.loop;

public class BreakExample1 {

	public static void main(String[] args) {

		
		for(int i =1;i<=10;i++) {
			if(i>6) break;
			System.out.println(i+" ");
		}
		System.out.println("\n 반복문 종료!");
		
	}

}
