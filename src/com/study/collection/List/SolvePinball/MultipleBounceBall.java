package com.study.collection.List.SolvePinball;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 * @Classname MultipleBounceBall
 * @Description TODO 放置控制组件并实现控制
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-09-13 00:36
 * @Version 1.0
 **/
public class MultipleBounceBall extends Application {

    // 重写开始方法，Application类中的抽象方法
    @Override
    public void start(Stage stage) throws Exception {
        // 实例化MultipleBallPane组件
        MultipleBallPane ballPane = new MultipleBallPane();
        // 设置组件样式
        ballPane.setStyle("-fx-border-color: yellow");

        // 添加按钮，分别为增加和减少小球按钮
        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        // 构建水平盒子
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        // 添加或者移除小球
        btAdd.setOnAction(e -> ballPane.add());
        btSubtract.setOnAction(e -> ballPane.subtract());

        // 暂停或者重新开始
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        // 使用滚动条控制动画速度
        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        // 设置边界
        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        // 创建一个场景并将窗格放置在stage中
        Scene scene = new Scene(pane, 250, 150);
        // 设置程序title
        stage.setTitle("弹球");
        // 将stage放置在场景中
        stage.setScene(scene);
        // 展视
        stage.show();
    }
}
