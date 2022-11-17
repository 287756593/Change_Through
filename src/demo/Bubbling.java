package demo;

/**
 * @projectName: Change _Through
 * @package: demo
 * @className: Bubbling
 * @author: 薛淮予
 * @description: 冒泡排序
 * @date: 2022/11/8 09:07
 * @version: 1.0
 */
public class Bubbling {

    public static void main(String[] args) {
        /*创建一个数组 用冒泡排序*/
        int[] nums = {7, 4, 2, 1, 3, 6, 9, 11, 21, 12};
        nums = BubbleSort.Sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }

}

class BubbleSort {
    static int[] Sort(int[] array) {
        /**
         * @param array:
         * @return int
         * @author 薛淮予
         * @description 用于实现冒泡排序 并返回数组
         * @date 2022/11/8 09:09
         */
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
