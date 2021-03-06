package cn.study.concurrent.t1;

/**
 * synchronized关键字
 * 同步粒度问题
 *
 * 尽量在商业开发中避免同步方法，使用同步代码块，细粒度解决同步问题
 * 可以提高效率。
 */
public class Test_12 {
    synchronized void m1(){
        //前值逻辑
        System.out.println("同步逻辑");
        //后值逻辑
    }

    void m2(){
        //前置逻辑
        synchronized (this){
            System.out.println("同步逻辑");
        }
        //后置逻辑
    }


}
