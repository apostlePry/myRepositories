package cn.study.concurrent.t1;

/**
 * java迸发编程01
 * synchronized同步锁学习
 *
 * 注意"：
 *  1、synchronized锁this关键字和锁方法，都是锁的当前对象
 */
public class Test_01 {
    private int count = 0;
    private Object o = new Object();

    /**
     * 同步测试1
     * 测试同步锁对象，非当前对象
     */
    public void testSnyc01(){
        synchronized (o){
            System.out.println(Thread.currentThread().getName() + " count = " + count++);
        }
    }

    /**
     * 同步测试2
     * 测试同步锁对象，当前对象
     */
    public void testSnyc02(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + " count = " + count++);
        }
    }

    /**
     * 同步测试3
     * 测试同步锁方法,也是锁当前对象
     */
    public synchronized void testSync03(){
        System.out.println(Thread.currentThread().getName() + " count = " + count++);
    }

    public static void main(String[] args) {
        Test_01 t = new Test_01();
        t.testSnyc01();
        t.testSnyc01();
        t.testSnyc01();
        t.testSnyc02();
        t.testSync03();
    }
}
