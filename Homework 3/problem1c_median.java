

import java.util.Scanner;


public class problem1c_median {
    static void kSmallest(int a[],int k){
        int n=a.length;
        int min_j=0;       //index of the minimum element in the unsorted remaining subarray 
        int temp;

        for(int i=0;i<k;i++){               //loop only runs k times to find the k smallest elements
            min_j=i;
            for(int j=i+1;j<n;j++){
                
                if(a[min_j]>a[j]){
                    min_j=j;                    // finding the minimum element of the subarray
                }

            }
            temp=a[min_j];
            a[min_j]=a[i];                      //swapping the minimum element of the subarray  of with intital element of the subarray
            a[i]=temp;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initializing scanner object
         //int a[]={4, 6,8, 15, 20, 10, 3, 9, 2};
         //int n=a.length;

         
         System.out.print("Enter your number of elements: ");
         int n= sc.nextInt();
         System.out.println("Enter the array");
         int a[]=new int[n];
         for (int i = 0; i < n; i++) {
             System.out.println("Enter element "+i);  
             a[i]=sc.nextInt(); 
         }

         System.out.println("intial array");
         for (int i : a) {
            System.out.print(i+",");
        }
        System.out.println();

         int k= n/2+1;       // fixing the k value to n/2+1 beecause atleast n/2+1 elements in the input array must be sorted to get the Median of the input array 
         kSmallest(a,k);

         float median= (n%2==0) ?(float)(a[n/2]+a[n/2-1])/2:a[n/2]; // odd or even length of the input array
         

         System.out.println("\n median ="+median);
        
    }
    
}
