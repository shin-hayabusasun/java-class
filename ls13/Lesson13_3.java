import java.util.InputMismatchException;
public class Lesson13_3 {
    public static void main(String[] args) {
        int correctCount = 0; //正常に計算した回数
        int exceptCount = 0; //例外が発生した回数
        while (true) {

            //Lesson13_3 add here
	    try{
		System.out.print("割られる数を入力してください: ");
        String str = new java.util.Scanner(System.in).nextLine();
	if(str.equals("exit")){
		return;
	    }
	int x = Integer.parseInt(str);
		System.out.print("割る数を入力してください: ");
        	java.util.Scanner sc = new java.util.Scanner(System.in);
		int y = sc.nextInt();
		System.out.println(x+"/"+y+"="+x/y);
		correctCount++;
	    }
	    catch(InputMismatchException e){
		System.out.println("標準入力の形式が正しくないため例外発生！");
		exceptCount++;
	    }
	    catch(ArithmeticException e){System.out.println("ゼロ除算をしようとしたため例外発生！");
		exceptCount++;
	    }
	    catch(NumberFormatException e){
		System.out.println("標準入力の形式が正しくないため例外発生！");
			exceptCount++;
	    }
	    finally{
		System.out.println("正常に計算した回数:"+correctCount);
		System.out.println("例外が発生した回数:"+exceptCount);
	    }

    
	      
        }
    }
}
