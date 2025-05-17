interface MineSweeperGUI {
    public void setTextToTile(int x, int y, String text);

    public void win();

    public void lose();
    
}

public class MineSweeper {

    private final int height;
    private final int width;
    private final int numberOfTiles;
    private final int numberOfBombs;
    private final int[][] table;
    private int [][] op;
    private int a=0;
    private int fla[][];
    
    public MineSweeper(int height, int width, int numberOfBombs) {
        this.height = height;
        this.width = width;
        this.numberOfTiles = height * width;
        this.numberOfBombs = numberOfBombs;
        this.table = new int[height][width];
	this.op=new int[height][width];
	for(int i=0;i<height;i++){
	    for(int t=0;t<width;t++){
		this.op[i][t]=0;
	    }
	}
	this.fla=new int[height][width] ;
        initTable();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    void initTable() {
        setBombs();

        /* ----- ここから実装してください． ----- */
	int count=0;

		for(int i=0;i<this.height;i++){
	    for(int t=0;t<this.width;t++){
		if(this.table[i][t]==100){
		    for(int i1=i-1;i1<=i+1;i1++){
			for(int t1=t-1;t1<=t+1;t1++){
			   
			    if(i1<0 || i1>=this.height)continue;
			     if(t1<0 || t1>=this.width)continue;
			     if(this.table[i1][t1]==100)continue;
			       this.table[i1][t1]= this.table[i1][t1]+1;
			}
		    }
		}
	    }
	}
	
    }

    void setBombs() {
        /* ----- ここから実装してください． ----- */
for(int i=0;i<this.height;i++){
	    for(int t=0;t<this.width;t++){
		
		    this.table[i][t]=0;
		
	    }
	}
	
	int i=0;
	while(i<numberOfBombs){
	    int y=new java.util.Random().nextInt(this.height);
	    int x=new java.util.Random().nextInt(this.width);
	    if(this.table[y][x]==0){
		this.table[y][x]=100;
	
		i++;
	    }
	}
    }

    public void openTile(int x, int y, MineSweeperGUI gui) {
        /* ----- ここから実装してください． ----- */
	if(this.fla[y][x]==1){
	    return;
	}
	if(this.a==1){
	    // if(this.op[y][x]==1){
	    //	System.out.println();
	    //  }
	    if(this.table[y][x]==100){
		this.openAllTiles(gui);
	    }
	    else{
		int ac=this.table[y][x]+'0';
		String tex=Character.toString(ac);
		gui.setTextToTile(x,y,tex);
		this.op[y][x]=1;
	    }
	    for(int i=0;i<this.height;i++){
		for(int t=0;t<this.width;t++){
		    if(this.op[i][t]==0&&this.table[i][t]!=100){
			return;
		    }
		}
		
	
	    }
	    	gui.win();
	}
	else if(this.a==0){
	    
	    while(this.table[y][x]!=0){
		this.initTable();
		
			
	    }
	 
	
			
		this.opene(x,y,gui);
		
	    
		//  else{
		//	int ac=this.table[y][x]+'0';
		//	String tex=Character.toString(ac);
		//	gui.setTextToTile(x,y,tex);
		//	this.op[y][x]=1;
	
		// }
	    a=1;
	}
    }
    public void opene(int x,int y, MineSweeperGUI gui){
	
	if(x<0||x>=this.width)return;
	else if(y<0||y>=this.height)return;
	else if(this.op[y][x]==1)return;
	else if(this.table[y][x]!=0 && this.table[y][x]!=100){
	 
	    // System.out.println(x+" "+y);
	    int ac=this.table[y][x]+'0';
	    String tex=Character.toString(ac);
	    gui.setTextToTile(x,y,tex);
	      this.op[y][x]=1;
	    return;
	}
	else{
	
	    //	System.out.println(x+" "+y);
	int ac=this.table[y][x]+'0';
	String tex=Character.toString(ac);
	gui.setTextToTile(x,y,tex);
		this.op[y][x]=1;
	}
	
	this.opene(x-1,y,gui);
	this.opene(x,y-1,gui);
	this.opene(x,y+1,gui);
	this.opene(x+1,y,gui);
	this.opene(x+1,y+1,gui);
	this.opene(x+1,y-1,gui);
	this.opene(x-1,y+1,gui);
	this.opene(x-1,y-1,gui);
	
    }

    public void setFlag(int x, int y, MineSweeperGUI gui) {
        /* ----- ここから実装してください． ----- */
	if(this.fla[y][x]!=1){
	    this.fla[y][x]=1;
	 gui.setTextToTile(x,y,"F");
	}
	else{
	    this.fla[y][x]=0;
	     gui.setTextToTile(x,y,"");
	}
    }

    private void openAllTiles(MineSweeperGUI gui) {
        /* ----- ここから実装してください． ----- */
	for(int i=0;i<this.height;i++){
	    for(int t=0;t<this.width;t++){
			if(this.table[i][t]==100){
			    gui.setTextToTile(t,i,"boom");
	}
	else{
	    int ac=  this.table[i][t]+'0';
	  String tex=Character.toString(ac);
	    gui.setTextToTile(t,i,tex);
	}
			gui.lose();
	    }
	}
    }

}
