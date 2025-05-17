public class Lesson04_4 {
    // ここから記述
    public static boolean isPrime(int n){
	for(int i=2;i<n;i++){
	    if(n%i==0){
		return false;
	    }
	}
	return true;
    }
    
    // ここまで記述

    public static void main(String[] args) {
        System.out.print("整数を入力してください >> ");
        int n = new java.util.Scanner(System.in).nextInt();

        if(isPrime(n)) {
            System.out.println(n + "は素数です");
        } else {
            System.out.println(n + "は素数ではありません");
        }
    }
}
