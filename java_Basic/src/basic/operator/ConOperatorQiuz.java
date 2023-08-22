package basic.operator;

public class ConOperatorQiuz {

	public static void main(String[] args) {
		
		
		int rn = (int)((Math.random()*455)+42);
		String rf = (rn % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		System.out.println("발생한 난수 : " +rn);
		System.out.println("3항 연산의 결과 : "+ rf);
		
		
	}

}
