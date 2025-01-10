public class recursion14 {
    public static int sum(int n, int s){
       int remainder = n%10;
       s += remainder;
       if(n%10 == n){
        System.out.println(s);
        return s;


       }
       return sum((n-remainder)/10, s);
       
    }
    public static void main(String[] args) {
        sum(225, 0);
    }
    
}
