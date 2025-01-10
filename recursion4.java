public class recursion4 {
    public static void fabonaucci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fabonaucci(b, c, n-1);

    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        
        System.out.println(a);
        System.out.println(b);
        fabonaucci(0, 1, 5);
    }
    
}
