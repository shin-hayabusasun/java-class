public class Lesson04_1 {
    public static void main(String[] args) {
        System.out.print("出力する三角形の高さを入力してください >> ");
        int height = new java.util.Scanner(System.in).nextInt();

    //ここから記述
	for(int i=height;i>0;i--){
	    int a=0;
	    while(i!=a){
		System.out.print("*");
		a++;
	    }
	    System.out.println();
	}
    
    // ここまで記述

}
}
