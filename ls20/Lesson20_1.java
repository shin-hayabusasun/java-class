public class Lesson20_1{
    public static void main(String[] args){
	    int num1 = Integer.parseInt(args[0]);
	    int num2 = Integer.parseInt(args[1]);
	    System.out.println("sum : " + sum(num1, num2));
	    System.out.println("mul : " + mul(num1, num2));
    }
    
    static int sum(int num1, int num2) {
        //-----add here-----
	
	if(num1+1==num2){
	    return num1+num2;
	}
	else if(num1==num2){
	    return num1;
	}
	return sum(num1,num2-1)+num2;
        
    }
    
    static int mul(int num1, int num2){
    	//-----add here-----
        if(num1+1==num2){
	    return num1*num2;
	}
	else if(num1==num2){
	    return num1;
	}
	return mul(num1,num2-1)*num2;
    }
}
