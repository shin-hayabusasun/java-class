public class Lesson10_4 {
	public static void main(String[] args) {
		Player hero = new Player("勇者", 200, 20);
		Enemy enemy1 = new Enemy("スライムA", 10, 5);
		Enemy enemy2 = new Enemy("スライムB", 20, 5, 3);

		System.out.println("-----");
		hero.printStatus();
		enemy1.printStatus();
		enemy2.printStatus();
		System.out.println("-----");
		
		//add here(Lesson10_4)
		Enemy[] e={enemy1,enemy2};
		hero.attackToAll(e);

		
		enemy1.attack(hero);
		enemy2.attack(hero);

		System.out.println("-----");
		hero.printStatus();
		enemy1.printStatus();
		enemy2.printStatus();
		System.out.println("-----");
	}
}
