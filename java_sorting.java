import java.util.Scanner;


public class java_sorting {
    
        //Bubble sorting
    
    public static void main(String[] args) {
        System.out.print("enter the size of array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
           int k = i+1;
            System.out.print("array" + k + " ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<=size-2; i++){
        for(int j=0; j<size-1; j++){
            if(arr[j]>arr[j+1]){
                //swap
                int a = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = a;
            }
        }
    }
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");

        }
        
    }
}
