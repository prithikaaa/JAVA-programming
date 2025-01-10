public class recursion12 {
    public static void subsequence(String str, int index, String New){
        
        if(index == str.length()){
            System.out.println(New);
            return;
        }
        char current = str.charAt(index);
      subsequence(str, index+1, New+current);
      subsequence(str, index+1, New);
}
public static void main(String[] args) {
    subsequence("abc",0, "");
}
}

