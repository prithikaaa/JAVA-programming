public class recursion5 {
   /* public static void power(int x, int n, int s){
        if(n == 1){
            s = s*x;
            System.out.println(s);
            return;
        }
        
        s = s*x;
        power(x, n-1, s);

    }
    public static void main(String[] args) {
        power(2, 5, 1);
    }  */

    public static int power(int x, int n){
        if(n == 0){
            
            return 1;
            
        }
        int xpownm1 = power(x, n-1);
        int xpown = x * xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
       int ans = power(2, 5);
        System.out.println(ans);
    }
    
}
