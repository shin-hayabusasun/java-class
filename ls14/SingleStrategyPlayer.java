// 一つの戦略しか持たないプレイヤ
public class SingleStrategyPlayer extends Player {
    public SingleStrategyPlayer(String str) {
        strategies = new Strategy[1];
        strategies[0] = StrategyFactory.createStrategy(str);
    }
    public int nextHand() {
        return strategies[0].selectHand();
    }
}
