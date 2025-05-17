public class Lesson20_2{
    public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		System.out.println("10進数 : " + num);
		System.out.print(" 2進数 : ");
		binary(num);
		System.out.println();
        System.out.print("16進数 : ");
        hexadecimal(num);
		System.out.println();
    }

	static void binary(int num){
		//-----add here-----
	    if(num>2){
	    binary(num/2);
	    System.out.print(num%2);
	    }
	    if(num<2){
	   
	    System.out.print(num%2);
	    }
	    

	}
    
    static void hexadecimal(int num){
        //-----add here-----
	String hex=Integer.toHexString(num%16).toUpperCase();
	 if(num>16){
	    hexadecimal(num/16);
	    System.out.print(hex);
	    }
	    if(num<16){
	   
		System.out.print(hex);
	    }
        
    }
}
