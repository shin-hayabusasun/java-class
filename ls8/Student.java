public class Student{
    int id;
    int grade;
    String name;
    String course;

    //Lesson08_1 add here
    Student(){
	this.id=1270997;
	this.grade=2;
	this.name="高知太郎";
	this.course="情報学群";
    }
    //Lesson08_2 add here
     Student(int id){
	this.id=id;
	this.grade=2;
	this.name="山田花子";
	this.course="情報学群";
    }
    Student(int id,int grade,String name,String course){
	this.id=id;
	this.grade=grade;
	this.name=name;
	this.course=course;
    }
   

    //Lesson08_3 add here
    Subject h=new Subject("情報学群実験第１",1,"火, 金曜",3);
    
}
