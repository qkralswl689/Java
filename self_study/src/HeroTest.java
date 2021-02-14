public class HeroTest {
  public static void main(String[] args)throws InterruptedException {
    // 두 싸움꾼 객체 생성
    Hero arthas = new Hero("아서스"); // { name : "아서스",hp : 30}
    Hero leona = new Hero("레오나"); // { name : "레오나",hp : 30}
    
    // 격투 시작
    Hero.battle(arthas, leona);
  }
}

class Hero {
	
// 1. 클래스의 필드를 정의
  // 필드
  String name; // 이름
  int hp; // 체력
  
  // 2. 클래스의 생성자 정의
  // 생성자
  public Hero(String str) {
    name = str;
    hp = 30;
  }
  
  // 3. 클래스의 펀치 메소드 정의
  // 메소드(인스턴스 메소드) ( 펀치)
  public void punch(Hero enemy) {
      enemy.hp -= 10;
	  System.out.printf("[%s]의 펀치 %n",this.name);
	  System.out.printf("\t%s: %d/30%n", enemy.name,enemy.hp);
  }
  
  // 4. static 메소드 battle 정의 
  // 메소드(클래스 메소드) ( 격투)
  public static void battle(Hero a, Hero b) throws InterruptedException{
   // 두 영웅 의 체력이 남아 있다면, 계속 싸움을 진행
	  while(a.hp > 0 && b.hp > 0) {
		  // 둘다 살아 있다면 반복하도록 조건식 구현
		  // 1/2 확률로 공격/수비 결정
		  Hero attacker, defender;
		   if(Math.random() < 0.5) { // 0.5 보다 작으면 
			   // Math.random() 메소드 사용하여 절반 확률로 공격 수비 선정
			   attacker = a;
			   defender = b;
		   } else {
			   attacker = b;
			   defender = a;
		   }
		   // 대상을 공격
		   attacker.punch(defender); // attacker 가 defender 에게 펀치를 한다
		   // 딜레이 0.1초
		   Thread.sleep(100);
		  
	  }
  }
}