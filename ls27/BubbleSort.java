public class BubbleSort {
//フィールド
private int[] sort_array;
    private long timeStart ;
    private long timeStop;
    private int compareCount=0;
    private int assignCount=0;
//コンストラクタ
private BubbleSort() {}
public BubbleSort(int[] sort_array){
this.sort_array = sort_array;
}
//メソッド
public void swap(int x, int y) {
    	
    int temp = this.sort_array[x];
this.sort_array[x] = this.sort_array[y];
this.sort_array[y] = temp;
	this.assignCount+=3;
}
public void bubbleSort() {
    this.startTimer();
    for(int i = this.sort_array.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
	    	this.compareCount++;
        if (this.sort_array[j] > this.sort_array[j + 1]) {
        this.swap(j, j + 1);
        // 経過を表示
        }
        }
        }
    	this.stopTimer();
}
 public boolean checkSort(){
	int i;
	for(i=0;i<this.sort_array.length-1;i++){
	    if(this.sort_array[i]>this.sort_array[i+1]){
		break;
	    }
	}
	if(i==this.sort_array.length-1){
	    return true;
	}
	return false;
    }

    public void startTimer(){
	this.timeStart=System.nanoTime();
    }
    public void stopTimer(){
	this.timeStop=System.nanoTime();
    }
    public long getSortTime(){
	return this.timeStop-this.timeStart;
    }

     public int getAssignCount(){
	return this.assignCount;
    }
    
    public int getCompareCount() {
	return this.compareCount;
    }
    public int compareValue(int n1, int n2){
	if(this.sort_array[n1]>this.sort_array[n2]){
	    return -1;
	}
	else if(this.sort_array[n1]<this.sort_array[n2]){
	    return 1;
	}
	else{
	    return 0;
	}
    }
    
}
