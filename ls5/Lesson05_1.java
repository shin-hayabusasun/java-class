public class Lesson05_1 {
    public static void main(String[] args) {
	
        // ここから記述
	System.out.println("好きな文字列を入力してください");
	while(true){
	System.out.print("input:");
	String a= new java.util.Scanner(System.in).nextLine();
	
	
	if(a.equals("exit")){
		break;
	    }
	    else{
		System.out.println("output:"+a);
	    }
	    }

 	    // ここまで記述
    }
}
