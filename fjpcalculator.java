import java.net.SocketTimeoutException;
import java.util.Scanner;

import java.util.Scanner;

public class fjpcalculator{
  public static void main(String[] args) {
    

    System.out.println("enter first number");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    System.out.println("enter second number");
    int b = sc.nextInt();
    

 

 System.out.println("press 1 for addition");
 System.out.println("press 2 for substraction");
 System.out.println("press 3 for multiplication");
 System.out.println("press 4 for division");
 System.out.println("press 5 for remainder");

 
 int operation = sc.nextInt();
 sc.close();
 switch(operation){
    case 1 : System.out.println(a+b);
    break;
    case 2 : System.out.println(a-b);
    break;
    case 3 : System.out.println(a*b);
    break;
    case 4 : System.out.println(a/b);
    break;
    case 5 : System.out.println(a%b);

 }
    }
  }
    
