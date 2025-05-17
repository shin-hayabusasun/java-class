public class Lesson05_5 {
    public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); // 残ってる石の数
		int playerID = 1; // playerを入れ替えるための引数
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while (true) {
			System.out.print("player" + playerID + " ... " + n + " >>> ");

			// ここから記述
			int o;
			if( playerID==2){
			    o=new java.util.Random().nextInt(3)+1;
				}
			else{
			o=new java.util.Scanner(System.in).nextInt();
			}
			if(o==1||o==2||o==3){
			for(int i=1;i<=o;i++){
			    n--;
			    if(n<=0){
				System.out.println();
				System.out.println("player"+playerID+"の負けです");
				return;
			    }
			    System.out.print(n+" ");
			    
			}
			}
			else{
			     System.out.print("無効な入力です");
			}
			 System.out.println();
			if(playerID==1){
			    playerID=2;
			}
			else{
			    playerID=1;
			}


			// ここまで記述
		}
    }
}
