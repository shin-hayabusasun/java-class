class ShellSort {
    // フィールド
    private int[] sort_array;
      private long timeStart ;
    private long timeStop;

    // コンストラクタ
    private ShellSort() {
    }

    public ShellSort(int[] sort_array) {
        this.sort_array = sort_array;
    }

    // メソッド
    public void shellSort() {
	
	this.startTimer();
        int in, out, temp, h;
        h = 1;
        while (h < this.sort_array.length / 3)
            h = h * 3 + 1; // Knuth's interval sequence
        while (h > 0) {
            // 動作確認用 System.out.println("h = " + h);
            for (out = h; out < this.sort_array.length; out++) {
                assignCount++;
                temp = this.sort_array[out];
                in = out;
                while (in > h - 1 && compareValue(this.sort_array[in - h] , temp) == -1) {
                assignCount++;
                    this.sort_array[in] = this.sort_array[in - h];
                    in -= h; // in = in – h;
                }
                assignCount++;
                this.sort_array[in] = temp;
                // 経過を表示 SortTest.display();
            }
            h = (h - 1) / 3; // Knuth's interval sequence
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
