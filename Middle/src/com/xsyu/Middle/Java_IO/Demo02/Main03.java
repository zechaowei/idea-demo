package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: Main03
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:     读取文件内容
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 23:07
 * @Version: v1.0
 */
public class Main03 {
    public static void main(String[] args) {
        try(FileInputStream stream = new FileInputStream("test.txt")) {
            int i = stream.read();
            // System.out.println(i);  //输出结果为数字，需要强制转换后才可以输出我们需要的英文字符
            System.out.println((char) i);

            int j = stream.read();
            System.out.println((char) j);
            /**
             * 此处输出结果说明每次read后，就会丢弃
             */
            int x = stream.read();
            System.out.println((char) x);

            int y = stream.read();
            System.out.println((char) y);

            int z = stream.read();
            System.out.println((char) z);

            int x1 = stream.read();
            System.out.println((char) x1);      //test.txt文本中的内容为 Hello World!，中间有空格，因此此处输出内容为空格

            int x2 = stream.read();
            System.out.println((char) x2);

            int x3 = stream.read();
            System.out.println((char) x3);

            int x4 = stream.read();
            System.out.println((char) x4);

            int x5 = stream.read();
            System.out.println((char) x5);

            int x6 = stream.read();
            System.out.println((char) x6);

            int x7 = stream.read();
            System.out.println((char) x7);

            int x8 = stream.read();
            System.out.println((char) x8);//所有的内容已经读完了，再次读取返回-1表示没有内容了
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
