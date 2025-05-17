public class Lesson13_4 {
    public static void main(String[] args) {
        String[] names = {"ヒロ", "ア", "アイウエオカキクケコ", "コウチ", "タロウ"};
        int[] levels = {10, 50, 100, 200, 0};
        Hero h = new Hero();

        for (int i = 0; i < names.length; i++) {
	    //  try{
	    h.setName(names[i]);
	    h.setLevel(levels[i]);
	    
	    System.out.println("名前: " + h.getName() + "\nレベル: " + h.getLevel());
	    //  } catch (NameOutOfBoundsException e) {
	    // System.out.println(e);
	    // } catch (LevelOutOfBoundsException e) {
	    //    System.out.println(e);
	    // }
	}
    }
}
