package com.study.input_output;

import java.util.Scanner;

/**
 * @Classname ScoreDemo
 * @Description TODO 输入两次考试的成绩, 并计算出两次成绩提升或者降低多少个百分点
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-30 14:58
 * @Version 1.0
 **/
public class ScoreDemo {

    // 输入成绩并进行对比
    public void compare(){

        // 创建输入对象Scanner
        Scanner firstScore = new Scanner(System.in);
        System.out.println("请输入第一次的成绩: ");
        Double getFirstScoreVal = firstScore.nextDouble();

        Scanner secondScore = new Scanner(System.in);
        System.out.println("请输入第二次的成绩: ");
        Double getSecondScoreVal = secondScore.nextDouble();

        if (getFirstScoreVal <= getSecondScoreVal){
            increase(getFirstScoreVal, getSecondScoreVal); // 执行增长方法
        } else {
            reduce(getFirstScoreVal, getSecondScoreVal);  // 执行降低方法
        }
    }

    // 创建增长方法
    public void increase(Double getFirstScoreVal, Double getSecondScoreVal){
        Double result = getSecondScoreVal - getFirstScoreVal;
        System.out.printf("成绩增长了: %.2f", result/getFirstScoreVal);
    }

    // 创建降低方法
    public void reduce(Double getFirstScoreVal, Double getSecondScoreVal){
        Double result = getFirstScoreVal - getSecondScoreVal;
        System.out.printf("成绩降低了: %.2f", result / getFirstScoreVal);
    }

    // 运行主方法
    public static void main(String[] args) {
        ScoreDemo scoreDemo = new ScoreDemo();
        scoreDemo.compare();
    }
}
