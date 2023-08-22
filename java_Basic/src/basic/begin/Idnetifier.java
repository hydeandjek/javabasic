package basic.begin;

public class Idnetifier {

	public static void main(String[] args) {
		
//		 1. 식별자의 이름은 중복을 허용하지 않습니다.
//		 또한 대소문자 철저히 구분함
		 

		int age = 35;
//		int age = 40;(X);
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자의 이름은 숫자로 지정하거나 숫자로 시작하면 안됨
//		int 700 = 365; (X)
//		int 7number = 7;(X)
		int num7 = 7;
		int numuber = 7;
		int num1234ber = 123;
		
		//3. 식별자 이름에 공백 불가능
//		int my birth day = 19950831;
		int my_birth_day = 19950831; //snake case  파이썬이나 C에서 사용
		int myBirthDay = 19950831; //camel case
		 
		//4. 식별자에 쓸 수 있는 특수문자는 밑줄 _ , 달러기호 $ 만 사용가능
		//하지만 권장하지않음. 지정된 약속된부분 있음
		String $hello = "안녕";
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능
		//키워드는 이미 어떠한 내용을 내포하고 있는 지정 문자입니다.
		
//		String class = "클래스"; (X);
		String Class = "클래스"; // 사용가능하나 권장x
		
		//6. 한글이나 한자같은 식별자 이름도 지증 가능하나 권장x
		int 숫자 = 10;
		String 名 = "춘식이";
		System.out.println(숫자);
		System.out.println(名);
		
		
	}

}
