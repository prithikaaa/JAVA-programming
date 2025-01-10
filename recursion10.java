public class recursion10 {
    public static void sort(String str, int index, int count, String New){
        
        if(index == str.length()){
            for(int i=0; i<count; i++){
            New += 'x';}

            System.out.println(New);
            return;
        }
        char c = str.charAt(index);
        if(c == 'x'){
            count += 1;
        }
        else{
            New += c;
        }
        sort(str, index+1, count, New);
    }
    public static void main(String[] args) {
        sort("axbfghxx", 0, 0, "");
        
    }
    
}
