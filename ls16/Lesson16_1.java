public class Lesson16_1{
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

        StringArray check = new StringArray(4);
        check.set("Ichinoki", 0);
        check.set("Mendori", 1);
        check.set("Nishimura", 2);
        String temp = "Miya";
        temp += "moto";
        check.set(temp,3);
        System.out.println("========= Result =========");
        System.out.println("! Searched the Number !");
        for(int i = 0; i < check.length; i++){
            if(ta.search(check.get(i)) != -1){
                System.out.println(String.format(check.get(i) + " found!!"));
                System.out.println(String.format(check.get(i) + " : Index Number is " + ta.search(check.get(i))));
            } else {
                System.out.println(String.format(check.get(i) + " not found..."));
                System.out.println(String.format(check.get(i) + " : Index Number can not be found."));
            }
            if(i != check.length-1) System.out.println();
        }
        System.out.println("==========================");
    }
}