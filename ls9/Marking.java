class Marking {
    private int score[] = new int[10];
    private int total_score;

    Marking() {
        for (int i = 0; i < score.length; i++) {
            score[i] = 0;
        }
        total_score = 0;
    }

    //ここから記述
    void setScore(int array_num,int score){
	if(score>=0&&score<=10){
	this.score[array_num]=score;
	}
	else{
	    throw new IllegalArgumentException(score+"が0~10の範囲外の値であるため,処理を中断します。");
	}
    }
    int computeSum(){
	this.total_score=0;
	for(int i=0;i<10;i++){
	    this.total_score+=this.score[i];
	}
	return this.total_score;
    }


}
