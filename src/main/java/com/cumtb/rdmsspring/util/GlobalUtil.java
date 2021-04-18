package com.cumtb.rdmsspring.util;

/**
 * @author zhangdehao
 * 2021/4/17
 */
public class GlobalUtil {

    public static int RED = 31;
    public static int GREEN = 32;

    public static void globalPrintln(Object... objects){
        for(Object object : objects){
            System.out.print("\033[1;" + GREEN + "m" + object.toString() + " <-> \033[0m");
        }
        System.out.println();
    }

    public static void globalPrintln(int colorCode, Object... objects){
        for(Object object : objects){
            System.out.print("\033[1;" + colorCode + "m" + object.toString() + " <-> \033[0m");
        }
        System.out.println();
    }

}
