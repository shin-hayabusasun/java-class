public class MyData implements Comparable {
    //フィールド
    private Object data; //保持するデータ
    private int id; //データを比較するための整数番号
    //コンストラクタ
    private MyData() {}
    public MyData(int number, Object obj) {
    this.id = number;
    this.data = obj;
    }
    //メソッド
    public int compareTo(Object obj) {
        int target = ((MyData)obj).getId();
        // データの大小を比較する
        if (this.id == target) {
        // データが等しいので 0 を返す
        return 0;
        }
        if (this.id > target) {
        // データはこのオブジェクトの方が大きいので 1 を返す
        return 1;
        }
        // データはこのオブジェクトの方が小さいので -1 を返す
        return -1;
        }
    public Object getData() {return this.data;}
    public int getId() {return this.id;}
    public String toString() {return "(" + this.id + ", " + this.data + ")";}
    }