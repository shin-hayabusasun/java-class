public class Lesson10_3 {
	public static void main(String[] args) {
		Player hero = new Player("勇者", 200, 10, 150);
		Player warrior = new Player("戦士", 150, 20);
		Enemy enemy1 = new Enemy("スライム", 10, 10);
		Enemy enemy2 = new Enemy("ゴーレム", 50, 150);

		System.out.println("-----");
		hero.printStatus();
		warrior.printStatus();
		enemy1.printStatus();
		enemy2.printStatus();
		System.out.println("-----");

		enemy1.attack(hero);
		hero.attack(enemy1);
		warrior.attack(enemy2);
		enemy2.attack(warrior);

		System.out.println("-----");
		hero.printStatus();
		warrior.printStatus();
		enemy1.printStatus();
		enemy2.printStatus();
		System.out.println("-----");
		
	}
}
