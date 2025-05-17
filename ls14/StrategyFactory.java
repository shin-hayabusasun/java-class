public class StrategyFactory {
    public static Strategy createStrategy(String type) {
        switch(type) {
        case "Rock":
            return new RockStrategy();
            // Lesson14_3: add here
	case "Scissors": return new ScissorsStrategy();
	case "Paper": return new  PaperStrategy();
	case "Random": return new  RandomStrategy();
            
        default:
            throw new java.lang.IllegalArgumentException("Invalid strategy type: " + type);
        }
    }
}
