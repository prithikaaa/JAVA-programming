import java.util.Scanner;

public class recursion2 {
    public static void sum(int n, int i, int s){
        if(i==n){
       
       
       System.out.println(s);
    return;}
    s = s+i;
       sum(n, i+1, s);

    }
    public static void main(String[] args) {
        sum(5, 1, 0);

      
    }
    
}
