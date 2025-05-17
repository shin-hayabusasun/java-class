public class Study01_3{
    public static void main(String[] args){
        while(true){
        System.out.print("1以上1000未満の自然数もしくはexitを入力してください:");
                String Sinput=new java.util.Scanner(System.in).nextLine();
    if(Sinput.equals("exit"))break;
    
    int input=Integer.parseInt(Sinput);
   
    if(input==1){
        System.out.print(input+"=");
        System.out.print("1");
        System.out.println();
    }
    else if(input>1000 || input<1){
        System.out.print("1以上1000以下の値を入力してください");
        System.out.println();
    }
    else{
        System.out.print(input+"=");
        int g=input;
        int[] a=new int[input+1];
        for(int i=0;i<input+1;i++){
            a[i]=0;
        }
        while(input!=1){
        for(int i=2;i<=input;i++){
            if(input%i==0){
                a[i]+=1;
                input=input/i;     
              break;
                 }
        }
    
    }

    
        int co=0;
        for(int i=2;i<g+1;i++){
            if(a[i]>1){
                if(co==1){
                    System.out.print("*");
                }
                co=1;
            System.out.print(i+"^"+a[i]);
            }
            if(a[i]==1){
                if(co==1){
                    System.out.print("*");
                }
                co=1;
                System.out.print(i);
                }
            
        }
        System.out.println();
    }
    }
}}