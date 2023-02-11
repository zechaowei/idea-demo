package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:     文件字节输入流
 *                     初始情况
 *                     注意：
 *                          //在使用完成一个流之后，必须关闭这个流来完成对资源的释放，否则资源会被一直占用
 *                          //建议在finally中进行，因为关闭流是任何情况都必须要执行的！
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 22:53
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream("test.txt");
            //此处可以随便写内容


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            //在使用完成一个流之后，必须关闭这个流来完成对资源的释放，否则资源会被一直占用
            //建议在finally中进行，因为关闭流是任何情况都必须要执行的！
            try {
                if (stream != null){
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
