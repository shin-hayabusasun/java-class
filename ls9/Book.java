class Book {
    private String title;
    private String author;
    private int price;
    //ここを記述
    private static int count=0;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        //ここを記述
	this.count++;
	
    }

    //ここから記述
    public static int getCount(){
	return count;
    }
    public void showBook(){
	System.out.println("-----");
	System.out.println("タイトル:"+this.title);
	System.out.println("著者:"+this.author);
	System.out.println("値段:"+this.price);
	System.out.println("-----");
    }
}

