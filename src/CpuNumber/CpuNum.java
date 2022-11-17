package CpuNumber;

/**
 * @projectName: Change _Through
 * @package: CpuNumber
 * @className: CpuNum
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/15 14:41
 * @version: 1.0
 */
public class CpuNum {


    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int num = runtime.availableProcessors();
        System.out.println("cpu = " + num);

    }
}
