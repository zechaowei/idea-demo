package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: Main08
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:
 *              利用输入流和输出流，实现文件的拷贝
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/12 - 1:31
 * @Version: v1.0
 */
public class Main08 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test.txt");
        FileOutputStream fos = new FileOutputStream("output.txt")) {
            byte[] bytes = new byte[10];//使用长度为10的byte[]做传输媒介，比较大的文件可以采用1024的byte[]做传输媒介
            int tmp;        //存储本地读取字节数
            while ((tmp = fis.read(bytes)) != -1)       //直到读取完成为止
                fos.write(bytes, 0, tmp);           //写入对应长度的数据到输出流

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
