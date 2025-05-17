public class Lesson18_4 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1, "A");
        list.insert(2, "B");
        list.insert(3, "garbage");
        list.insert(4, "garbage");
        list.insert(5, "C");
        list.insert(6, "D");
        list.insert(7, "E");
        list.insert(8, "bug");
        list.insert(9, "bug");
        list.insert(10, "bug");
        list.insert(11, "F");
        System.out.println("/*   printAll   */");
        list.printAll();

        System.out.println("/*   cut from 0 to 1   */");
        list.cut(0, 1);
        System.out.println();

        System.out.println("/*   cut from 100 to 150   */");
        list.cut(100, 150);
        System.out.println();

        System.out.println("/*   cut from 3 to 1   */");
        list.cut(3, 1);
        System.out.println();

        System.out.println("/*   cut from 3 to 4   */");
        list.cut(3, 4);
        System.out.println("/*   list length:" + list.getLength() + "   */");
        list.printAll();

        System.out.println("/*   cut from 6 to 8   */");
        list.cut(6, 8);
        System.out.println("/*   list length:" + list.getLength() + "   */");
        list.printAll();

    }
}
    
