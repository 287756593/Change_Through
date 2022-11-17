package Interface;

/**
 * @projectName: Change _Through
 * @package: Interface
 * @className: camera
 * @author: 薛淮予
 * @description: camera 照相机类 实现usb interface 接口
 * @date: 2022/11/9 15:30
 * @version: 1.0
 */
public class camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("开始连接相机");
    }

    @Override
    public void stop() {
        System.out.println("关闭连接相机");
    }
}
