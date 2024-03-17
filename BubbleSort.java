import java.util.Arrays
;
/**
 * 冒泡排序算法实现
 *
 * 冒泡排序是一种简单的排序算法，它重复地遍历待排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
 * 持续每一轮遍历直到没有更多的交换发生，这意味着数列已经排序完成。
 * 
 * 时间复杂度分析：
 * - 最好情况（已排序数组）：冒泡排序只需要进行一趟遍历即可完成排序，时间复杂度为 O(n)。
 * - 最坏情况（逆序数组）：冒泡排序需要进行 n-1 趟遍历，每趟遍历最多进行 n-i 次交换（i 从 0 到 n-2），总的时间复杂度为 O(n^2)。
 * - 平均情况：时间复杂度也为 O(n^2)。
 *
 * 空间复杂度：冒泡排序是原地排序算法，不需要额外空间，空间复杂度为 O(1)。
 */
public class BubbleSort {

    /**
     * 对给定的整数数组进行冒泡排序
     * @param arr 待排序的整数数组
     */
    public static void bubbleSort(int[] arr) {
       int length = arr.length;

       for(int i=0;i<length-1;i++){
        boolean swapped = false;
        for(int j=0;j<length-i-1;j++){
            if(arr[j]-arr[j+1] > 0){
                swapped =true;
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            if (!swapped){
                break;
            }
        }
       }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {5, 3, 8, 4, 6};
        bubbleSort(arrayToSort);
        System.out.println("Sorted array: " + Arrays.toString(arrayToSort));
    }
}