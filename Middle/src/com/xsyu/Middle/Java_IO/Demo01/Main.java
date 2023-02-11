package com.xsyu.Middle.Java_IO.Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Java_IO.Demo01
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 21:16
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("相对路径");
        FileInputStream stream = new FileInputStream("test.txt");
        System.out.println("绝对路径");
        FileInputStream stream1 = new FileInputStream("E:\\02_Java\\10_JavaSE\\02_JavaSE\\JavaSE\\test.txt");
    }
}
