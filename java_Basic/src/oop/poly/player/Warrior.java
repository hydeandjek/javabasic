package oop.poly.player;

public class Warrior extends Player{

	int rage;

	Warrior(String name){
		//모든 생성자에게는 super()가 내장되어 있습니다.
		//자식 객체가 생성 될때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려 줄 수 있기 때문입니다.
		super(name);
//		this.name = name;
		this.rage = 60;
	}
	
	/*
    - 전사의 고유 기능인 rush 메서드를 작성합니다.
    
    - rush의 대상은 모든 직업들 입니다.
    
    - 만약 rush의 대상이 전사라면 10의 피해를 받고,
     마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
     
    - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
    
    - 남은 체력도 출력해 주세요.
    
    - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
    */
	public void rush(Player target) {
		System.out.println(this.name+"이 러쉬를 사용하였습니다.");
		int dmg;
		if(target instanceof Warrior) {
			dmg = 10;
//			System.out.println(target.name+"이(가) "+dmg+" 만큼 피해를 받았습니다. (남은 체력 : "+target.hp+")");
			
		}else if (target instanceof Mage) {
			dmg = 20;
//			System.out.println(target.name+"이(가) "+dmg+" 만큼 피해를 받았습니다. (남은 체력 : "+target.hp+")");
		}else {
			dmg = 15;
		}
		target.hp -= dmg;
		System.out.println(target.name+"이(가) "+dmg+" 만큼 피해를 받았습니다. (남은 체력 : "+target.hp+")");
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("분노 : "+rage);
	}
	
	
}
