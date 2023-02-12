package com.xsyu.Middle.Java_IO.Demo03;

import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Java_IO.Demo03
 * Description:     字符流不同于字节，字符流是以一个具体的字符进行读取，因此它只适合读纯文本的文件，如果是其他类型的文件不适用
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/12 - 22:35
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("test.txt")) {
            reader.skip(1);
            System.out.println((char) reader.read());           ////现在是按字符进行读取，而不是字节，因此可以直接读取到中文字符
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
