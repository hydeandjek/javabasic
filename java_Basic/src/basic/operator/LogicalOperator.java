package basic.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		//비교(관계) 연산자
		//좌항 우항의 크기를 비교하여, 결과값으로
		//항상 논리형 타입의 값을 도출
		
		int x = 10 , y = 20;
		System.out.println(x != y);
		
		System.out.println(x>10 && y/10 ==10);
		
		//논리 반전 연산자 (!:단항)
		//단순히 논리값을 반전시킬때 사용
		//true > false , false>true
		int z = 10;
		System.out.println(!(z==10));
		

	}

}
