// 飲み物の抽象クラス
public abstract class Beverage {
    private String name; // 名前
    Beverage(String name) {this.name = name;}
    public String getName() {return this.name;}

    protected abstract void prepare(); // 飲み物の準備手順
    protected abstract void pour(); // 飲み物を容器へ注ぐ
    public void serve() { // サーブ手順
        prepare();
        pour();
        System.out.println(getName() + "を提供します");
    }
}

// 温かい飲み物の抽象クラス
abstract class HotBeverage extends Beverage {
    HotBeverage(String name) {
        super(name);
    }

    // 共通のメソッド
    protected void boilWater() {
        System.out.println("お湯を沸かします");
    }
    protected void pour() {
        System.out.println(this.getName() + "をカップに注ぎます");
    }
}

// 冷たい飲み物の抽象クラス
abstract class ColdBeverage extends Beverage {
    ColdBeverage(String name) {
        super(name);
    }

    // 共通のメソッド
    protected void pour() {
        System.out.println(this.getName() + "をグラスに注ぎます");
    }
}
