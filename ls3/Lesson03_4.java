public class Lesson03_4 {
    public static void main(String[] args) {
        int[][] timeTable = new int[9][9];

        /* -----ここから追加----- */
	for(int i=0;i<timeTable.length;i++){
	    for(int t=0;t<timeTable.length;t++){
		timeTable[i][t]=(i+1)*(t+1);
	    }
	}
	
	for(int i=0;i<timeTable.length;i++){
	    for(int t=0;t<timeTable.length;t++){
		System.out.print(timeTable[i][t]+" ");
	    }
	    System.out.println();
	}
        
        /* -----ここまで追加----- */

        //以下はtimeTableを用いて九九表を作成できているかを
        //確認するためのものであり、消さないこと
        System.out.println();
        System.out.println("---以下確認用---");
        System.out.println("3 * 7 = " + timeTable[2][6]);
        System.out.println("6 * 8 = " + timeTable[5][7]);
    }

}
