public class Study02{
    public static void main(String[] args){
        VendingMachine v=new VendingMachine();
        Drink r1=new Drink("ソーダ",130);
        Drink r2=new Drink("コーラ",130);
        Drink r3=new Drink("天然水",100);
        Drink r4=new Drink("烏龍茶",120);
        

        v.registDrink(1,r1,1);
        v.registDrink(1,r2,2);
        v.registDrink(2,r2,2);
        v.registDrink(3,r3,5);
        v.registDrink(5,r4,2);

        int k;
        int p;
        boolean o=false;

     
        v.printInfo();
        while(true){
           
        System.out.println("行いたい操作を指定してください");
        System.out.print("(1: お金の投入,2: 飲み物の購入,3: お釣りの返却,4: 終了) > ");
         p=new java.util.Scanner(System.in).nextInt();
        switch (p) {
            case 1:
                 System.out.print("投入する金額を指定してください > ");
                  k=new java.util.Scanner(System.in).nextInt();
                 v.insertMoney(k);
                 o=true;
                break;
        
            case 2:
            System.out.print("購入する飲み物の番号を指定してください > ");
              k =new java.util.Scanner(System.in).nextInt();
            v.buyDrink(k);
                break;
                case 3:
                v.returnMoney();
                o=true;
                break;
                case 4:
                return;
        }
        if(o){
            o=false;
            continue;
        }
        v.printInfo();
        }

    }
}