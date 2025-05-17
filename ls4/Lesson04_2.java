public class Lesson04_2 {
    public static void main(String[] args) {
        // ここから記述
	int n=0;
	while(true){
	System.out.print("整数またはexitを入力してください >>");
	String a=new java.util.Scanner(System.in).nextLine();
	if(a.equals("exit")){
	    
	    break;
	    }
	n+= Integer.parseInt(a);
	    System.out.println(n);
	}
        // ここまで記述
    }
}
