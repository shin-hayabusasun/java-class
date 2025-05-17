public class Lesson24_1 {
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

		System.out.println("------------ MyHashtable ------------");
        ht.printAll();

        System.out.println("Number of added elements: 10");
        System.out.println("Number of elements in the hashtable: " + ht.elementNum());
        System.out.println();

        ht.clear();

        System.out.println("------------ MyHashtable ------------");
        ht.printAll();

        System.out.println("Number of elements in the hashtable: " + ht.elementNum());
    }
}
