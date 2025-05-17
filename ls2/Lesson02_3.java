import java.util.Scanner;
//-*- coding: utf-8 -*-
public class Lesson02_3{
	public static void main(String args[]){
		//引数を取得
	    String b= new java.util.Scanner(System.in).nextLine();
	    if(b.equals("Suenobu")){
		System.out.println("Shigemasu Lab");
		
	    }
	    else if(b.equals("Nakayama")){
		System.out.println("Matsuzaki Lab");
	    }
	    else if(b.equals("Miyamoto")||b.equals("Yamasaki")){
		System.out.println("Mendori Lab");
	    }
	    else{
		System.out.println("No such data");
	    }
	    
		
		//nameに応じた処理を追加する

	}
}
