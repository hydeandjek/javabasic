package basic.operator;

public class ConOperatorQiuz {

	public static void main(String[] args) {
		
		
		int rn = (int)((Math.random()*455)+42);
		String rf = (rn % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		System.out.println("발생한 난수 : " +rn);
		System.out.println("3항 연산의 결과 : "+ rf);
		
		//"앞에 \를 넣어주면 문자열로 인식하지않고 "를 넣을 수 있다.
		System.out.println("그는 나에게 \"도와줘!\"라고 말했다.");
	}

}
