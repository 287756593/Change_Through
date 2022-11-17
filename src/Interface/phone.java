package Interface;

/**
 * @projectName: Change _Through
 * @package: Interface
 * @className: phone
 * @author: 薛淮予
 * @description: phone 类 实现usb 接口
 * 1. phone 这个类需要实现usbinterface 这个接口声明的方法
 * @date: 2022/11/9 15:27
 * @version: 1.0
 */
public class phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("开始连接手机");
    }

    @Override
    public void stop() {
        System.out.println("结束手机连接");
    }
}
