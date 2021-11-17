import java.util.Scanner;

public class make_Change2a2b {

    public static void make_change_american_currency(int n){
        int cq=0,nq=0,cd=0,nd=0,cni=0,nni=0,cp=0;
        cq= n/25;
        nq=n-25*cq;
        cd=nq/10;
        nd=nq-10*cd;
        cni=nd/5;
        nni=nd-5*cni;
        cp=nni;
        System.out.println("Quarters:"+ cq +"\nDimes:"+ cd +"\nNikcles:"+ cni +"\nPennies:"+ cp);

    }
    public static void denominations_that_are_power_of_c(int n,int c,int k) {
        int coin = (int) (Math.pow(c, k));
        System.out.println(coin);
            while(n!=0 && coin!=0){

                {
                int  number_of_coins = n/coin;
                n = n-number_of_coins*coin;
                
                if(number_of_coins!=0)
                    System.out.println("Number of "+c+"^"+k+"("+coin+") coins :"+number_of_coins);
                k--;
                coin=coin/c;
                }

            }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
         System.out.println("Choose option:\n1) Quarter,nickel,dimes,pennies\n2) the denominations that are power c ");
        int op = sc.nextInt();
        switch(op){
            case 1: {
                make_change_american_currency(n);
            }
            break;
            case 2: {

                System.out.println("Enter the c in c^0,c^1,c^2.....c^k");
                int c=sc.nextInt();
                if(c!=1){
                    System.out.println("Enter the number of coins");
                    int k=sc.nextInt();
                    if(k>=1)
                        denominations_that_are_power_of_c(n, c, k-1);
                    else
                        System.out.println("Enter k>=1");
                }
                else
                    System.out.println("Enter c>1");
            }
        }
        //  int n = sc.nextInt();
        // // //make_change(n);
        //  denominations_that_are_power_of_c(n,5,10);
    }

}