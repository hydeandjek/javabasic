package oop.poly.player;

public class Mage extends Player{

	int mana;
	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	public void blizzard(Player[] target) {//Player...도 가능
		
		System.out.println(this.name+"이(가) 눈보라를 시전하였습니다.");
		System.out.println("-------------------------------");
		for(Player p : target) {
			int dmg = (int) ((Math.random()*6)+10);
			p.hp -=dmg;
			System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력 : %d)\n\n",p.name,dmg,p.hp);
		}
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("마나 : "+ mana);
	}
	

}
