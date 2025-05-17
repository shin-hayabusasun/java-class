class RockStrategy implements Strategy {
    public int selectHand() {
        return 0;
    }
}
// Lesson14_3: add here
// PaperStrategy, ScissorsStrategy, RandomStrategy
class PaperStrategy implements Strategy{
    public int selectHand() {
        return 1;
    }
}
class ScissorsStrategy implements Strategy{
    public int selectHand() {
        return 2;
    }
}
class RandomStrategy implements Strategy{
    static java.util.Random r=new java.util.Random(0);
    public int selectHand() {
        return r.nextInt(3);
    }
}
