public class insertion_sorting {
    public static void main(String[] args) {
      /*   int arr[] = {6,9,3,1,2};
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                int c = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = c;
            }
            for(int j=1; j<=i; j++){
                if(arr[i-j+1]<arr[i-j]){
                    int d = arr[i-j];
                    arr[i-j] = arr[i-j+1];
                    arr[i-j+1] = d;
                }
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        } */
        int arr[] = {7,4,8,3,1};
        for(int i=0; i<arr.length-1; i++){
            
            if(arr[i]>arr[i+1]){
               /* int c = arr[i]; */
                arr[i] = arr[i+1];
             /*  arr[i+1] = c;} */
            for(int j=1; j<i+1; j++){
                int p = j-1;
                if(arr[i-p]<arr[i-j]){
                   /*  int b = arr[i-p]; */
                    arr[i-p] = arr[i-j];
                   
                }
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
