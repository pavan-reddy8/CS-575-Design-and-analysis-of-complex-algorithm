import java.util.Scanner;

public class problem1b_ksmallest {
    static void kSmallest(int a[],int k){
        int n=a.length;
        int min_j=0;    //index of the minimum element in the unsorted remaining subarray 
        int temp;

        for(int i=0;i<k;i++){               //loop only runs k times to find the k smallest elements
            min_j=i;
            for(int j=i+1;j<n;j++){
                
                if(a[min_j]>a[j]){          // finding the minimum element
                    min_j=j;
                }

            }
            temp=a[min_j];
            a[min_j]=a[i];      //swapping the minimum element of the subarray  of with intital element of the subarray
            a[i]=temp;
        }
    }
     public static void main(String[] args) {
         //int a[]={4, 6,8, 15, 20, 22, 10, 3, 9, 2};
         //int k=4;
         
         Scanner sc = new Scanner(System.in); // initializing scanner object
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
        System.out.print("Enter k: ");
        int k= sc.nextInt();
        kSmallest(a,k);
         System.out.println("sorted array");
         for (int i : a) {
             System.out.print(i+",");
         }
         System.out.println();
        
    }
}
