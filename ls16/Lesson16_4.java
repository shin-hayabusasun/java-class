public class Lesson16_4{
    public static void main(String args[]){
        StringArray ta = new StringArray(8);
        for(int i=0; i < ta.length; i++){
            ta.set("ARRAY-" + i, i);
        }
        ta.set("Suenobu", 0);
        ta.set("Nakayama", 1);
        ta.set("Ichinoki", 2);
        ta.set("Okazaki", 3);
        ta.set("Ogawa", 4);
        ta.set("Nishimura", 5);
        ta.set("Miyamoto", 6);
        ta.set("Yamasaki", 7);
        ta.printAll();

        System.out.println("========== Result ==========");
        System.out.println("-- M2 --");
        StringArray m2 = ta.trimming(0,1);
        printStringArray(m2);
        System.out.println("-- M1 --");
        StringArray m1 = ta.trimming(2,7);
        printStringArray(m1);
        System.out.println("-- Yamasaki --");
        StringArray yamasaki = ta.trimming(7, 7);
        printStringArray(yamasaki);
        System.out.println("-- Error1(is in range) --");
        StringArray error1 = ta.trimming(3,9);
        printStringArray(error1);
        System.out.println("-- Error2(from > to) --");
        StringArray error2 = ta.trimming(6,2);
        printStringArray(error2);
        System.out.println("============================");
    }

    public static void printStringArray(StringArray sa) {
        if (sa == null) {
            System.out.println("StringArray is Null.");
            return;
            }
        sa.printAll();
    }
}