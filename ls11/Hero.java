public class Hero extends Character implements CriticalHitter{
    /* -------コンストラクタ------- */
    
    /* Lesson11_1 add here */
    Hero(String name,int hp,int atk){
	super(name,hp,atk);
    }

    /* -------メソッド------- */
    /* Lesson11_1 add here */
    
    public  void printName(){
	System.out.println("プレイヤーのキャラクターの名前は"+this.getName()+"だ");
    }
    public void attack(Enemy enemy){
	System.out.println(this.getName()+"の攻撃!");
	enemy.takeDamage(this.getAtk());
	System.out.println(this.getName()+"は"+enemy.getName()+"に"+this.getAtk()+"のダメージを与えた!");
	System.out.println(enemy.getName()+"のHPは"+enemy.getHp());
    }
    /* Lesson11_3 add here */
    public int calcCritical(){
	return this.CRITICAL*this.getAtk();
    }
    public void criticalAttack(Enemy enemy){
		System.out.println(this.getName()+"の攻撃!");
		System.out.println("クリティカルヒット");
	enemy.takeDamage(this.calcCritical());
	System.out.println(this.getName()+"は"+enemy.getName()+"に"+this.calcCritical()+"のダメージを与えた!");
	System.out.println(enemy.getName()+"のHPは"+enemy.getHp());
    }

}
