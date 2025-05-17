public class BinarySearchTree {
    //フィールド
    private MyNode root;
    //コンストラクタ
    public BinarySearchTree() {
    this.root = null;
    }
    //メソッド
    public void insert(MyData aData) {
        MyNode newNode = new MyNode(aData);
if (null == this.root) {
this.root = newNode;
return;
}
MyNode currentNode = this.root;
while (true) {
if (currentNode.getData().compareTo(aData) > 0) {
if (currentNode.getLeft() == null) {
currentNode.setLeft(newNode);
return;
}
currentNode = currentNode.getLeft();
} else {
if (currentNode.getRight() == null) {
currentNode.setRight(newNode);
return;
}
currentNode = currentNode.getRight();
}
}
    }
    //動作確認用
    public void printRoot() {
        // ルートノードを表示
System.out.println(this.root);
// ルートノードの左の子ノードを表示
System.out.println(this.root.getLeft());
// ルートノードの右の子ノードを表示
System.out.println(this.root.getRight());
    }

    public MyData getMaximumData() {
	if(this.root==null){
	    return null;
	}
	MyNode c=this.root;
	while(true){
	    if(c.getRight()==null){
		return c.getData();
	    }
	    else{
	    c=c.getRight();
	    }
	}
    }
    public MyData getMinimumData() {
	if(this.root==null){
	    return null;
	}
	MyNode c=this.root;
	while(true){
	    if(c.getLeft()==null){
		return c.getData();
	    }
	    else{
	    c=c.getLeft();
	    }
	}
    }
    public int getNumOfNodes() {
	return countNodes(this.root);
    }
    private int countNodes(MyNode currentNode){
	if(currentNode==null){
	    return 0;
	}
	return countNodes(currentNode.getRight())+countNodes(currentNode.getLeft())+1;
    }
    public int getHeight() {
	return getNodeHeight(this.root);
    }
    private int getNodeHeight(MyNode currentNode){
	if(currentNode==null){
	    return 0;
	}
	if(getNodeHeight(currentNode.getRight())>getNodeHeight(currentNode.getLeft())){
		    
	    return getNodeHeight(currentNode.getRight())+1;
	}
	else{
	    return getNodeHeight(currentNode.getLeft())+1;
	}
    }
    public void showTree() {
	System.out.println(showSubTree(this.root,0));
    }
    public String showSubTree(MyNode localNode, int counter){
	if(localNode==null){
	    return "";
	}
	else{
	    StringBuilder bf=new StringBuilder();
	 

    
	    bf.append(showSubTree(localNode.getRight(),counter+1));
	    align(bf,counter);
	    bf.append(localNode.getData()).append("\n");
	    bf.append(showSubTree(localNode.getLeft(),counter+1));
	    return bf.toString();
	}
    }
    private void align(StringBuilder bf, int counter){
	for(int i=0;i<counter;i++){
	    bf.append("   ");
	}
	int ascii=counter+(int)'0';
	String str=Character.toString(ascii);
	bf.append(str+":");
	
    }
    //指定されたノードをルートとする部分木内の最小のノードを取得する
    private MyNode getMinimumNode(MyNode localNode) {
	// 指定されたノードが null であるか調べる
	if (localNode == null) {
	    // 指定されたノードが null なので，null を返して処理を抜ける
	    return null;
	}
	// 木をたどって最小のノードを見つける
	MyNode currentNode = localNode;
	while (true) {
	    // 左の子がなくなれば、それが最小ノード
	    if (currentNode.getLeft() == null) {
		return currentNode;
	    }
	    currentNode = currentNode.getLeft();
	}
    }
    public boolean remove(MyData aData) {
	// 木が空であるか調べる
	if (this.root == null) {
	    // 木が空なので，false を返し処理を抜ける
	    return false;
	}
	// 削除対象ノードの親ノード
	MyNode parentNode = this.root;
	// 削除対象ノード
	MyNode currentNode = this.root;
	// 削除対象が親ノードの左の子であるか否か
	boolean inLeftSubTree = false;
	// 削除する対象のノード（currentNode）を探す
	while (currentNode.getData().compareTo(aData) != 0) {
	    parentNode = currentNode;
	    if (currentNode.getData().compareTo(aData) > 0) {
		currentNode = currentNode.getLeft();
		inLeftSubTree = true;
	    } else {
		currentNode = currentNode.getRight();
		inLeftSubTree = false;
	    }
	    if (null == currentNode) {
		return false;
	    }
	}
	// 削除するノードが子を持たないとき
	if (currentNode.getLeft() == null &&currentNode.getRight() == null) {
	    // 削除対象がルートノード
	    if (currentNode == this.root) {
		this.root = null;
	    }
	    // 削除対象が親ノードの左の子
	    else if (inLeftSubTree) {
		parentNode.setLeft(null);
	    }
	    // 削除対象が親ノードの右の子
	    else {
		parentNode.setRight(null);
	    }
	}
	// 削除するノードが左の子ノードを一つだけ持つ場合
	else if (currentNode.getRight() == null) {
	    // 削除対象がルートノード
	    if (currentNode == this.root) {
		// 削除対象の左の子をルートノードに設定
		this.root = currentNode.getLeft();
	    }
	    // 削除対象が親ノードの左の子
	    else if (inLeftSubTree) {
		// 削除対象の左の子を親ノードの左の子として設定
		parentNode.setLeft(currentNode.getLeft());
	    }
	    // 削除対象が親ノードの右の子
	    else {
		// 削除対象の左の子を親ノードの右の子として設定
		parentNode.setRight(currentNode.getLeft());
	    }
	}
	// 削除するノードが右の子ノードを一つだけ持つ場合
	else if (currentNode.getLeft() == null) {
	    // 削除対象がルートノード
	    if (currentNode == this.root) {
		// 削除対象の右の子をルートノードに設定
		this.root = currentNode.getRight();
	    }
	    // 削除対象が親ノードの左の子
	    else if (inLeftSubTree) {
		// 削除対象の右の子を親ノードの左の子に設定
		parentNode.setLeft(currentNode.getRight());
	    }
	    // 削除対象が親ノードの右の子
	    else {
		// 削除対象の右の子を親ノードの右の子として設定
		parentNode.setRight(currentNode.getRight());
	    }
	}
	// 削除するノードが子を二つ持つ場合
	else {
	    // 右部分木の中で一番小さい値を持つノードを探索
	    MyNode minimumNode =
		this.getMinimumNode(currentNode.getRight());
	    // 右部分木の中から右部分木の中で一番小さい値を持つノードを削除
	    this.remove(minimumNode.getData());
	    // 右部分木の中で一番小さい値を持つノードを削除対象のノードと置き換える
	    minimumNode.setLeft(currentNode.getLeft());
	    minimumNode.setRight(currentNode.getRight());
	    if (currentNode == this.root) {
		this.root = minimumNode;
	    } else if (inLeftSubTree) {
		parentNode.setLeft(minimumNode);
	    } else {
		parentNode.setRight(minimumNode);
	    }
	}
	currentNode.setLeft(null);
	currentNode.setRight(null);
	return true;
    }
}
