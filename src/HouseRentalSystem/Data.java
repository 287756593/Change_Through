package HouseRentalSystem;

import java.util.Scanner;

/**
 * @projectName: Change _Through
 * @package: HouseRentalSystem
 * @className: Data
 * @author: 薛淮予
 * @description: 数据存储
 * @date: 2022/10/19 09:35
 * @version: 1.0
 */
public class Data {
    Scanner input = new Scanner(System.in);
    static String[] data = new String[1000];
    static int count = 1;

    public Data() {
    }

    public void added() {
        /**
         * @param :
         * @return void
         * @author 薛淮予
         * @description 新增房源
         * @date 2022/10/19 09:39
         */

        System.out.println("房源编号为:" + count);
        String str = "房源编号为:" + count + "\t";
        System.out.println("请输入 房源地址:");
        str += "房源地址: " + input.next() + "\t";
        System.out.println("请输入 房主手机号码:");
        str += "房主手机号码: " + input.next() + "\t";
        System.out.println("请输入 房租:");
        str += "房屋租金: " + input.next() + "\t";
        System.out.println("请输入 备注信息:");
        str += "备注信息: " + input.next() + "\t";
        System.out.println(str);
        System.out.println("上传成功");
        DataProcessing(str);
    }

    private void DataProcessing(String str) {
        data[count] = str;
        count++;
    }

    public void Delete() {
        System.out.println("请输入需要删除的id号码");
        int t = input.nextInt();
        DataProcessing(t);
    }

    private void DataProcessing(int count) {
        /**
         * @param count:
         * @return void
         * @author 薛淮予
         * @description 覆盖 用于删除
         * @date 2022/10/19 09:51
         */
        if (data[count] != null && !(data[count].equals("编号: " + count + "已被数据删除"))) {
            data[count] = "编号: " + count + "已被数据删除";
            System.out.println("删除成功");
        } else {
            System.out.println("此id没有数据，删除失败！");
        }
    }

    public void show() {
        if (data[1] == null) {
            System.out.println("目前没有房源信息");
            return;
        }
        for (int i = 1; i <= count; i++) {
            if (data[i] != null) {
                System.out.println(data[i]);
            }
        }
    }

    public void Lookup(){
        System.out.println("输入需要查找房源的id");
        int i = input.nextInt();
        System.out.println(Lookup(i));
    }
    private String Lookup(int num){
        if (data[num] == null){
            return "id 不存在";
        }
        return data[num];
    }
}
