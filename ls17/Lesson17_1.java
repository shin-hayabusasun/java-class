public class Lesson17_1 {
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		list.insert(1, "B");
		list.insert(1, "A");
		list.insert(3, "C");
		list.printAll();

		System.out.println("Length : " + list.getLength());

		System.out.println("------insert------");
		list.append("D");
		list.printAll();

		System.out.println("Length : " + list.getLength());
	}
}
