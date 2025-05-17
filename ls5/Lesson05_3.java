public class Lesson05_3 {
    public static void main(String[] args) {

	// ここから記述
	if(args.length==2){
	    int aa= Integer.parseInt(args[0]);
	    int bb= Integer.parseInt(args[1]);
	    if(bb==0){
		System.out.println("ゼロ除算です");
    
		return;
	    }
	    
	    
	    System.out.println(aa+"を"+bb+"で割った商は"+aa/bb+"です");
	    System.out.println(aa+"を"+bb+"で割った剰余は"+aa%bb+"です");
	}
	else{
	    System.out.println("コマンドラインを２つ入力してください");}
    }

    // ここまで記述
}


