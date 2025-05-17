public class C4 {//メイン
    static public void main(String[] args) {
	java.util.Random rand = new java.util.Random(0); //乱数は実行毎に同じ結果を得るため, 乱数のseed を0 に設定する
	Board b = new Board();//インスタンス生成
	boolean gameEnd = false;//ゲームが終了するか
	boolean hasEmpty = true; // 空きマスがあるか
	Player p1=new Player(1,"先手");//インスタンス生成
	Player p2=new Player(2,"後手");//インスタンス生成
	while (true) {	//ゲーム終了までループ
	    int x = -1, y = -1;
	    // 先手番（ランダム）
	    b.showBoard();//表示
	    p1.play(b,rand,2);//プレイヤー
	    // 勝敗判定
	    gameEnd=b.isWinning();//勝敗が決まったか
	     if (gameEnd) break;
	     hasEmpty=b.isEnd();//空きますがあるか
	    if (!hasEmpty) break;
	    // 後手番（計算機: ランダム）
	    b.showBoard();//表示
	    p2.play(b,rand,1);//プレイヤー
	    gameEnd=b.isWinning();//勝敗が決まったか
	    if (gameEnd) break;
	    hasEmpty=b.isEnd();//空きますがあるか
	    if (!hasEmpty) break;
	}
	b.showBoard();
	if (!hasEmpty) {
	    System.out.println("引き分けです");
	} else if (b.getTurn() == 1) {
	    System.out.println("後手が勝ちました");
	} else {
	    System.out.println("先手が勝ちました");
	}
    }
}
