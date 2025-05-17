public class Lesson10_5 {
	public static void main(String[] args) {
		Player hero = new Player("勇者", 200, 10, 20);
		Boss boss = new Boss("ドラゴン", 200, 10);

		System.out.println("-----");

		hero.printStatus();
		boss.printStatus();

		System.out.println("-----");

		hero.attack(boss);
		boss.attackHard(hero);

		System.out.println("-----");

		hero.printStatus();
		boss.printStatus();

		System.out.println("-----");

		hero.attack(boss);
		boss.attackHard(hero);

		System.out.println("-----");

		hero.printStatus();
		boss.printStatus();

		System.out.println("-----");
	}
}