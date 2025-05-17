public class Lesson03_3 {
    public static void main(String[] args) {
        int[] scores = {88, 64, 53, 69, 70, 87, 48, 99, 60, 98}; 
        
        System.out.println("最高点 : " + maxScore(scores) + "点"); 
        System.out.println("最低点 : " + minScore(scores) + "点"); 
        System.out.println("平均点 : " + aveScore(scores) + "点");
    }
        
    /* -----ここから追加----- */
   
public static int maxScore(int[] args) {
    int c=0;
    for(int i=0;i<args.length;i++){
	if(c<args[i]){
	    c=args[i];
	}
    }
    return c;
}
    public static int minScore(int[] args) {
    int c=args[0];
    for(int i=0;i<args.length;i++){
	if(c>args[i]){
	    c=args[i];
	}
    }
    return c;
}
     public static double aveScore(int[] args) {
	 int v=0;
	 for(int i=0;i<args.length;i++){
	     v+=args[i];
	 }
	 return (double) v/args.length;
     }
    /* -----ここまで追加----- */

}
