public class recursion9 {
    public static boolean check(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return check(arr, index+1);
             
        }
        else{
            return false;
        }
       
        

    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,3,5};

        System.out.println(check(arr, 0));
    }

    
}
