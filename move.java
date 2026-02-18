public class move{

    public static void shift(int arr[], int i, int j){
        if(arr[i] != 0 && arr[j] == 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
    public static void main(String args[]){
        int[] arr = {2, 3,0, 0, 4 ,0, 4};
    }
}

