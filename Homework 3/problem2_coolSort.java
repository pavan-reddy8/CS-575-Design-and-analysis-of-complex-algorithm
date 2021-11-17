import java.util.Scanner;

public class problem2_coolSort {
    static void coolSort(int a[],int h[]){
        for(int i=0;i<h.length;i++){
            int l=0;
            System.out.println("for h = "+h[i]);
            while(l<a.length){
                
                insertionSort(a, h[i],l++);// calling insertion sort for a particular step h 
                                            // l is the starting index of the sub array
            }
            for (int item : a) {
                    
                System.out.print(item+",");
            }
            System.out.println("\n");
        }

    }

    static void insertionSort(int a[],int k,int l){  // k is the step 
                                                    // l is the starting index of the sub array
        int n = a.length;
        for (int i=k+l; i < n; i=i+k) {
            int p = a[i];
            int j = i - k;                              // insertion sort modified for the particular problem
    
            while (j >= l && a[j] > p) {
                a[j+k] = a[j];
                j=j-k;
            }
            a[j + k] = p;
        }
    }
    
    public static void main(String[] args) {
        //int a[]= {62,83,18,53,07,17,95,86,47,69,25,28};

        Scanner sc = new Scanner(System.in);                                // initializing scanner object
        System.out.print("Enter your number of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the array");
        int a[]=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+i);  
            a[i]=sc.nextInt(); 
        }

        System.out.println("Intial array");
        for (int i : a) {
            System.out.print(i+",");
        }
        System.out.println("\n");
        
        int h[]={5,3,1};
        coolSort(a, h);
        System.out.println("Final sorted array");
        for (int i : a) {
            System.out.print(i+",");
        }
    }

}
