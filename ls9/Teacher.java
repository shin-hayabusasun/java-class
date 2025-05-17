class Teacher {
    private String name;
    private String lab;

    //ここから記述
    Teacher(){
	this.name="竹内先生";
	this.lab="ゲーム情報研究室";
    }
    
    String getName(){
	return this.name;
    }
    String getLab(){
	return this.lab;
    }
    

    /* 以降Lesson09_3 */
    //ここから記述
    void setName(String name){
	this.name=name;
    }
     void setLab(String lab){
	this.lab=lab;
    }

}
