import java.util.Scanner;

public class advjavapattern2 {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*n-1); j++){
                if(i%2==0){
                if(j==(n-a)){
                System.out.print(i);
                }
             else if(j==(n+a)){
                System.out.print(i);
             }

                
                else{
                    System.out.print(" ");
                }
            }
            else{
                if(j==(n-a)){
                    System.out.print(i);
                    }
                 else if(j==(n+a)){
                    System.out.print(i);
                 }
                 else if(j==n){
                    System.out.print(i);
                 }
    
                    
                    else{
                        System.out.print(" ");
                    }
            }
            }
            a = a + 1;
            System.out.println();
        }
    }
    
}
