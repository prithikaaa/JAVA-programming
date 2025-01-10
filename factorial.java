import java.util.Scanner;

public class factorial {
    public static void findFactorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;

        
        }
        System.out.println(fact);
        return;

    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        findFactorial(n);


    }
    
}
