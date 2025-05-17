public class Lesson08_4{
    public static void main(String[] args){
        Customer c1 = new Customer("太郎", 200);
        Customer c2 = new Customer("花子", 50);
        
        Snack s1 = new Snack("ポテトチップス", 130);
        Snack s2 = new Snack("飴", 100);
        Snack s3 = new Snack("チョコバット", 30);

        //Add here
	Shop sp=new Shop();
	sp.sell(c1,s1);
		sp.sell(c2,s2);
		sp.sell(c1,s3);
		sp.sell(c2,s3);


    }
}
