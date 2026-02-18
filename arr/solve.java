package arr;
import java.util.Arrays;

public class solve{
    public static void swap(int left, int right, int arr[]){
        if(right < left){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        swap(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

    }
}