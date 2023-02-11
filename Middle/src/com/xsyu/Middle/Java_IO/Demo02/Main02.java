package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: MainDemo
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:     语法糖     ----> try-with-resource语法
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 22:58
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("test.txt");) {   //直接在try()中定义要在完成之后释放的资源
            System.out.println(stream);
        } catch (IOException e) {       //这里变成IOException是因为调用close()可能会出现，而FileNotFoundException是继承自IOException的
            e.printStackTrace();
        }   //无需再编写finally语句块，因为在最后自动帮我们调用了close()
    }
}
