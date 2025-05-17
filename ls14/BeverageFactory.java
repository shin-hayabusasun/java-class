// 飲み物工場の抽象クラス
abstract class BeverageFactory {
    // ファクトリーメソッド
    public abstract Beverage createBeverage(String type);

    // 飲み物の注文
    public Beverage orderBeverage(String type) {
        Beverage beverage = createBeverage(type);
        beverage.serve();
        return beverage;
    }
}
