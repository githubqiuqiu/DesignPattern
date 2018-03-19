package com.ht.single;

/**
 * 单例模式--->饿汉模式
 * 应用场合:有一个对象就足够了的情况
 * 作用:保证程序的实例只有一个
 * 类型:懒汉式和饿汉式
 *
 * @auth Qiu
 * @time 2018/3/19
 **/
public class Singleton {
    //1.将构造方法私有化，不允许外部直接创建对象
    private Singleton(){
    }
    //2.创建类的唯一实例，使用private static修饰  声明的时候就实例化了
    private static Singleton instance=new Singleton();

    //3.提供一个用于获取实例的方法，使用public static修饰
    public static Singleton getInstance(){
        return instance;
    }


}
