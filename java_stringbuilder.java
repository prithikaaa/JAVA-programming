import java.util.Scanner;

public class java_stringbuilder {
    public static void main(String[] args) {
        System.out.println("enter the string :");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder(x);
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-i-1;
            char frontchar = sb.charAt(i);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
    
}
