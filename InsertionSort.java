/**
 * 题目名称：插入排序 (Insertion Sort)
 *
 * 题目理解：
 * 插入排序是一种简单的排序算法，其基本思想是将一个记录插入到已经排好序的有序表中，从而得到一个新的、个数加一的有序表。
 * 它通过逐次比较待排序元素与已排序序列中的元素，并按顺序将其插入到正确位置上，最终实现整个序列的排序。

 * 解题思路：
 * 1. 初始化，假设数组的第一个元素为已排序部分。
 * 2. 对于数组中从第二个元素开始的每个元素（记为 key），都执行以下步骤：
   a. 将 key 与已排序部分的最后一个元素进行比较。
   b. 如果 key 小于或等于已排序部分的最后一个元素，则将该元素向后移动一位，继续向前比较。
   c. 重复步骤 b 直到找到 key 应该插入的位置或者到达数组的第一个元素。
   d. 将 key 插入到找到的位置。
 * 3. 重复步骤 2，直至遍历完所有元素，完成整个数组的排序。

 * 注意要点：
 * - 插入排序在最好情况下（即输入数组已经是有序）的时间复杂度为 O(n)，此时只需进行 n-1 次比较，无需交换操作。
 * - 对于大规模无序数组，插入排序的时间复杂度较高，为 O(n^2)，主要体现在元素移动过程中，效率较低，不适用于处理大数据量场景。
 * - while 循环式，注意条件是 j>=0 && arr[j] > key
 * - 最后插入时，是 arr[j+1]=key， 因为 j 满足调价，不想后移

 * 时间复杂度：
 * - 平均时间复杂度：O(n^2)
 * - 最好情况时间复杂度：O(n)
 * - 最坏情况时间复杂度：O(n^2)
 * - 空间复杂度：O(1) （原地排序）

 */
// 代码实现
public class InsertionSort {

    /**
     * 插入排序方法
     * @param arr 待排序的整数数组
     */
    public static void insertionSort(int[] arr) {
        for(int i= 1; i< arr.length; i++){
            int key= arr[i];
            int j = i -1;
            while (j >=0 && arr[j] > key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {9, 2, 5, 1, 7};
        
        // 调用插入排序方法对数组进行排序
        insertionSort(arrayToSort);

        // 输出排序后的数组
        System.out.println("Sorted array: ");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
    }
}