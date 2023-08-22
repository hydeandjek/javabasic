package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	    # 변수 (Variable)
	    
	    1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
	    2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
	    적당한 데이터 타입을 선언해야 합니다.
	    ex) int: 4바이트의 정수, String: 문자열(문장)
	    3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
	    4. 변수 내부의 값은 언제든지 변경이 가능합니다.
	    */
		
		// 변수의 선언 : [자료형(데이터 타입)][변수명];
		
		int age;
		
		//변수의 초기화: [변수명] = [값];
		age = 40;
		//좌항 area =(대입연산, 할당연산자) value;
		
		//변수의 값을 참조(사용)
		System.out.println(age);

		//변수는 선언과 초기화를 동시에 가능 
		//(처음 만들때 한 번만 가능)
		int score = 90;
//		int score = 54;(x)
		
		
		//변수 하나당 값을 하나 밖에 대입 불가능
		//따라서 기존 값이 소멸하고 새로운 값이 할당됨
		score = 95;
		System.out.println(score);
		
		//변수에는 다른 변수의 값도 저장이 가능함
		int myscore = score;
		System.out.println(myscore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능
//		int count = "한번";(X))
//		int count = 23.5;(X)
//		String str = 100;
		
		//변수는 자료형 (데이터타입)이 달라도 이름이 동일하다면 중복선언 불가
		
		String name ="홍길동";
//		int name = 1004;
		
		//선언 및 초기화하지않는 변수는 사용이 불가능
//		int result = myscore + num; num을 선언한적이 없음
		int result;
//		System.out.println(result);(X) 초기화 필요.
		
		
	}
	
	
}
