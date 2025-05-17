class QuickSort {
    //フィールド
    private int[] sort_array;
    private int assignCount =0;
    private int compareCount=0;
     private long timeStart ;
    private long timeStop;
    //コンストラクタ
    private QuickSort() {}
    public QuickSort(int[] sort_array) {
    this.sort_array = sort_array;
    }
    //メソッド
    public void swap(int i, int j) {
        int temp = this.sort_array[i];
        this.sort_array[i] =this.sort_array[j];
        this.sort_array[j] = temp;
	assignCount+=3;
    }
    public void quickSort() {
    this.quickSort(0, this.sort_array.length - 1);
    }
    public void quickSort(int from, int to) {
	this.startTimer();
        if (from >= to) return;//基底条件（base case）
int pivot = this.sort_array[(from + to)/2];
// System.out.print("pivot = " + pivot); // 動作確認用
int left = from;
int right = to;
// 以下のprintlnは動作確認用
//System.out.println(", from = " + from + ", to " + to);
while (left <= right) {
    while (this.compareValue(this.sort_array[left] ,pivot)==1) left++;
    while (this.compareValue(this.sort_array[right], pivot)==-1) right--;
if (left <= right) {
this.swap(left, right);
// 経過の表示 SortTest.display(sort_array);
left++;
right--;
}
}
this.quickSort(from, right);
this.quickSort(left, to);
this.stopTimer();
    }
    public int getAssignCount(){
	return this.assignCount;
    }
    public int getCompareCount(){
	return this.compareCount;
    }
    private int compareValue(int n1, int n2){
	this.compareCount++;
        if (n1 > n2) {
            return -1;
        } else if (n1 < n2) {
            return 1;
        } else {
            return 0;
        }
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
