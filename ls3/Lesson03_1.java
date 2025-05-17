 //-encoding UTF-8
public class Lesson03_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16};

        /* -----ここから追加----- */

        System.out.println("配列の長さ:"+array.length);
    
        /* -----ここまで追加----- */
	int i=0;
	for(int t=0;t<array.length;t++){
	    i+=array[t];
	}
	System.out.println("要素の合計:"+i);

    }
}
