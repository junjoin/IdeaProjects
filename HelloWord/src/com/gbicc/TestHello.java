package com.gbicc;


import javax.swing.plaf.metal.MetalIconFactory;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TestHello {
    public static String ss;

    public static String st;

    public static String getSs() {
        return ss;
    }

    public static void setSs(String ss) {
        TestHello.ss = ss;
    }

    public static String getSt() {
        return st;
    }

    public static void setSt(String st) {
        TestHello.st = st;
    }

    public TestHello() {
    }

    public static void main(String[] args) {
//        system.out.println("hellow");
//        system.out.println("hellow");
//        system.out.println("hellow");
        System.out.println("hellow");
        // 当行注释
        //region Description
        ArrayList list = new ArrayList();
        //endregion
        list.add(0,1);
//        Synchronized
        ArrayList list1 = new ArrayList();

        System.out.println("args = " + Arrays.deepToString(args));
        Date date = new Date();
        System.out.println();

        System.out.println("TestHello.main");

        if (date == null) {

        }
        if (date != null) {

        }

        if (date != null) {

        }

        if (date == null) {

        }


    }

    public void test002(){
        int num =10;
    }
}
