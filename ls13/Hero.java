class Hero {
    private String name;
    private int level;
    
    public Hero() {
        this.name = "名無し";
        this.level = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    //Lesson13_4 add here
    public void setName(String name) {
	if(name.length()>=2&&name.length()<9){
	this.name=name;
	}
	else{
	    throw new NameOutOfBoundsException("設定できない名前です (名前: "+name+")");
	}
    }
    public void setLevel(int lv){
	if(lv>0 &&lv<=100){
	    this.level=lv;
	}
	else{
	    throw new LevelOutOfBoundsException("設定できないレベルです (レベル: "+lv+")");
	}
}
    
}
