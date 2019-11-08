package Algorithm;
import  java.util.Arrays;

/*测试二分法查找
二分法适用于已经排好序的数组
 */
 
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {30,20,50,10,80,9,7,12,100,50,8};
        Arrays.sort(arr);//排序
        System.out.println(Arrays.toString(arr));
        System.out.println(bSearch(arr,20));
    }
    public static int bSearch(int[] arr, int value){
        int low = 0;
        int high = arr.length - 1;
        while (low < high){
            int mid = (high-low)/2+low;//or (high+low)/2
            if (value == arr[mid]){
                return mid;
            }
            else if(value > arr[mid]){
                low = mid +1;
            }
            else if(value < arr[mid]){
                high = mid;
            }
        }
        return -1;
    }
}
