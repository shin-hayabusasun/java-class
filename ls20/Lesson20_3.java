public class Lesson20_3{
    public static void main(String[] args){
	    int max = Integer.parseInt(args[0]);
	    int num = max;
	    pascal(num, max);
    }
    
    static int[] pascal(int num, int max) {
	    //-----add here-----
	int[] ar=new int[num];
	if(num==1){
	    ar[0]=1;
	}
	
	else{
	ar[0]=1;
	ar[num-1]=1;
	}
	if(num>2){
	     int[] b=pascal(num-1,max);
	for(int i=1;i<num-1;i++){
	    ar[i]=b[i-1]+b[i];
	}
	}
	if(num==2){
	    pascal(num-1,max);
	}
	print(ar,max);
	return ar;
        
    }

    static void print(int[] array, int max){
    	//-----add here-----
	int a=max-array.length;
	for(int i=0;i<a;i++){
	     System.out.print("   ");
	}
	for(int i=0;i<array.length;i++){
	    System.out.printf(" %5d",array[i]);
	}
	System.out.println();
       
    }
}
