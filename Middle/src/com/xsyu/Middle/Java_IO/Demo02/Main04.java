package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: Main04
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:
 *          使用read可以直接读取一个字节的数据，注意，流的内容是有限的，读取一个少一个。
 *          我们如果想一次性全部读取的话，可以直接使用一个while循环来完成：
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 23:30
 * @Version: v1.0
 */
public class Main04 {
    public static void main(String[] args) {
        try(FileInputStream stream = new FileInputStream("test.txt")) {
            int tmp;                //设置中间变量的原因是方便最后输出
            while ((tmp = stream.read()) != -1)         //通过while循环来一次性读完内容
                System.out.println((char) tmp);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
