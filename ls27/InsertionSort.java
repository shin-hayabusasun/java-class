public class InsertionSort {
    private int[] sort_array;
    private long timeStart ;
    private long timeStop;
    private int compareCount=0;
    private int assignCount=0;
    
    private InsertionSort() {}
    public InsertionSort(int[] array) {
        this.sort_array = array;
    }
    private void swap(int x, int y) {
        int temp = this.sort_array[x];
        this.sort_array[x] = this.sort_array[y];
        this.sort_array[y] = temp;
	this.assignCount+=3;
    }

    // Lesson25_1
    public void insertionSort(){
	this.startTimer();
	for(int i=1;i<this.sort_array.length;i++){
	    int i1=i;
	    for(int j=i-1;j>=0;j--){
		this.compareCount++;
		if(this.compareValue(i1,j)==1){
		    this.swap(i1,j);
		    i1--;
		}
		else{
		    break;
		}
		
	
	    }
	}
	this.stopTimer();
    }

    // Lesson25_2
    public boolean checkSort(){
	int i;
	for(i=0;i<this.sort_array.length-1;i++){
	    
	    if(this.sort_array[i]>this.sort_array[i+1]){
	
		return false;
	    }
	}

	    return true;

    }

    // Lesson25_3
    public void startTimer(){
	this.timeStart=System.nanoTime();
    }
    public void stopTimer(){
	this.timeStop=System.nanoTime();
    }
    public long getSortTime(){
	return this.timeStop-this.timeStart;
    }

    // Lesson25_4
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
