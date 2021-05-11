package com.cumtb.rdmsspring.util;

/**
 * 全局通用工具
 * @author zhangdehao
 * 2021/4/17
 */
public class GlobalUtil {

    private static int RED = 31;
    private static int GREEN = 32;

    /**
     * 输出工具
     * @param objects
     */
    public static void globalPrintlnGreen(Object... objects){
        for(Object object : objects){
            if(object == null){
                object = "null";
            }
            System.out.print("\033[1;" + GREEN + "m" + object.toString() + " <-> \033[0m");
        }
        System.out.println();
    }

    /**
     * 输出工具
     * @param objects
     */
    public static void globalPrintlnRed(Object... objects){
        for(Object object : objects){
            if(object == null){
                object = "null";
            }
            System.out.print("\033[1;" + RED + "m" + object.toString() + " <-> \033[0m");
        }
        System.out.println();
    }

}
