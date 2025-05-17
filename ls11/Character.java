public abstract class Character implements StatusPrinter{
    /* -------フィールド------- */
    private int hp;
    private String name;
    private int atk;

    /* -------コンストラクタ------- */
    public Character(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    /* -------メソッド------- */
    public void takeDamage(int atk) {
        if (atk > this.hp)
            this.hp = 0;
        else
            this.hp -= atk;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAtk() {
        return this.atk;
    }

    public abstract void printName();

    /* Lesson11_2 add here */

    public  void showStatus(){
	System.out.println(this.getName()+"のステータス");
	System.out.println("HP:"+this.getHp());
	System.out.println("ATK:"+this.getAtk());
    }
}
