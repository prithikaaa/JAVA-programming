import java.util.Scanner;

public class floydstriangle {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                sum = sum + 1;
            System.out.print(sum);
            }
            System.out.println();
        }
        
    }
}
