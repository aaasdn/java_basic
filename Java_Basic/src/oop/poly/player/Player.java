package oop.poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;

	Player(){
		System.out.println("Player의 기본 생성자 호출!");
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}

	Player(String name){
		this();
		this.name = name;
	}
	
	Player(String name, int hp){
		this(name); 
		this.hp = hp;
	}
	
	void attack(Player target) {
		
		System.out.println("target: " + target);
		System.out.println("this: " + this);
		
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;	
		} 
		
		System.out.printf("%s가 %s를 공격합니다.\n"
				, this.name, target.name);
		
		target.hp -= 10;
		this.hp += 5;
		System.out.println("나의체력: " + this.hp + " " + "상대방체력: " + target.hp);
	
		
	}

	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
		System.out.println("이 메서드를 호출한 객체의 이름: " + this.name);
	}

}