public class Lesson07_4{
    public static void main(String[] args){
        int[] arr = new int[5];

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("数字を5個入力してください: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        //add here
	Statistics h=new Statistics();
	h.arr=arr;
	System.out.println("平均値:"+ h.average());
	System.out.println("分散:"+ h.variance());
	System.out.println("標準偏差:"+ h.deviation());
	 
    }    
}
