public class recursion13 {
    //binary search
    public static int search(int arr[], int index, int target){
        if(arr[index] == target){
            return index;
        }
        else{
            return search(arr, index+1, target);
        }
       
    }
    public static void main(String[] args) {
        int arr[] = {8,4,90,66,47,56,78};
         System.out.println(search(arr, 0, 66));

    }

    
}
