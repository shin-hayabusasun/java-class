class InsertionSortX {
    // フィールド
    private int[] sort_array;
 private long timeStart ;
    private long timeStop;
    // コンストラクタ
    private InsertionSortX() {
    }

    public InsertionSortX(int[] sort_array) {
        this.sort_array = sort_array;
    }

    // メソッド
    public void insertionSortX() {
	this.startTimer();
        int in, out, temp;
        for (out = 1; out < this.sort_array.length; out++) {
            assignCount++;
            temp = this.sort_array[out];
            in = out;
            while (in > 0 && compareValue(this.sort_array[in - 1] , temp) == -1) {
                assignCount++;
                this.sort_array[in] = this.sort_array[in - 1];
                in--;
            }
            assignCount++;
            this.sort_array[in] = temp;
            //System.out.print("temp =" + temp + " : ");
           //SortTest.display(sort_array); 
            // 経過を表示 SortTest.display();
        }
	this.stopTimer();
    }
    //Lesson26_2
    private int assignCount;
    private int compareCount;

    public int getAssignCount() {
        return assignCount;
    }

    public int getCompareCount() {
        return compareCount;
    }

    private int compareValue(int n1, int n2) {
        compareCount++;
        if (n1 > n2) {
            return -1;
        } else if (n1 < n2) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean checkSort() {
        for (int i = 1; i < this.sort_array.length; i++) {
            if (this.sort_array[i - 1] > this.sort_array[i]) {
                return false;
            }
        }
        return true;
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
