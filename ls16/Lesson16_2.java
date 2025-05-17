public class Lesson16_2{
    public static void main(String[] args){
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

        System.out.println("========== Result1 ==========");
        System.out.println("! Exchange the StringArray !");
        System.out.println();
        ta.exchange(0,1);
        ta.exchange(1,5);
        ta.exchange(2,4);
        ta.exchange(3,6);
        ta.printAll();
        System.out.println("============================");

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
        System.out.println();
        System.out.println("========== Result2 ==========");
        System.out.println("! Exchange the StringArray !");
        System.out.println();
        ta.exchange(-1,3);
        ta.printAll();
        System.out.println("============================");
    }
}