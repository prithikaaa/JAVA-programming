import java.util.Scanner;
public class java_arrays{
    public static void main(String[] args) {
        System.out.println("enter the size of array :");
       Scanner pd = new Scanner(System.in);
       int size = pd.nextInt();
       
       
       int[] rating = new int[size];
       int i;
       for(i=0; i<size; i++){
        System.out.println("rating :");

        
        rating[i] = pd.nextInt();
        

       }
       for(i=0; i<size; i++){
        System.out.println(rating[i]);
       }
       System.out.println("which rating you want to search :");
       int x = pd.nextInt();
       for(i=0; i<size; i++){
        if(x == rating[i]){
            System.out.println("your rating is found at index :" + i);
        }
       }
       pd.close();
       

    }
}