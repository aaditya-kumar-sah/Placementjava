package arr;
import java.lang.reflect.Array;
import java.util.Arrays;

public class move{
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void move(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        
        while(right > left){
            if(arr[left] % 2 != 0 && arr[right] %2 == 0){
                swap(arr, left, right);
                left ++;
                right --;
            }
            else if(arr[left] % 2 == 0) left ++;
            else right --;
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 3, 5, 2, 4, 6, 0};
        move(arr);

    }
}