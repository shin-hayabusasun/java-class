public class Slime extends Monster implements Cloneable{
    /* -------フィールド------- */
   

    /* -------コンストラクタ------- */
    public Slime(String name, int hp, int level){
	super(name,hp,level,"Slime");

    }

    /* -------メソッド------- */
   
    
   
    
    public void action(){
	System.out.println(this.getName()+"は逃げようとしている");
    }
    
  

    /* Lesson11_5 add here */
    public Slime clone(String name){
	System.out.println(this.getName()+"が分裂し,"+name+"が誕生した");
	Slime a=new Slime(name,this.getHp(),this.getLevel());
	return a;
    }
    
}
