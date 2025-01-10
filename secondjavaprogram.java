import java.util.Scanner;

public class secondjavaprogram{
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=n; i>=1; i--){
          
        for(int j=1; j<=n; j++){
            if(j>=i){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}