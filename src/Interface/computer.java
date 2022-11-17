package Interface;

/**
 * @projectName: Change _Through
 * @package: Interface
 * @className: computer
 * @author: 薛淮予
 * @description: 电脑类
 * @date: 2022/11/9 15:32
 * @version: 1.0
 */
public class computer {
    //编写一个方法

    public void work(UsbInterface usbInterface){
    usbInterface.start();
    usbInterface.stop();
    }
}
