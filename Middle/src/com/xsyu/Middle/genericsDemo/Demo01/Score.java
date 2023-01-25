package com.xsyu.Middle.genericsDemo.Demo01;

/**
 * ClassName: Score
 * Package: com.xsyu.Middle.genericsDemo.Demo01
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/25 - 21:02
 * @Version: v1.0
 */

public class Score {
    String name;
    String id;
    Object value;       //因为Object是所有类型的父类，因此既可以存放Integer也能存放String

    public Score(String name, String id, Object value){
        this.name = name;
        this.id = id;
        this.value = value;
    }
}
