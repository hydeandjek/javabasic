package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {

		//2~19까지의 난수를 생성하여 구구단을 출력하기
		//19행까지 출력
		int ran =(int)(Math.random()*18)+2;
		System.out.printf("%d단\n",ran);
		for(int i=1; i<=19;i++) {
			int X=ran*i;
			System.out.printf("%dX%d = %d\n",ran,i,X);
		}
		
		
	}

}
