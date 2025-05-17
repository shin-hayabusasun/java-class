public class StringArray{
    private String[] array;
    public final int length;
    public StringArray(int size){
        this.length=size;
        this.array=new String[size];
    }
    private StringArray(){
        this.length=0;
    }
    public boolean set (String obj,int index){
        if(index<0||index>this.length-1){
            System.out.println("ArrayIndexOutOfBoundsException!");
            return false;
        }
        this.array[index]=obj;
        return true;

    }
    public String get(int index){
        if(index<0||index>this.length-1){
            System.out.println("ArrayIndexOutOfBoundsException!");
            return null;
        }
        return this.array[index];

    }
    public void printAll(){
        for(int i=0;i<this.length;i++){
            System.out.println("this.array["+i+"]="+this.array[i]);
        }
    }
    public String toString(){
        StringBuffer sb =new StringBuffer();
        int i=0;
        for(String s:this.array){
            sb.append("this.array["+(i++)+"]="+s+"\n");
        }
        return sb.toString();
    }
    public int search(String str){
	int i=0;
	for(String s :this.array){
	    if(s.equals(str)){
		    return i;
	    }
	    i++;
	}
	        return -1; 
    }
    public void exchange(int index1,int index2){
	if(index1<0||index1>this.length-1||index2<0||index2>this.length-1){
	    System.out.println("ArrayInedxOutOfBoundsException!");
	    return;
	}
	String c=this.array[index1];
	this.array[index1]=this.array[index2];
	this.array[index2]=c;
    }
    public int replace(String obj1,String obj2){
	int i=0;
	int j=0;
	System.out.println(obj1+"->"+obj2);
	for(String s:this.array){
	    if(s.equals(obj1)){
		this.array[i]=obj2;
		j++;
	    }
	    i++;
	}
	if(j!=0){
	    return j;
	}
	else{
	    return -1;
	}
    }
    public StringArray trimming(int from,int to){
	if(from<0||from>this.length-1||to<0||to>this.length-1){
	    System.out.println("ArrayInedxOutOfBoundsException!");
	    return null;
	}
	if(from>to){
	    System.out.println("NegativeArraySizeException!");
	    return null;
	}
	StringArray c=new StringArray(to-from+1);
	for(int i=from,j=0;i<=to;i++,j++){
	    c.set(this.array[i],j);
	}
	return c;
    }
    public void sort(){
	for(int i=0;i<this.length;i++){
	    for(int j=0;j<this.length;j++){
		if(this.array[j].compareTo(this.array[i])>0){
		    this.exchange(i,j);
		}
		
	    }
	}
    }
	   

}
