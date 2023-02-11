package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: Main06
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 23:48
 * @Version: v1.0
 */
public class Main06 {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("test.txt")) {
            System.out.println(inputStream.skip(1));
            System.out.println((char) inputStream.read());   //跳过了一个字节
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
