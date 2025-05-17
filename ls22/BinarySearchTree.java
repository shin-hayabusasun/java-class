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
    public MyNode search(MyData aData) {
	// 木が空であるか調べる
	if (this.root == null) {
	    // 木が空なので，null を返し処理を抜ける
	    return null;
	}
	// 木をたどって対象のノードを探す
	MyNode currentNode = this.root;
	while (true) {
	    // 対象のノードであるか判定する
	    if (currentNode.getData().compareTo(aData) == 0) {
		// 対象のノードなのでノードを返して処理を抜ける
		return currentNode;
	    }
	  
	    // データを左の子ノードに探索するべきか右の子ノードに探索するべきか調べる
	    if (currentNode.getData().compareTo(aData) > 0) {
		// 左に子ノードがあるか調べる
		if (currentNode.getLeft() == null) {
		    return null;//該当する子ノードがない
		}
		currentNode = currentNode.getLeft();
	    } else {
		// 右に子ノードがあるか調べる
		if (currentNode.getRight() == null) {
		    return null;//該当する子ノードがない
		}
		currentNode = currentNode.getRight();
	    }
	} 
    }
    public void printTreeInOrder() {
	System.out.println(this.traverseInOrder(this.root));
    }
    private String traverseInOrder(MyNode localNode) {
	// ノードが null であるか調べる（基底条件）
	if (localNode == null) {
	    return ""; // ノードが null なので空文字列を返し処理を抜ける
	}
	// 木の文字列表現を取得する
	StringBuffer tr = new StringBuffer();
	// 左の子ノードの文字列表現を取得する
	tr.append(this.traverseInOrder(localNode.getLeft()));
	// 本ノードの文字列表現を取得する
	tr.append(localNode + "\n"); // "¥"は環境によって"＼"（半角）に
	// 右の子ノードの文字列表現を取得する
	tr.append(this.traverseInOrder(localNode.getRight()));
	return tr.toString(); // trはStringBuffer
    }
    public void printTreePreOrder(){
	System.out.println(this.traversePreOrder(this.root));
    }
    private String traversePreOrder (MyNode localNode) {
	if (localNode == null) {
	    return ""; // ノードが null なので空文字列を返し処理を抜ける
	}
	// 木の文字列表現を取得する
	StringBuffer tr = new StringBuffer();
	// 左の子ノードの文字列表現を取得する
	tr.append(localNode + "\n"); 
	tr.append(this.traversePreOrder(localNode.getLeft()));
	// 本ノードの文字列表現を取得する
	// 右の子ノードの文字列表現を取得する
	tr.append(this.traversePreOrder(localNode.getRight()));
	return tr.toString(); // trはStringBuffer
    }
    public void printTreePostOrder(){
	System.out.println(this.traversePostOrder(this.root));
    }
    private String traversePostOrder(MyNode localNode){
	if (localNode == null) {
	    return ""; // ノードが null なので空文字列を返し処理を抜ける
	}
	// 木の文字列表現を取得する
	StringBuffer tr = new StringBuffer();
	// 左の子ノードの文字列表現を取得する

	tr.append(this.traversePostOrder(localNode.getLeft()));
	// 本ノードの文字列表現を取得する
	// 右の子ノードの文字列表現を取得する
	tr.append(this.traversePostOrder(localNode.getRight()));
	tr.append(localNode + "\n"); 
	return tr.toString(); // trはStringBuffer
    }
    public void printTreeDesc() {
	System.out.println(this.traverseDesc(this.root));
    }
    private String traverseDesc(MyNode localNode){
		if (localNode == null) {
	    return ""; // ノードが null なので空文字列を返し処理を抜ける
	}
		StringBuffer tr = new StringBuffer();	
	tr.append(this.traverseDesc(localNode.getRight()));
	tr.append(localNode + "\n");
	tr.append(this.traverseDesc(localNode.getLeft()));

		return tr.toString();
    }
    public void removeLevel(int level){
	this.removeSubLevel(this.root,level);
    }
    private void removeSubLevel (MyNode myNode, int level) {
	if(myNode==null){
	    return;
	}
	if( level==0){
	    this.remove(myNode.getData());
	    return;
	}
	removeSubLevel(myNode.getLeft(),level-1);
	removeSubLevel(myNode.getRight(),level-1);
	
    }
    public BinarySearchTree cutTree (MyData aData) {
	MyNode d=search(aData);
	BinarySearchTree t=new BinarySearchTree();
	copy(t,d);
	if(d!=null){
	    if(d.getLeft()!=null){
		cutTree(d.getLeft().getData());
	    }
	    if(d.getRight()!=null){
		cutTree(d.getRight().getData());
	    }
	    this.remove(d.getData());
	}
	return t;
	
    }
    private void copy(BinarySearchTree tree, MyNode myNode) {
	if(myNode!=null){
	    tree.insert(myNode.getData());
	    if(myNode.getLeft()!=null){
		copy(tree,myNode.getLeft());
	    }
	    if(myNode.getRight()!=null){
		copy(tree,myNode.getRight());
	    }
	}
    }
}
