import java.util.Scanner;

public class problem3{
    public boolean search (int a[], int l, int r){
        
        if(r>=l){
            
            int mid =(l+r)/2;                               // start searching from the middle element
            if(a[mid]==(mid+1)){                          // a[i]=i then return true
                return true;
            }
            else if(a[mid]>mid+1){                            //a[i]>i then search the subarray a[0....i]
                return search(a,l,mid-1);
               
            }
            else if(a[mid]<mid+1){         //a[i]<i then search the subarray a[i.....n]
                return search(a,mid+1,r);
            
            }
            
        }
        return false;       // return false if the array doesnt contain a[i]
    }
    public static void main(String[] args) {
        //int a[]={0,1,5,6,7,8};
        problem3 obj = new problem3();

        Scanner sc = new Scanner(System.in); // initializing scanner object
        System.out.print("Enter your number of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the array");
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i+1));  
            a[i]=sc.nextInt(); 
        }
        System.out.println("intial array");
        for (int i : a) {
           System.out.print(i+",");
       }
       System.out.println("\n");
        System.out.println(obj.search(a,0,a.length-1));
    }
}