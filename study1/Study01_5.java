public class Study01_5{
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
        }
    public static void main(String[] args){
        System.out.println("------------- "+args[0]+" から "+args[1]+" までの素数-------------");
        int co=0;
        int[] argsd={0,0};
        argsd[0]=Integer.parseInt(args[0]);
        argsd[1]=Integer.parseInt(args[1]);
        if(argsd[0]<argsd[1]){
            for(int i=argsd[0];i<=argsd[1];i++){
                if(isPrime(i)){
                    System.out.printf("%4d",i);
                    co++;
                }
                if(co  ==12 ){
                    System.out.println();
                    co=0;
                }
            }
            if(co!=12){
                System.out.println();
            }
        }
        if(argsd[0]>argsd[1]){
            for(int i=argsd[0];i>=argsd[1];i--){
                if(isPrime(i)){
                    System.out.printf("%4d",i);
                    co++;
                }
                if(co==12){
                    System.out.println();
                    co=0;
                }
            }
            if(co!=12){
                System.out.println();
            }
        }
        System.out.println("================================================");
    }
}