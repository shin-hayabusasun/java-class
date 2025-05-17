// プレイヤの抽象クラス
public abstract class Player {
    // 戦略を複数持つ
    protected Strategy[] strategies;

    // 戦略に基づいて手を返す
    public abstract int nextHand();
    // 相手の手に応じて情報を更新（デフォルトでは何もしない）
    public void update(int opponentHand){ };
}
