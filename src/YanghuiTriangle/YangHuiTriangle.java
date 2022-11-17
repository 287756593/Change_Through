package YanghuiTriangle;

/**
 * @projectName: Change _Through
 * @package: YangHuiTriangle
 * @className: YangHuiTriangle
 * @author: 薛淮予
 * @description: 杨辉三角
 * @date: 2022/10/18 22:01
 * @version: 1.0
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        /**
         1
         1 1
         1 2 1
         1 3 3 1
         1 4 6 4 1
         1 5 10 10 5 1
         */
        /* 杨辉三角 nums[i][0] = 1 && nums[][i] = 1 */
        int[][] nums = new int[9][9];
        for (int i = 0; i < nums.length; i++) {
            nums[i][0] = 1;
            nums[i][i] = 1;
            for (int j = 0; j <= i; j++) {
                if (nums[i][j] == 0){
                    nums[i][j] = nums[i-1][j-1] + nums[i-1][j];
                }
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

}
