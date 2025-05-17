class Student {
    private String name;
    private int age;
    private double height;
    private double weight;

    Student() {
        this.name = "高知 太郎";
        this.age = 20;
        this.height = 1.75;
        this.weight = 67.0;

    }

    //ここから記述
    void showProf(){
	System.out.println("名前:"+this.name);
	System.out.println("年齢:"+this.age);
	System.out.println("身長:"+this.height);
	System.out.println("体重:"+this.weight);
	System.out.println("BMI:"+this.weight/(this.height*this.height));
    }
}

