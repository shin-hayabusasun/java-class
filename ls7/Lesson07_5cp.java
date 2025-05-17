public class Lesson07_5cp{
    public static void main(String[] args){
        final int[] even = {0, 2, 4, 6, 8, 10};
        final int[] odd = {1, 3, 5, 7, 9, 11};

        //add here
	CalArray h=new CalArray();
	

	    h.name="Even";
	    h.add(even);
	    h.mul(even);
	    h.output();
	    CalArray hl=new CalArray();
  hl.name="Odd";
	    hl.add(odd);
	    hl.mul(odd);
	    hl.output();
	    
	
	  h.name="Even&Odd";
	    h.add(odd);
	    h.mul(odd);
	    
	    h.output();
    }    
}
