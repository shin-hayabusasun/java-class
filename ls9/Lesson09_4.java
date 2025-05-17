public class Lesson09_4 {
    public static void main(String[] args) {

    Book book1 = new Book(" スッキリわかる Java 入門", " 中山清喬", 3500);
    //ここから記述：1 冊目の表示 & インスタンス数の出力
    book1.showBook();
    System.out.println("このプログラムはBookクラスから"+Book.getCount()+"つのインスタンスを生成しました");
    Book book2 = new Book(" 入門 bash", " キャメロン・ニューハム", 3000);
    //ここから記述：2 冊目の表示 & インスタンス数の出力
  book2.showBook();
  System.out.println("このプログラムはBookクラスから"+Book.getCount()+"つのインスタンスを生成しました");
    Book book3 = new Book(" 詳解シェルスクリプト", " ネルソン・H.fベーブ.", 3200); 
    //ここから記述：3 冊目の表示 & インスタンス数の出力
     book3.showBook();
      System.out.println("このプログラムはBookクラスから"+Book.getCount()+"つのインスタンスを生成しました");
    }
}
