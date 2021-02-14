public class HeroTest {
  public static void main(String[] args)throws InterruptedException {
    // �� �ο�� ��ü ����
    Hero arthas = new Hero("�Ƽ���"); // { name : "�Ƽ���",hp : 30}
    Hero leona = new Hero("������"); // { name : "������",hp : 30}
    
    // ���� ����
    Hero.battle(arthas, leona);
  }
}

class Hero {
	
// 1. Ŭ������ �ʵ带 ����
  // �ʵ�
  String name; // �̸�
  int hp; // ü��
  
  // 2. Ŭ������ ������ ����
  // ������
  public Hero(String str) {
    name = str;
    hp = 30;
  }
  
  // 3. Ŭ������ ��ġ �޼ҵ� ����
  // �޼ҵ�(�ν��Ͻ� �޼ҵ�) ( ��ġ)
  public void punch(Hero enemy) {
      enemy.hp -= 10;
	  System.out.printf("[%s]�� ��ġ %n",this.name);
	  System.out.printf("\t%s: %d/30%n", enemy.name,enemy.hp);
  }
  
  // 4. static �޼ҵ� battle ���� 
  // �޼ҵ�(Ŭ���� �޼ҵ�) ( ����)
  public static void battle(Hero a, Hero b) throws InterruptedException{
   // �� ���� �� ü���� ���� �ִٸ�, ��� �ο��� ����
	  while(a.hp > 0 && b.hp > 0) {
		  // �Ѵ� ��� �ִٸ� �ݺ��ϵ��� ���ǽ� ����
		  // 1/2 Ȯ���� ����/���� ����
		  Hero attacker, defender;
		   if(Math.random() < 0.5) { // 0.5 ���� ������ 
			   // Math.random() �޼ҵ� ����Ͽ� ���� Ȯ���� ���� ���� ����
			   attacker = a;
			   defender = b;
		   } else {
			   attacker = b;
			   defender = a;
		   }
		   // ����� ����
		   attacker.punch(defender); // attacker �� defender ���� ��ġ�� �Ѵ�
		   // ������ 0.1��
		   Thread.sleep(100);
		  
	  }
  }
}