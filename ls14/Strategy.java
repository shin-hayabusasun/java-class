// 戦略のインターフェイス
public interface Strategy {
    // 手を返す 0:Rock(グー), 1:Paper(パー), 2:Scissors(チョキ)
    public int selectHand();
}
