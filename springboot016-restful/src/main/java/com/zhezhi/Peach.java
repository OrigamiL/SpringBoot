package com.zhezhi;

/**
 * @Program: SpringBoot
 * @ClassName: Peach
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-10-11 17:11
 **/

public class Peach {
    private static int count = 0;
    private static int pit = 0;
    public static void main(String[] args) {
        method(100,0);
        System.out.println(count+" "+pit);
    }

    /**
     *
     * @param m  每轮吃桃子数
     * @param n  剩余桃核数
     */
    public static void method(int m,int n){
        if(m==0){
            pit=n;
            return;
        }
        count += m;
        method((m+n)/3,(m+n)%3);
    }
}
