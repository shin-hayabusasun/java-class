public class Boss extends Enemy {
	public Boss() {
		super();
	}
 
	//add here(Lesson10_5)
    public Boss (String name,int hp,int atk){
	super(name,hp,atk);
    }
    public void attackHard(Player p){
	if(this.isAttackable==false){
	    System.out.println("ドラゴンは反動で動けない");
	    this.isAttackable=true;
	
	}
	else {
	    if(this.hp!=0&&p.hp!=0){
	    	System.out.println(this.name + "から" + p.name + "への強攻撃!");
		p.damage(this.atk*5);
	    this.isAttackable=false;
	    }
	}
    }

}
