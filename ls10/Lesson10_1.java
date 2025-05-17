public class Lesson10_1 {
	public static void main(String[] args) {
		Player hero = new Player("勇者", 200, 10);
		Player warrior = new Player("戦士", 150, 20);

		System.out.println("-----");
		hero.printStatus();
		System.out.println("-----");
		warrior.printStatus();
		System.out.println("-----");
	}
}
