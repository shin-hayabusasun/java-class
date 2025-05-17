public class VendingMachine{
    int Mmoney;
    int[][] drinkmoneyn=new int[2][5];
    String[] drinkname={"未登録","未登録","未登録","未登録","未登録"};
 
    VendingMachine(){
        this.Mmoney =0;
    }
    
    public void registDrink(int index,Drink drink,int stock){
        if(this.drinkname[index-1]=="未登録"){
        this.drinkmoneyn[1][index-1]=stock;
        this.drinkmoneyn[0][index-1]=drink.getPrice();
        this.drinkname[index-1]=drink.getName();
        System.out.println(index+"番に「"+this.drinkname[index-1]+"」を"+this.drinkmoneyn[1][index-1]+"個登録しました");
        }
        else{
            System.out.println(index+"番には既に飲み物が登録されています");
        }
    }
    public void insertMoney(int money){
this.Mmoney+=money;
System.out.println(money+"円を投入しました");
System.out.println("現在"+this.Mmoney+"円入っています");
System.out.println();
    }
    public void buyDrink(int index){
        if(this.Mmoney<this.drinkmoneyn[0][index-1]){
            System.out.println("購入できませんでした(お金が足りません)");
        }
        else if(this.drinkname[index-1].equals("未登録")){
            System.out.println("購入できませんでした(未登録です)");
        }
        else if(this.drinkmoneyn[1][index-1]==0){
            System.out.println("購入できませんでした(売り切れです)");
        }
        else{
            this.drinkmoneyn[1][index-1]--;
            this.Mmoney-=this.drinkmoneyn[0][index-1];
            System.out.println(index+"番の「"+this.drinkname[index-1]+"」を購入しました");
        }
        
    }
    public void returnMoney(){
	System.out.println(this.Mmoney+"円のお釣りを出力しました");
    System.out.println();
	this.Mmoney=0;
    }
    public void printInfo(){
        System.out.println("---------------------");
        for(int i=0;i<5;i++){
            if(drinkname[i].equals("未登録")){
                System.out.println("-------"+drinkname[i]+"-------");
            }
            else if(drinkmoneyn[1][i]==0){
                System.out.println(i+"番 "+drinkname[i]+" "+drinkmoneyn[0][i]+"円 "+"売切");
        }
            else{
        System.out.println(i+1+"番 "+drinkname[i]+" "+drinkmoneyn[0][i]+"円 "+drinkmoneyn[1][i]+"個");
    }
    } 
    System.out.println("-------------------");
    System.out.println("現在"+this.Mmoney+"円入っています");
    System.out.println();
        }
	
    }

