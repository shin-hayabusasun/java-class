public class Lesson05_2 {
    public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);  // 高さ

		// ここから記述
		if(input==0){
		    System.out.println("1以上の数を入力してください");
		}
		else{
		    int a=1;
		    for(int i=1;i<input;i++){
			a+=2;
		    }
		     

		    int v=1;
		    for(int t=a;t>0;t-=2){
			
			for(int i=0;i<t;i++){
			    System.out.print("*");
			}
			  
			     System.out.println();
			     for(int i=0;i<v;i++){
			     System.out.print(" ");
			     }
			     v++;
		    } 
		    
		}


		//ここまで記述	
    }
}
