package com.study.collection.List.SolvePinball;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


/**
 * @Classname Ball
 * @Description TODO 定义小球类, 继承fx包中的Circle类
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-09-12 23:16
 * @Version 1.0
 **/
public class Ball extends Circle {

    double dx = 1, dy = 1;

    Ball(double x, double y, double radius, Color color) {
        super(x, y, radius);
        // 设置小球颜色
        setFill(color);
    }
}
