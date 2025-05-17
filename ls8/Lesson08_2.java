public class Lesson08_2{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student(1270998);
        Student s3 = new Student(1250999, 4, "坂本龍馬", "システム工学群");

        System.out.println("学籍番号: " +s1.id + "  学年: " + s1.grade + "  名前: " + s1.name + "  学群: " + s1.course);
        System.out.println("学籍番号: " +s2.id + "  学年: " + s2.grade + "  名前: " + s2.name + "  学群: " + s2.course);
        System.out.println("学籍番号: " +s3.id + "  学年: " + s3.grade + "  名前: " + s3.name + "  学群: " + s3.course);
    }
}