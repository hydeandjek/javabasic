package oop.poly.car;

public class Tesla extends Car{
	
	@Override
	void run() {
		System.out.println("테슬라가 달린다.");
	}
	
	void activeAutopilot() {
		System.out.println("테슬라의 오토 파일럿이 켜집니다.");
		
		
	}
	
}
