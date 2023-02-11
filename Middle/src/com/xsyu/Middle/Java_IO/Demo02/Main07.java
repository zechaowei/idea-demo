package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: Main07
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description: 文件输出流
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/12 - 1:20
 * @Version: v1.0
 */
public class Main07 {
    public static void main(String[] args) {
        //输出流也需要在最后调用close()方法，并且同样支持try-with-resource
        try(FileOutputStream fos = new FileOutputStream("output.txt")) {
            //注意：若此文件不存在，会直接创建这个文件！
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
