import java.util.Random;

public class Lesson24_2 {
    public static void main(String[] args) {
  
        MyHashtable ht = new MyHashtable(10);

        ht.put(new AddressData("Chono","President", "Main Build.", "VIP room"));
        ht.put(new AddressData("Mendori","Teacher", "Mendori Lab", "A307"));
        ht.put(new AddressData("Takeuchi","Teacher", "Takeuchi Lab","A501"));

        ht.put(new AddressData("Suenobu","M2", "Kurihara Lab", "A360"));
	    ht.put(new AddressData("Nakayama","M2","Matsuzaki Lab", "A310"));

	    ht.put(new AddressData("Ogawa","M1", "Shikida Lab", "A358"));
	    ht.put(new AddressData("Okazaki","M1", "Shikida Lab", "A358"));
        ht.put(new AddressData("Nishimura","M1", "Yokoyama Lab", "A359"));
	    ht.put(new AddressData("Miyamoto","M1", "Mendori Lab", "A307"));
	    ht.put(new AddressData("Yamasaki","M1", "Mendori Lab", "A307"));
	    ht.put(new AddressData("Ichinoki","M1", "Iwata Lab", "A312"));
        System.out.println("------------- MyHashtable1 -------------");
        ht.printAll();

        System.out.println("Number of added elements: 10");
        System.out.println("Collision times: " + ht.getCollision());
        System.out.println();

        /*
         *  チェック用，正確性の判定コード．
         *  check メソッドを理解する必要はない
         *  正しい出力が得られた場合は正答
         *  間違えている場合は，もう一度MyHashtable.javaを見直してみてください．
         */
        System.out.println("---------- (check)MyHashtable2 ----------");
        check();
    }

    public static void check() {
        final int NUM = 10007; // ハッシュテーブルのサイズ
        final int N = 7000; // ハッシュテーブルに入れる要素の個数
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random(1);
        MyHashtable table = new MyHashtable(NUM);

        for (int i = 0; i < N; i++) {
            // 名前(キー)をランダム生成(A-Za-z0-9からなる1～20文字)
            StringBuffer tmp = new StringBuffer();
            int n = r.nextInt(20) + 1;
            for (int j = 0; j < n; j++) {
                int c = r.nextInt(chars.length());
                tmp.append(chars.charAt(c));
            }
            table.put(new AddressData(tmp.toString(), "Kochi", "Kami", "782-0003"));
        }

        System.out.println("Size of the hashtable: " + NUM);
        System.out.println("Number of added elements: " + N);
        System.out.println("Number of elements in the hashtable: "+ table.elementNum()); // Lesson24_2
        System.out.println("Collision times: " + table.getCollision()); // Lesson24_3
    }
}
