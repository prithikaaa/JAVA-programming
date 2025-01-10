public class recursion1 {
    public static void printnum(int n){
        if(n==6){
            return;
        }
        
        printnum(n+1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        int n = 1;
        printnum(n);
        
    }
}
