package com.xsyu.Middle.genericsDemo.Demo01;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.genericsDemo.Demo01
 * Description: 走进泛型
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/25 - 21:02
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Score score = new Score("数据结构与算法基础", "XXX", "优秀");      //String类型
        Integer number = (Integer) score.value;
    }
}
