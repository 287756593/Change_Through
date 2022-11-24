package CpuNumber.thread01;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.thread01
 * @className: deadlock
 * @author: 薛淮予
 * @description: 模拟实现死锁
 * @date: 2022/11/23 08:37
 * @version: 1.0
 */
public class deadlock extends Thread {
   static Object o1 = new Object();
   static Object o2 = new Object();
   boolean Flap ;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public deadlock(boolean Flap) {
        this.Flap = Flap;
    }

    @Override
    public void run() {
       if (Flap){
           synchronized (o1){
               System.out.println("进入1");
               synchronized(o2){
                   System.out.println("进入2");
               }
           }
       }else {
           synchronized (o2){
               System.out.println("进入3");
               synchronized (o1){
                   System.out.println("进入3");
               }
           }
       }
    }
}
class dome001{
    public static void main(String[] args) {
        deadlock O1 = new deadlock(true);
        deadlock O2 = new deadlock(false);
        O1.start();
        O2.start();
        //成功进入死锁

    }

}
