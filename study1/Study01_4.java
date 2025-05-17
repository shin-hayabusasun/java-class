public class Study01_4{
    public static void main(String[] args){
        int[] day={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] S={"sun","mon","tue","wed","thu","fri","sat"};
        String[] y={"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
        int st=0;
        for(int i=0;i<7;i++){
            if(args[0].equals(S[i])){
                st=i;
            }
        }
        while(true){
	    System.out.print("調べたい日付を入力してください(4月3日 => 4 3) :");
	    String input=new java.util.Scanner(System.in).nextLine();
	    String[] H =input.split(" ");
	    int a= Integer.parseInt(H[0]);
	    int b= Integer.parseInt(H[1]);
       
	    int sa=0;
	    if(a==0 && b==0){
		System.out.print("処理を終了します");
		break;
	    }
	    else if((a<=0 || a>12) || b>day[a-1]){
		System.out.println("調べたい日付が不正な組み合わせです");
    
	    }
	    else{
		if(a>1){
		    for(int i=0;i<a-1;i++){
			sa+=day[i];
		    }
		    sa+=b-1;
    
    
		}
		else{
      
		    sa+=b-1;
  
		}
		int saday=sa%7;
   
		System.out.println(a+"月"+b+"日は"+y[saday+st]+"です");
    
	    }

	}
    }
}
