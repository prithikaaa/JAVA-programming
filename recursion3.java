public class recursion3 {
    public static void factorial(int n, int i, int s){
        if(i==n){
            s = s*i;
            System.out.println(s);
            return;
             
        }
        s = s*i;
        factorial(n, i+1, s);

    }
    public static void main(String[] args) {
        factorial(5, 1, 1);
    }
}
