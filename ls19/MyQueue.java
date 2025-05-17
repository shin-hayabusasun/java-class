public class MyQueue {
    //---- フィールド ----
    private Object[] queueArray;
    private int head;
    private int tail;
    private int maxSize;
    private int num;
    //---- コンストラクタ ----
    public MyQueue(int size) {
        this.queueArray = new Object[size];
        this.head = 0;
        this.tail = 0;
        this.num = 0;
        this.maxSize = size;
    }
    private MyQueue() {}
    //---- メソッド ----
    public int enqueue(Object obj) {
        // 格納されているオブジェクト数が配列のサイズよりも小さいときだけ追加
    if (this.num < this.maxSize) {
    this.queueArray[this.tail] = obj; // キューの最後に追加
    int oldtail = this.tail;
    // 配列の最後であれば先頭へ
    this.tail = (this.tail + 1) % this.maxSize;
    this.num++;
    return oldtail; // objが格納されたqueueArrayのindexを返す
    } else {
    return -1; // 配列が一杯なら-1を返す
    }
    }
    public Object dequeue() {
        //1個以上のオブジェクトが格納されているときだけ取り出し
//isEmpty()メソッドを利用するのも可
if (this.num > 0) {
    Object obj = this.queueArray[head];
    // 配列の最後であれば先頭へ
    this.head = (this.head + 1) % this.maxSize;
    this.num--;
    return obj;
    } else {
    return null;
    }
    }
    public boolean isEmpty() {
        return (this.num == 0);
    }
    public boolean isFull() {
        return (this.num == this.maxSize);
    }
    public void printAll() {
        System.out.println("Contents of Queue");
        if (!this.isEmpty()) {
        int position = this.head;
        for (int i = 0; i < this.num; i++) {
        position = (this.head + i) % this.maxSize;
        System.out.println(this.queueArray[position]);
        }
        }
    }

    public void clear(){
	int count=0;
	while(count<this.maxSize){
	this.queueArray[count]=null;
	count++;
	}
	this.tail=0;
	this.head=0;
	this.num=0;
    }
    public Object peek(){
	if (this.num > 0) {
    Object obj = this.queueArray[head];
    // 配列の最後であれば先頭へ
   
    return obj;
    } else {
	    System.out.println ("Queue is Empty.");
    return null;
    }
    }

    public int forceEnqueue(Object obj){
	if(this.isFull()){
	    this.queueArray[head]=obj;
	    this.tail=this.head;
	    this.head = (this.head + 1) % this.maxSize;
	    
	    return this.tail;
	}
	else{
	    
	    return this.enqueue(obj);
	    
	}
    }
    public void rotate(int n){
	for(int i=0;i<n;i++){
	Object a=this.dequeue();
	if(a==null){
	    return;
	}
	this.enqueue(a);
	}
    }
}
