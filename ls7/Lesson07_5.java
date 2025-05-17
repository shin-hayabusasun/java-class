public class Lesson07_5{
    public static void main(String[] args){
        final int[] even = {0, 2, 4, 6, 8, 10};
        final int[] odd = {1, 3, 5, 7, 9, 11};

        //add here
	CalArray[] h=new CalArray[3];
	for(int i=0;i<3;i++){
	    h[i]=new CalArray();
	}
       
	
	int[] name[]={even,odd};
	String dname[]={"Even","Odd","Even&Odd"};
	    
	for(int i=0;i<2;i++){
	    h[i].name=dname[i];
	    h[i].add(name[i]);
	    h[i].mul(name[i]);
	    h[i].output();

	    }
	
	  h[2].name=dname[2];
	    h[2].add(even);
	    h[2].mul(odd);
	    h[2].add(odd);
	    h[2].mul(even);
	    h[2].output();
    }    
}
