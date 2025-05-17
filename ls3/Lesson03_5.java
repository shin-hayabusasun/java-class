public class Lesson03_5 {
    public static void main(String[] args) {
        String[] array = {"d", "u", "s", "t", "y"};
        printArray(array);
        int m = 0, n = 3;
        System.out.println(m + "番目の要素と" + n + "番目の要素を交換"); 
        swap(array, m, n);
        printArray(array);
        int deleteIndex = 2;
        System.out.println(deleteIndex + "番目の要素を削除"); 
        String deletedElement = delete(array, deleteIndex);
        printArray(array);
        int insertIndex = 0;
        String insertElement = deletedElement;
        System.out.println("配列の" + insertIndex + "番目に文字列" + insertElement + "を追加"); 
        insert(array, insertIndex, insertElement);
        printArray(array);
    }

    /* -----ここから追加----- */

    public static void swap(String[] array,int m ,int n) {
	String v;
	v=array[m];
	array[m]=array[n];
	array[n]=v;
	
    }
    public static String delete(String[] array, int n){
	
	String v=array[n];
	    
	for(int i=n+1;i<array.length;i++){
	   
	    array[i-1]=array[i];
	   
	}
	array[array.length-1]=" ";

	return v;
    }
    public static void insert(String[] array, int n,String s){
	
	
	for(int i=0;i<n;i++){
	    array[i]=array[i];
	}
	
	
		for(int i=array.length-1;i>n;i--){
	    array[i]=array[i-1];
	}
		
	array[n]=s;	
	
    }
    /* -----ここまで追加----- */
    
    //配列の要素を結合して出力
    public static void printArray(String[] array){
        String str = "";
        for(int i = 0; i < array.length; i++){
            str += array[i];
        }
        System.out.println(str);
    }
}
