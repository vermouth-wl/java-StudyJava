package com.study.collection.List.SolvePinball;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * @Classname MultipleBallPane
 * @Description TODO 在页面加载Ball
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-09-12 23:51
 * @Version 1.0
 **/
public class MultipleBallPane extends Pane {

    // 定义动画
    private Timeline animation;

    public MultipleBallPane() {
        // 创建移除小球的动画
        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        // 开始动画
        animation.play();
    }

    // 添加小球方法
    public void add() {
        // 随机生成一个颜色的小球
        Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
        // 在界面保存多个小球，getChildren()返回List<Node>类型的子类型ObservableList<Node>，存储面板中的节点
        getChildren().add(new Ball(30, 30, 30, color));
    }

    // 减少小球方法
    public void subtract() {
        if (getChildren().size() > 0) {
            getChildren().remove(getChildren().size() - 1);
        }
    }

    // 开始
    public void play() {
        animation.play();
    }

    // 暂停
    public void pause() {
        animation.pause();
    }

    // 加速
    public void increaseSpeed() {
        // 速度 + 0.1
        animation.setRate(animation.getRate() + 0.1);
    }

    // 减速
    public void decreaseSpeed() {
        // 速度 - 0.1， 三目运算符， 如果速度大于0则-0.1，否则设置为0
        animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }

    public DoubleProperty rateProperty() {
        return animation.rateProperty();
    }

    // 获取面板线性表中的所有小球，并调整每个小球的位置
    public void moveBall() {
        // 从面板线性表中获取小球
        for (Node node : this.getChildren()) {
            Ball ball = (Ball) node;
            // 检查边界
            if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()) {
                // 更改移动小球方位
                ball.dx *= -1;
            }
            if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()) {
                // 更改移动小球方位
                ball.dy *= -1;
            }
            // 调整小球方位
            ball.setCenterX(ball.dx + ball.getCenterX());
            ball.setCenterY(ball.dy + ball.getCenterY());
        }
    }
}
