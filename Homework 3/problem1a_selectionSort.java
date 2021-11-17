import java.util.Scanner;
public class problem1a_selectionSort{
    static void selectionSort(int a[]){
        int n=a.length;
        int min_j=0;//index of the minimum element in the unsorted remaining subarray 
        int temp;

        for(int i=0;i<n;i++){
            min_j=i;
            for(int j=i;j<n;j++){
                
                if(a[min_j]>a[j]){
                    min_j=j;        // finding the minimum element 
                }

            }
            temp=a[min_j];
            a[min_j]=a[i];      //swapping the minimum element of the subarray  of with intital element of the subarray
            a[i]=temp;

        }
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); // initializing scanner object
         System.out.print("Enter your number of elements: ");
         int n= sc.nextInt();
         System.out.println("Enter the array");
         int a[]=new int[n];
         for (int i = 0; i < n; i++) {
             System.out.println("Enter element "+i);  
             a[i]=sc.nextInt(); 
         }
         //int a[]={10,9,8,7,6,5,4,3,2,1};
         System.out.println("intial array");
         for (int i : a) {
            System.out.print(i+",");
        }
        System.out.println();
         selectionSort(a);
         System.out.println("sorted array");
         for (int i : a) {
             System.out.print(i+",");
         }
         System.out.println();
        
    }
}