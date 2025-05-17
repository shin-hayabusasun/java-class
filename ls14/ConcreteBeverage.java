// 水クラス: クラス名 Water
class Water extends ColdBeverage {
    Water(String name){super(name);}
    @Override
    public void prepare() {
    }
}

// コーヒークラス: クラス名 Coffee
// Lesson14_1: add here
class Coffee extends HotBeverage{
    Coffee(String name){
	super(name);
    }
    private void grindBeans() {
	System.out.println(this.getName()+"豆を挽きます");
    }
    private void brewCoffee(){
	System.out.println(this.getName()+"を抽出します");
    }
    public void prepare(){
	this.boilWater();
	this.grindBeans();
	this.brewCoffee();
	
    }
}


// 課題2
// 紅茶クラス: クラス名 Tea
// Lesson14_2: add here
class Tea extends HotBeverage{
    Tea(String name){
	super(name);
    }
    private void steepTeaBag(){
	System.out.println("ティーバックから紅茶を抽出します");
    }
 public void prepare(){
	this.boilWater();
        this.steepTeaBag();
	
	
    }
    
}


// ジュースクラス: クラス名 Juice
class Juice extends ColdBeverage {
    Juice(String name){super(name);}
    @Override
    public void prepare() {
        blendFruits();
        squeezeFruits();
    }

    private void blendFruits() {
        System.out.println("フルーツをブレンドします");
    }

    private void squeezeFruits() {
        System.out.println("フルーツを絞ります");
    }
}

