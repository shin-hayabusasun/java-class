public class Lesson14_2 {
    public static void main(String[] args) {
        BeverageFactory hotBeverageFactory = new HotBeverageFactory();
        BeverageFactory coldBeverageFactory = new ColdBeverageFactory();

        try {
            Beverage water = coldBeverageFactory.orderBeverage("water");
            System.out.println();

            Beverage coffee = hotBeverageFactory.orderBeverage("coffee");
            System.out.println();

            Beverage tea = hotBeverageFactory.orderBeverage("tea");
            System.out.println();

            Beverage juice = coldBeverageFactory.orderBeverage("juice");
            System.out.println();
        
            Beverage icedCoffee = coldBeverageFactory.orderBeverage("coffee");
            System.out.println();        
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
