public class Lesson04_5 {
    // ここから記述
  public static boolean isPrime(int n){
	for(int i=2;i<n;i++){
	    if(n%i==0){
		return true;
	    }
	}
	return false;
    }
    public static int countPrime(int number){
	int f=0;
	for(int i=2;i<=number;i++){
	    if(!(isPrime(i))){
		f++;
	    }
	}
	return f;
    }
    public static void printAll(int number){
	int a=2;
        while(a<=number){
	    if(!(isPrime(a))){
		System.out.print(a+" ");
		
	       
	    }
	    a++;
	}
	    
    }
    
    // ここまで記述
    public static void main(String[] args) {
        System.out.print("整数を入力してください >> ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(n + "以下に素数は" + countPrime(n) + "個あります");
        printAll(n);
    }
}
