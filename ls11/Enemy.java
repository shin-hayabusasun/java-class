public class Enemy extends Character{
    // -------コンストラクタ-------
    /* Lesson11_1 add here */
    Enemy(String name,int hp, int atk){
	super(name,hp,atk);
    }
    public void attack(Hero hero){
	System.out.println(this.getName()+"の攻撃!");
	hero.takeDamage(this.getAtk());
	System.out.println(this.getName()+"は"+hero.getName()+"に"+this.getAtk()+"のダメージを与えた!");
	System.out.println(hero.getName()+"のHPは"+hero.getHp());
    }
  public  void printName(){
	System.out.println("プレイヤーのキャラクターの名前は"+this.getName()+"だ");
    }
    
    // -------メソッド-------
    /* Lesson11_1 add here */


}
