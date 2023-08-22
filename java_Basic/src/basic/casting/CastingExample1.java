package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 떄는
		 * 자바 가상머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		 */
		byte b= 10;
		int i =b; //byte ->int로 변환 후 대입연산 진행
		System.out.println(i);
		
		char c ='홓';
		int j=c;
		System.out.println("A의 문자번호 :"+j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		
	}

}
