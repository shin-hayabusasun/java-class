public class Player extends Character {
	protected int def;

	public Player() {
		super();
		this.def = 0;
	}

	// add here(Lesson10_1)
    public Player(String name,int hp,int atk){
	super(name,hp,atk);
		this.def = 0;
    }
    public Player(String name,int hp,int atk,int def){
	super(name,hp,atk);
		this.def = def;
    }
    



	// add here(Lesson10_2)
	public void printStatus() {
	    if(this.hp!=0){
		super.printStatus();
		System.out.println("DEF :"+this.def);
	    }
	}
	


	public void attack(Enemy e) {
		if (e.hp > 0 && this.hp > 0) {
			System.out.println(this.name + "から" + e.name + "への攻撃！");
			e.damage(this.atk);
		}
	}

	// add here(lesson10_3)
    public void damage(int atk){
	if(this.def<100){
	  
	    super.damage(atk*(100-this.def)/100);
	   
	    
	}
	
	else{super.damage(0);
	   
	}

    }


	// add here(lesson10_4)
    public void attackToAll(Enemy[] e){
	for(int i=0;i<e.length;i++){
	    if(e[i].hp!=0){
	    e[i].damage(this.atk/2);
	    }
		}
    }


	
}
