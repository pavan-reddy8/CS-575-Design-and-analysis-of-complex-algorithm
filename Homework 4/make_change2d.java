import java.util.Arrays;
import java.util.Scanner;

public class make_change2d {
    public static void make_change(int amount , int coins[]){
        if(coins[0]==1){
            while(amount!=0){
                for (int i = coins.length-1; i>=0; i--) {
                int  number_of_coins = amount/coins[i];
                amount = amount-number_of_coins*coins[i];
                System.out.println("Number of"+ coins[i]+":"+number_of_coins);
                }

            }
        }
        else
            System.out.println("There should be a penny");

    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        System.out.println("Enter the number of coins");
        int k = sc.nextInt();
        int coins[]= new int[k];
        for (int i = 0; i < k; i++) {
            System.out.println("enter coin "+(i+1)+" denomination:");
            coins[i]=sc.nextInt();
        }
        Arrays.sort(coins);
        make_change(amount, coins);
    } 
}
