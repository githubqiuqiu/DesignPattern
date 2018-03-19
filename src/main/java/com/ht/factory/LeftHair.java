package com.ht.factory;

/**
 * 左偏分发型
 * @auth Qiu
 * @time 2018/3/19
 **/
public class LeftHair implements  HairInterface {
    @Override
    public void draw() {
        System.out.println("-----------------左偏分发型-------------------");
    }
}
