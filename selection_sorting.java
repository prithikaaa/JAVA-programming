public class selection_sorting {
    public static void main(String[] args) {
        int arr[] = {3,5,9,6,2};
        for(int j=0; j<arr.length-1; j++){
        for(int i=0; i<arr.length-j; i++){
            if(arr[j]>arr[i+j]){
                int a =arr[j];
                arr[j] = arr [i+j];
                arr[i+j] = a;
            } 
        }

    }
    for(int k=0; k<arr.length; k++){
        System.out.print(arr[k] + " ");
    }
    
}
}
