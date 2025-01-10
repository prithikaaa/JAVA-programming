public class recursion6 {
    public static int powerwdsthtlogn(int x, int n){
        if(n == 0){
            return 1;
        }
        int xpown = 1;
        if(n%2 == 0){
            xpown = powerwdsthtlogn(x, n/2)*powerwdsthtlogn(x, n/2);
            
        }
        if(n%2 != 0){
            xpown = powerwdsthtlogn(x, n/2)*powerwdsthtlogn(x, n/2)*x;
            
        }
        return xpown;
    }
    public static void main(String[] args) {
        int ans = powerwdsthtlogn(2, 6);
        System.out.println(ans);

    }
    
}
