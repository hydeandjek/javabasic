package oop.obj_arr;

public class Score {
	

		/*
	     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
	      담을 수 있는 객체를 디자인하세요.
	      
	     - 학생의 모든 정보를 한 눈에 확인할 수 있게
	      scoreInfo() 메서드를 선언해 주세요.
	      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
	      
	     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)	
	    */
	String name;
	int math;
	int korean;
	int english;
	int sum;
	double avg;
	
	void scoreInfo() {
		System.out.printf(this.name+"의 점수는 국어 : "+korean+", 영어 : "+english+", 수학 : "+math+"총점 : "+sum+", 평균 : "+avg+"입니다.");
	}
	
	
}
