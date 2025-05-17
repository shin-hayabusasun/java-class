public class Shop{
    int proceed = 0;
    
    //Add here
    void sell(Customer c, Snack s){
	if(c.money>=s.price){
	c.money-=s.price;
	this.proceed+=s.price;

	System.out.println(c.name+"は"+s.name+" ("+s.price+" 円) を購入した -> "+c.name+"の所持金が"+c.money+"円になった");
	System.out.println("現在の売上金:"+this.proceed+"円");
	}
	else{
	    	System.out.println(c.name+"は"+s.name+" ("+s.price+" 円) を購入できなかった(所持金"+c.money+"円)");
	}
    }
}
