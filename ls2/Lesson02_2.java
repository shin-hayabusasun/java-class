//-*- coding: utf-8 -*-
import java.util.*;
public class Lesson02_2{
	public static void main(String args[]){
		//ランダムな値を取得
	    int n=new java.util.Random().nextInt(4);
	    System.out.println("n="+n);
	    if(n==0){
		System.out.println("Suenobu");
	    }
	    else if(n==1){
		    System.out.println("Nakayama");
		}
	    else if(n==2){
		    System.out.println("Minamoto");
		}
	    else{
			System.out.println("Nishimura"); 
	    }

	//nの値を出力

		//nの値に応じた処理を行う
	}
}
