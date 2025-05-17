class InsertionQuickSort{
    private int threshold;
    private int sort_array[];
    private int assignCount =0;
    private int compareCount=0;
    private long timeStart ;
    private long timeStop;
    public InsertionQuickSort(int[] sort_array){
        this.sort_array=sort_array;
    }
    public void setThreshold(int thresh){
        this.threshold=thresh;
    }
    public void insertionQuickSort(int from, int to){
        this.startTimer();
        int left = from;
	    int right = to;
        int pivot = this.sort_array[(from + to)/2];
        
   
        if (from >= to) return;//基底条件（base case）
        if(to-from<this.threshold){ int in, out, temp;
            for (out = from+1; out < to+1; out++) {
                this.assignCount++;
            temp = this.sort_array[out];
            in = out;
            while (in > from && compareValue(this.sort_array[in - 1] , temp) == -1) {
               this.assignCount++;
                this.sort_array[in] = this.sort_array[in - 1];
                in--;
             //this.display();
            }
           this.assignCount++;
            this.sort_array[in] = temp;
            //System.out.print("temp =" + temp + " : ");
            //SortTest.display(sort_array); 
            // 経過を表示 SortTest.display();
            } 
            }
           
        else{   //System.out.println("pivot="+pivot+"from="+from+"to="+to);
       
   
	    // System.out.print("pivot = " + pivot); // 動作確認用
	   
	    // 以下のprintlnは動作確認用
	    //System.out.println(", from = " + from + ", to " + to);
	    while (left <= right) {
		while (this.compareValue(this.sort_array[left] ,pivot)==1) left++;
		while (this.compareValue(this.sort_array[right], pivot)==-1)right--;
        
		if (left <= right) {
		    this.swap(left, right);
            //this.display();
		    // 経過の表示 SortTest.display(sort_array);
		    left++;
		    right--;
		} 
	    } 
        
	    this.insertionQuickSort(from, right);
	    this.insertionQuickSort(left, to);
        }
            
            this.stopTimer();
    }
    private int compareValue(int n1, int n2) {
        this.compareCount++;
        if (n1 > n2) {
            return -1;
        } else if (n1 < n2) {
            return 1;
        } else {
            return 0;
        }
    }
    public  void display() {
       
        for (int element: this.sort_array) {
	    System.out.print(element + " ");
        }
        System.out.println();
    }
    public void swap(int i, int j) {
	int temp = this.sort_array[i];
	this.sort_array[i] =this.sort_array[j];
	this.sort_array[j] = temp;
    assignCount+=3;
    }
    public int getAssignCount() {
        return this.assignCount;
    }
    public int getCompareCount(){
        return this.compareCount;
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
}
