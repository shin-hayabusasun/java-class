// 温かい飲み物工場クラス: クラス名 HotBeverageFactory
class HotBeverageFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage(String type) {
        switch (type.toLowerCase()) {// 英語大文字は全て英語小文字へ変換
            // Lesson14_2: add here
	case "coffee":HotBeverage c= new Coffee("コーヒー");
	    return c;

	    case "tea":HotBeverage d= new Tea("紅茶");
		return d;
            default:
                throw new IllegalArgumentException("Unknown hot beverage type: " + type);
        }
    }
}

// 冷たい飲み物工場クラス: クラス名 ColdBeverageFactory
// Lesson14_2: add here
class ColdBeverageFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage(String type) {
        switch (type.toLowerCase()) {// 英語大文字は全て英語小文字へ変換
            // Lesson14_2: add here
	    case "water":ColdBeverage v= new Water("お水");
		return v;
		case "juice":ColdBeverage k= new Juice("ジュース");
		    return k;
            default:
                throw new IllegalArgumentException("Unknown hot beverage type: " + type);
        }
    }
}
