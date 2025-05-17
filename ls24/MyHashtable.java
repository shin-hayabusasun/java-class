public class MyHashtable {
    //フィールド
    private AddressData[] table;
    private int collision =0;
    //コンストラクタ
    private MyHashtable() {}
    public MyHashtable(int aMaxSize) {
    this.table = new AddressData[aMaxSize];
    }
    //メソッド
    public AddressData get(String aKey) {
        if (null == aKey) {
        throw new NullPointerException(); // 鍵がnull
        }
        // ハッシュ値を計算してデータを取得する
        return this.table[this.calculateHashCode(aKey)];}
    public void printAll() {
        // テーブルの内容を順番に全て表示
        for (int count = 0; count < this.table.length; count++) {
        System.out.println(count + "\t" + this.table[count]);
        }
        System.out.println();}
    public boolean put(AddressData anAddressData) {
        if (null == anAddressData) {
        return false; //データがnull

        }
        int hash =this.calculateHashCode(anAddressData.getName());
        if(this.table[hash]!=null){
            this.collision++;
        }
        this.table[this.calculateHashCode(anAddressData.getName())] = anAddressData;
        return true;}
    public boolean remove(String aKey) {
        if (null == aKey) {
        return false;
        }
        this.table[this.calculateHashCode(aKey)] = null;
        return true;}
    private int calculateHashCode(String aKey) {
        // 鍵が null であるか調べる
        if (null == aKey) {
        // 鍵が null なので例外を報告して処理を抜ける
        throw new NullPointerException();
        }
        // 文字列の各文字を Unicode 数値として扱い、足し合わせる
        int intKey = 0;
        for (int count = 0; count < aKey.length(); count++) {
        intKey += 0xffff & aKey.charAt(count);
        }
        // 合計値からハッシュ値を求める
        return intKey % this.table.length;}
        public int elementNum() {
            int num=0;
            for(int count=0;count<this.table.length;count++){
                if(this.table[count]!=null){
                    num++;
                }
            }
            return num;
        }
        public void clear(){    
            for(int i=0;i<this.table.length;i++){
                this.table[i]=null;
            }
        }
       
        public int getCollision(){
            return this.collision;
        }
        public void exists(String aKey){
            if(aKey==null){
                System.out.println("Key is null.");
                return ;
            }
            int hash=this.calculateHashCode(aKey);
            if((this.table[hash]==null)||(!(aKey.equals(this.table[hash].getName())))){
                System.out.println(aKey+"does not exist.");
            }
            else{
                System.out.println(aKey+"exists.");
                System.out.println("Data:"+this.table[hash].toString());
            }
        }
    }