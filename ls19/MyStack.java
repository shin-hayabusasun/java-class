public class MyStack {
    private int maxSize;//スタックの大きさ
    private Object[] stackArray;//スタックを実現する配列
    private int stackPointer;//スタックポインタ
    private MyStack() {
    }
    public MyStack(int size){
    this.maxSize = size;
    this.stackArray = new Object[size];
    this.stackPointer = 0; // push時に格納される配列のindex
    }
    public boolean isEmpty() {
        return (this.stackPointer == 0);
    }
    public boolean isFull() {
        return (this.stackPointer == this.maxSize);
    }
    public Object pop() {
        if (this.isEmpty()) {
            //特にエラーメッセージを表示する場合に使うメソッド（標準エラーストリーム）
            System.err.println("Stack is Empty.");
            return null;
            }
            this.stackPointer--;
            Object popObject = this.stackArray[this.stackPointer];
            this.stackArray[this.stackPointer] = null;
            return popObject;
    }
    public void push(Object obj) {
        if (this.isFull()) {
            System.err.println("Stack is full.");
            return;
            }
            this.stackArray[this.stackPointer] = obj;
            this.stackPointer++;
    }
    public void printAll() {
    System.out.println("Contents of Stack");
    int count = 1;
    int position = this.stackPointer - 1;
    while(position >= 0){
    System.out.println(count+"\t"+this.stackArray[position]);
    // ¥t -> ＼t （半角で）
    count++;
    position--;
    }
    System.out.println();}
    public void clear(){
	int count=0;
	while(count<maxSize){
	    this.stackArray[count]=null;
	    count++;
    }
	System.err.println("Stack is Empty.");
	this.stackPointer=0;
    }
    public Object peek(){
	if (this.isEmpty()) {
            //特にエラーメッセージを表示する場合に使うメソッド（標準エラーストリーム）
            System.err.println("Stack is Empty.");
            return null;
            }
            
            Object popObject = this.stackArray[this.stackPointer-1];
	    
            return popObject;
    }
    public void printAllReverse(){
	
    System.out.println("Contents of Stack");
    int count = 1;
    int position = 0;
    while(position<this.stackPointer){
    System.out.println(count+"\t"+this.stackArray[position]);
    // ¥t -> ＼t （半角で）
    count++;
    position++;
    }
    System.out.println();}
    public boolean exchange(){
	if(this.stackPointer<3){
	    System.out.println("The number of elements is less than 2.");
	    return false;
	}
	Object a=this.pop();
	Object b=this.pop();
	this.push(a);
	this.push(b);
	return true;
    }
    
    
}
