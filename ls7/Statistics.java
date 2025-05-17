public class Statistics{
    int[] arr = new int[5];
    
    double average(){
        //add here
	double d=0;
	for(int i=0;i<5;i++){
	    d+=arr[i];
	}
	return d/5;
    }

    double variance(){
        //add here
	double a=0;
	for(int i=0;i<5;i++){
	    a+=Math.pow(arr[i]-average(),2);
	}
	return a/5;
    }

    double deviation(){
        //add here
        return Math.sqrt(variance());
    }
}
