// 相手の直前の手を覚えて、それに勝つ手を選ぶ
public class MemoPlayer extends Player {
    private int previousHand = -1; // 直前の相手の手
    public MemoPlayer() {
        strategies = new Strategy[4];
        // 0:Rock(グー), 1:Paper(パー), 2:Scissors(チョキ) の順
        strategies[0] = StrategyFactory.createStrategy("Rock");
        strategies[1] = StrategyFactory.createStrategy("Paper");
        strategies[2] = StrategyFactory.createStrategy("Scissors");
        // 初手はランダム
        strategies[3] = StrategyFactory.createStrategy("Random");
    }
    public int nextHand() {
        // Lesson14_3: add here
	Strategy s;
	switch(this.previousHand){
	    
	    case 0:
		s=strategies[1];
		break;
		
		case 1:
		    s=strategies[2];
		    break;
		case 2:
		    s=strategies[0];
		    break;
		    default:
			s=strategies[3];
			break;
	   
			
		
	}
	return s.selectHand();
        
    }
    public void update(int opponentHand) {
        // 直前の相手の手を更新する
        this.previousHand = opponentHand;
    }
}
