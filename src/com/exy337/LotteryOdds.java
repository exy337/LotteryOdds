package com.exy337;

import java.util.Scanner;

/**
 * 这个程序是彩票中奖机率的算法
 * 来源自Java核心技术卷1（中文版）P71
 * @version 1.00 2017-10-30
 * @author exy337
 */

public class LotteryOdds {

    //在类中放main函数是单元测试调试技巧
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("选几个数字？");
        int k = in.nextInt();

        System.out.println("共多少个数字？");
        int n = in.nextInt();

        LotteryOdds odds = new LotteryOdds();
        System.out.println("中奖机率是:" + odds.getLotteryOdds(k,n) + "分之一");
    }

    //中奖机率算法,比如1-50之间的数字中取是6个数字来抽奖.
    //那么会有(50×49×48×47×46×45)/(1×2×3×4×5×6)种可能的地果，所以中奖机率是1/15890700
    //k，选几个数字
    //n, 共有多少个数字
    public int getLotteryOdds(int k,int n)
    {
        int lotteryOdds = 1;
        for(int i=1; i <=k; i++)
        {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        return lotteryOdds;
    }
}