public class CheckSort {
    public static boolean checkSort(int arr[], int idx) {
        if(idx == arr.length-1){
            return true;
        }
        
            if(arr[idx]<arr[idx+1]){
               return checkSort(arr, idx+1);
            }
            else {
                return false;
            }
        
    }
    public static void main(String[] args) {
        int arr [] = {1,7,3,4,5};
        System.out.println(checkSort(arr, 0));
        int arr1 [] = {1,2,3,4,5};
        System.out.println(checkSort(arr1, 0));

    }
}
