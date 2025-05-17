public class Lesson17_2 {
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		list.insert(1, "E");
		list.insert(1, "D");
		list.insert(1, "C");
		list.insert(1, "B");
		list.insert(1, "A");

		System.out.println("-----search------");
		list.printAll();
		System.out.println("Legnth: " + list.getLength() + "\n");
		System.out.println("search element A");
		int index = list.search(new String("A"));
		System.out.println("index of A: " + index + "\n");
		System.out.println("search element X");
		index = list.search(new String("X"));
		System.out.println("index of X: " + index);
		System.out.println();
		System.out.println("-----remove------");
		System.out.println("remove Element: E");
		list.remove(new String("E"));
		list.printAll();
		System.out.println("Legnth: " + list.getLength() + "\n");
		System.out.println("remove Element: X");
		list.remove(new String("X"));
	}
}
