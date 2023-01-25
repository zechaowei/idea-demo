package com.xsyu.Middle.genericsDemo.Demo02;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.genericsDemo.Demo02
 * Description: 泛型类
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/25 - 21:11
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Score<String> score = new Score<>("计算机网络", "X", "优秀");
        //现在有了类型变量，在使用时同样需要跟上<>并在其中填写明确要使用的类型
        //这样我们就可以根据不同的类型进行选择
        String value = score.value;         //一旦类型明确，那么泛型就变成对应的类型了
        System.out.println(value);


        Score<Double> s = new Score<>("计算机组成与原理", "XX",1.0);
        Double v = s.value;
        System.out.println(v);
    }
}
