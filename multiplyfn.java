import java.util.Scanner;

public class multiplyfn {
    public static int multiplyNum(int a, int b) {
       
        return a*b;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        

        
        System.out.println("the product is"+ multiplyNum(a, b));
        
    }
}
