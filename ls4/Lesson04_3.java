public class Lesson04_3 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください >> ");
        int n = new java.util.Scanner(System.in).nextInt();

        // ここから記述
	if(n==0||n==1){
	    System.out.print(n);
	    return;
	}
	
	
	int[] tin=new int[n+1];
	tin[0]=0;
	tin[1]=1;
	for(int i=2;i<n+1;i++){
	    tin[i]=tin[i-1]+tin[i-2];
	}
	
         System.out.print(n+"番目のフィぼなっち数は"+tin[n]+"です");
        // ここまで記述
    }
}
