public class Enemy extends Character {
	protected int turn;
	protected boolean isAttackable = true;
	
	public Enemy() {
		super();
		this.turn = -1;
	}

	public Enemy(String name, int hp, int atk) {
		super(name, hp, atk);
		this.turn = -1;
	}

	public Enemy(String name, int hp, int atk, int turn) {
		super(name, hp, atk);
		this.turn = turn;
	}

	public void attack(Player p) {
		if (this.hp > 0) {
			if (this.isAttackable) {
				if (p.hp > 0) {
					System.out.println(this.name + "から" + p.name + "への攻撃!");
					p.damage(this.atk);
				}
			}
			this.turn--;
		}
	}

	public void printStatus() {
		if (this.hp > 0) {
			super.printStatus();
			if (turn >= 0) {
				System.out.println(this.name + "が逃げるまで" + this.turn + "ターン");
				if (turn == 0) {
					super.run();
				}
			}
		}
	}
}
