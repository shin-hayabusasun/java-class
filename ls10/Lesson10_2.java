public class Lesson10_2 {
	public static void main(String[] args) {
		Player hero = new Player("勇者", 200, 10, 30);
		Player warrior = new Player("戦士", 0, 20);

		System.out.println("-----");
		hero.printStatus();
		System.out.println("-----");
		warrior.printStatus();
		System.out.println("-----");
	}
}