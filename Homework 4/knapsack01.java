import java.util.Scanner;

import javax.lang.model.element.Element;

public class knapsack01 {
    public static Scanner sc= new Scanner(System.in) ;
    static int max(int a, int b)
    { 
        if(a>b)
        return a;
        return b;


    }

    static void knapSack(int knapsack_weight, int item_weights[], int item_values[], int number_of_items)
    {
        int a[][] = new int[number_of_items + 1][knapsack_weight + 1];
        for (int i=0; i<=number_of_items; i++)
        {
            for (int j=0; j<=knapsack_weight;j++)
            {
                if (i==0 || j==0)
                    a[i][j]=0;
                else if (item_weights[i - 1] <= j)
                    a[i][j] = max(item_values[i - 1] + a[i - 1][j - item_weights[i - 1]], a[i - 1][j]);
                else
                    a[i][j]=a[i - 1][j];
            }
        }
 
        int res=a[number_of_items][knapsack_weight];
        int j=knapsack_weight;
        int l=number_of_items;
        for (int i = number_of_items; i>0; i--) {
                if (res!=0 && res != a[--l][j]){
                    System.out.print("item_weight:"+item_weights[i - 1] + " item_value:"+item_values[i-1]+"\n");
                    res = res - item_values[i - 1];
                    j = j - item_weights[i - 1];
                }
        }
        System.out.println("Total weight:"+a[number_of_items][knapsack_weight]);

    }

    public static int[] inputArray(int number_of_elememts,String s) {
        int a[]=new int[number_of_elememts];
        for (int i=0; i<number_of_elememts; i++ ) {
            System.out.println("enter "+s+(i+1));     
            a[i]=sc.nextInt();
        }
        return a;
    }

    public static void main(String args[])
    {
        //System.out.println("Enter the number of items");
        // int number_of_items = 3;
        // int item_values[] = new int[] { 60, 100, 120 };
        // int item_weights[] = new int[] { 10, 20, 30 };
        // int knapsack_weight = 50;
        System.out.println("Enter the number of items");
        int number_of_items = sc.nextInt();
        int item_values[] = inputArray(number_of_items,"values");
        int item_weights[] = inputArray(number_of_items,"weights");
        System.out.println("enter the knapack weight");
        int knapsack_weight = sc.nextInt();
        knapSack(knapsack_weight, item_weights, item_values, number_of_items);
    }
}