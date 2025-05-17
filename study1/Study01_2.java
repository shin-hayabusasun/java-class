public class Study01_2{
    public static boolean ja(String[] ay,String[] deta){
        for(int i=0;i<deta.length-ay.length+1;i++){
            if(deta[i].equals(ay[0])){
                int j;
                for(j=i;j<i+ay.length;j++){
                    if(!(deta[j].equals(ay[j-i]))){
                        break;
                    }
                }
                if(j==i+ay.length){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
	while(true){
	    System.out.print("検索したい文字列を入力してください(終了時は入力なしで　Enter):");
	    String a=new java.util.Scanner(System.in).nextLine();
	    if(a.equals("")){
		System.out.println("処理を終了します");
		break;
	    }
	    String[] array = a.split("");
	    String deta[];
      
	    for(int i=0;i<args.length;i++){
		deta=args[i].split("");
                if(ja(array,deta)){
                    System.out.print(args[i]+" ");
                    System.out.println();
                }
            
	    }
	}
    }
}
