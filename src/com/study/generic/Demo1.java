package com.study.generic;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Classname Demo1
 * @Description TODO 判断是否有编译错误
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-29 22:46
 * @Version 1.0
 **/
public class Demo1 {
    public static void main(String[] args) {

        // 未产生编译错误
        ArrayList date1 = new ArrayList();
        date1.add(new Date());
        date1.add(new String());

        // 编译会报错
        ArrayList<Date> date2 = new ArrayList<Date>();
        date2.add(new Date());
        // date2.add(new String());
    }
}
