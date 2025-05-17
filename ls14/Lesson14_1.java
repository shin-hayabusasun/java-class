public class Lesson14_1 {
    public static void main(String[] args) {
        Beverage[] beverages = {new Water("お水"), new Coffee("コーヒー")};
        for (Beverage b : beverages) {
            
            b.serve();
            System.out.println();
        }
    }
}
