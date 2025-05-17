import java.util.InputMismatchException;

public class Lesson13_2 {
    public static void main(String[] args) {
	try{
	    int x = Integer.parseInt(args[0]);
	    System.out.print("割る数を入力してください: ");
	    java.util.Scanner scan = new java.util.Scanner(System.in);
	    int y = scan.nextInt();
	    System.out.println(x + " / " + y + " = " + (x / y));
	}
	catch(InputMismatchException e){
	    System.out.println("標準入力の形式が正しくないため例外発生！");
	}
	catch(ArithmeticException e){System.out.println("ゼロ除算をしようとしたため例外発生！");}
	catch(NumberFormatException e){ System.out.println("コマンドライン引数の形式が正しくないため例外発生！");}
	catch(ArrayIndexOutOfBoundsException e){System.out.println("コマンドライン引数が入力されなかったため例外発生！");}
    }
}
