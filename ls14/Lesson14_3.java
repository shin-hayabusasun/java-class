class Lesson14_3 {
    final static int REP = 1000; // ゲーム回数
    final static String[] RESULTS_STRING = {"引分","勝ち","負け"};
    // 0:Rock(グー), 1:Paper(パー), 2:Scissors(チョキ)

    // p1とp2のじゃんけんの結果を返す (0:引分, 1:p1の勝ち, 2:p1の負け)
    public static int getResult(Player p1, Player p2) {
        int fHand = p1.nextHand();
        int sHand = p2.nextHand();
        p1.update(sHand);
        p2.update(fHand);
        return (fHand + 3 - sHand) % 3;
    }

    public static void main(String[] args) {
        // 対戦の組合せ
        String[][] stringPairs = {{"Random", "Random"},{"Random", "Paper"}, {"Memo", "Paper"}};
        Player[][] playerPairs = {
            {new SingleStrategyPlayer("Random"), new SingleStrategyPlayer("Random")},
            {new SingleStrategyPlayer("Random"), new SingleStrategyPlayer("Paper")},
            {new MemoPlayer(), new SingleStrategyPlayer("Paper")}
        };
        // 各組合せで対戦
        for (int i=0; i<playerPairs.length; i++) {
            System.out.println(stringPairs[i][0] + " 対 " + stringPairs[i][1]);
            Player p1 = playerPairs[i][0];
            Player p2 = playerPairs[i][1];
            int[] results = {0,0,0};
            // ゲームを繰り返す
            for (int ri=0; ri<REP; ri++) {
                int res = getResult(p1, p2);
                results[res]++;
            }
            // 結果の出力
            for (int ri=0; ri<3; ri++) {
                System.out.println(RESULTS_STRING[ri] + ": " + results[ri]);
            }
            System.out.println();
        }
    }
}
