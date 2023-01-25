package com.xsyu.Middle.genericsDemo.Demo02;

/**
 * ClassName: Score
 * Package: com.xsyu.Middle.genericsDemo.Demo02
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/25 - 21:11
 * @Version: v1.0
 */
public class Score<T> {
    String name;
    String id;
    T value;

    public Score(String name, String id, T value){
        this.name = name;
        this.id = id;
        this.value = value;
    }

    //这里T可以是任何类型，但是一旦确定，那么就不能修改了，Object是任何类型的父类，即可以返回int类型和string类型的数据
    public T getValue() {
        return value;
    }
}
