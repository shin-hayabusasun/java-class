public class Lesson17_5 {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.insert(1, "C");
        list.insert(1, "A");
        list.insert(1, "D");
        list.insert(1, "E");
        list.insert(1, "B");
        list.printAll();
        System.out.println("------sort-------");
        list.stringListSort();
        list.printAll();
    }
}
