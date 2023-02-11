package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: Main05plus
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:
 * 当然，一个一个读取效率太低了，那能否一次性全部读取呢？我们可以预置一个合适容量的byte[]数组来存放
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 23:43
 * @Version: v1.0
 */
public class Main05plus {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("test.txt")) {
            byte[] bytes = new byte[stream.available()];//提前准备好合适容量的byte数组来存放
            System.out.println(stream.read(bytes));     //一次性读取全部内容（返回值是读取的字节数）
            System.out.println(new String(bytes));      //通过String(byte[])构造方法得到字符串
            /**
             *     public String(byte bytes[]) {
             *         this(bytes, 0, bytes.length);
             *     }
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
