public class Lesson03_2 {
    public static void main(String[] args) {
        System.out.println(mul(2, 5));
        System.out.println(mul(2, 5, 10));
        System.out.println(mul(2, 5, 10.0));
    }
    
    /* -----ここから追加----- */
    public static int mul(int x,int y){
	return x*y;
    }
    public static int mul(int x,int y,int i){
	return x*y*i;
    }
    public static double mul(int x,int y,double i){
	return x*y*i;
    }

    
    
    /* -----ここまで追加----- */

}
