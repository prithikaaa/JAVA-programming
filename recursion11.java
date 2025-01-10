public class recursion11 {
    
    public static void removeduplicates(String str, int index, int n, String New ){
        
        if(str.charAt(n) = str.charAt(index)){
            str = str - str.charAt(index); 
            removeduplicates(str, index+1, n, New);
        }
        
    }
    
}
