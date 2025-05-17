public class Character {
	protected String name;
	protected int hp;
	protected int atk;

	public Character() {
		this.name = null;
		this.hp = 20;
		this.atk = 5;
	}

	public Character(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	public void attack(Character c) {

	}

	public void damage(int atk) {
		if (this.hp > 0) {
			this.hp -= atk;
			if (this.hp <= 0) {
				this.hp = 0;
			}
			System.out.println(this.name + "に" + atk + "ダメージ（現在のHP：" + this.hp + "）");
			if (this.hp <= 0) {
				System.out.println(this.name + "は倒れた");
			}
		}
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	public void printStatus() {
		System.out.println(this.name + "のステータス");
		System.out.println("HP：" + this.hp);
		System.out.println("ATK：" + this.atk);
	}
}
