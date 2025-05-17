public class SelectionSort {
    //フィールド
    private int[] sort_array;
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
    }
    public void selectionSort() {
        int out, in, min;
for (out = 0; out < this.sort_array.length - 1; out++){
min = out;
for (in = out + 1; in < this.sort_array.length; in++) {
if (this.sort_array[in] < this.sort_array[min]) {
min = in;
}
} 
this.swap(out, min);
// 経過を表示
}
    }
    }