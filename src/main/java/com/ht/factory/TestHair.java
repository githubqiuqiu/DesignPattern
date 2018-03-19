package com.ht.factory;

/**
 * 模拟客户端实现
 * @auth Qiu
 * @time 2018/3/19
 **/
public class TestHair {

    public static void main(String[] args) {

        HairInterface left = new LeftHair();
        left.draw();
    }

}
