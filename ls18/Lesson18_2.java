public class Lesson18_2 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1,"A");
        list.insert(2, "garbage");
        list.insert(3, "B");
        list.insert(4, "garbage");
        list.insert(5, "C");
        list.insert(6, "garbage");
        list.insert(7, "D");
        System.out.println("/*   list length:" + list.getLength() + "   */");
        list.printAll();
        System.out.println("/*   search   */");
        System.out.println("search \"A\" : " + list.searchForward("A"));
        System.out.println("search \"garbage\" : " + list.searchForward("garbage"));
        System.out.println("search \"C\" : " + list.searchBackward("C"));
        System.out.println("search \"garbage\" : " + list.searchBackward("garbage"));
        System.out.println("search \"E\" : " + list.searchBackward("E"));
    }

}
