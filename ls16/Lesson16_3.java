public class Lesson16_3{
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

        System.out.println("======== Result =======");
        printReplaceNum(ta.replace("Mendori", "Takeuchi"));
        printReplaceNum(ta.replace("Ogawa", "Okazaki"));
        ta.printAll();
        System.out.println();
        String tmp = "Oka";
        tmp += "zaki";
        printReplaceNum(ta.replace(tmp, "Nakayama"));
        ta.printAll();
        System.out.println("========================");
    }

    public static void printReplaceNum(int num){
        if(num == 1){
            System.out.println("Replace " + num + " Element.");
        }else if(num >= 2){
            System.out.println("Replace " + num + " Elements.");
        }else{
            System.out.println("Couldn't find ...\n");
        }
    }
}