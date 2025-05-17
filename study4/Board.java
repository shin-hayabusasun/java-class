//プレイヤークラス
class Player{
    int i;//プレイヤー識別
    String t;//プレイヤー識別名
    public Player(int i,String t){
	this.i=i;
	this.t=t;
    }
    //プレイヤー行動メソッド
    public void play (Board b,java.util.Random rand,int turn){
	int x;
	int y;
	do {
	    x = rand.nextInt(5);
	    y = rand.nextInt(5);
	} while (b.isLegal(x,y));
	b.setSquare(x,y,i);
	b.setTurn(turn);
	System.out.println(this.t +"は "+x + " " + y + " に置きました");
    }
}
public class Board {
    private int[][] square;//盤面
    private int turn;//ターン
    private int i=1;//プレイヤー識別
    Board() {//コンストラクタ
	square  = new int[5][5];
	for (int i=0; i<5; i++) {
	    for (int j=0; j<5; j++) {
		square[i][j] = 0;
	    }
	}
	turn = 1;
    }

    // x,y に置くことができるか
    public boolean isLegal(int x, int y) {
	if(this.square[y][x] != 0){
	return true;
	}
	else{
	    return false;
	}
    }
    // ゲームの終了判定 : 置ける場所がない（勝敗がついた時とは別）
    public boolean isEnd() {
	boolean hasEmpty=false;
	 for (int nx=0;nx<5;nx++) {
		if (hasEmpty) break;
		for (int ny=0;ny<5;ny++) {
		    if (this.square[ny][nx] == 0) {
			hasEmpty = true;
			break;
		    }
		}
	    }
	return hasEmpty;
    }
    //geter,seter
    public int getTurn(){
	return this.turn;
    }
    public void setTurn(int turn){
	this.turn=turn;
    }
    public int getSquare(int x,int y){
	return this.square[y][x];
    }
    public void setSquare(int x,int y,int i){
	this.square[y][x]=i;
    }
    // 最後に着手したプレイヤが勝った（4目並べた）か判定
    public boolean isWinning() {
	boolean gameEnd=false;
	
	
       for (int ny=0; ny<5; ny++) {
	   if (gameEnd) break;
	   int numx = 0;
	   for (int nx=0; nx<5; nx++) {
	       if (this.square[ny][nx] == this.i) {
		   numx++;
		   if (numx == 4) {
		       gameEnd = true;
		       break;
		   }
	       } else {
		   numx = 0;
	       }
	   }
       }
       for (int nx=0; nx<5; nx++) {
	   if (gameEnd) break;
	   int numy = 0;
	   for (int ny=0; ny<5; ny++) {
	       if (this.square[ny][nx] == this.i) {
		   numy++;
		   if (numy == 4) {
		       gameEnd = true;
		       break;
		   }
	       } else {
		   numy = 0;
	       }
	   }
       }
       this.i=3-this.i;
       return gameEnd;
    }
    
    // 盤面表示
    public void showBoard() {
		for (int i=0; i<5; i++) {
	    for (int j=0; j<5; j++) {
		switch(this.square[i][j]) {
		case 0: System.out.print("_"); break;
		case 1: System.out.print("o"); break;
		case 2: System.out.print("x"); break;
		}
	    }
	    System.out.println();
	}
    }
}
