public class SelectionSort {
    //フィールド
    private int[] sort_array;
     private long timeStart ;
    private long timeStop;
    private int compareCount=0;
    private int assignCount=0;
    //コンストラクタ
    private SelectionSort() { }
    public SelectionSort(int[] sort_array) {
    this.sort_array = sort_array;
    }
    //メソッド
    public void swap(int x, int y) {
        int temp = this.sort_array[x];
this.sort_array[x] = this.sort_array[y];
this.sort_array[y] = temp;
	this.assignCount+=3;
    }
    public void selectionSort() {
	this.startTimer();
        int out, in, min;
	for (out = 0; out < this.sort_array.length - 1; out++){
	    min = out;
	    for (in = out + 1; in < this.sort_array.length; in++) {
			this.compareCount++;
		if (this.sort_array[in] < this.sort_array[min]) {
		    min = in;
		}
	    }
	    this.swap(out, min);
	    // 経過を表示
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
