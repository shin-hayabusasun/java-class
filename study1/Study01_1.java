public class Study01_1{
    public static void main(String args[]) {
        int n= Integer.parseInt(args[0]);
        int j=1;
        
        for(int i=n;i>=0;i--){
            for(int h=0;h<i;h++){
                System.out.print(" ");
            }
            int k=1;
            while(k<=j){
                System.out.print("*");
                k++;
            }
            System.out.println();
	    j+=2;
	}
	j-=4;
	for(int i=1;i<=n;i++){
	    for(int h=0;h<i;h++){
		System.out.print(" ");
	    }
	    int k=1;
	    while(k<=j){
		System.out.print("*");
		k++;
	    }
	    System.out.println();
	    j-=2;
	}
    }
}
