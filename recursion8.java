public class recursion8 {
    static int c=0;
    public static void findoccurance(String str, int index, char letter){
        
       
        if(index == str.length()-1){
           System.out.println(c);
           return;
            
        }
        if('a' == str.charAt(index)){
            c = index;
       }
        
        
        
        

        findoccurance(str, index+1, letter);

    }
    public static void main(String[] args) {
        
        findoccurance("aahgddaaanjaaaahaj", 0, 'a');
        
    }
}

