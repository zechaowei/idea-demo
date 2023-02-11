package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: Main05
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description:
 *     使用`available`方法能查看当前可读的剩余字节数量
 *     注意：并不一定真实的数据量就是这么多，尤其是在网络I/O操作时，这个方法只能进行一个预估也可以说是暂时能一次性可以读取的数量，当然在磁盘IO下，一般情况都是真实的数据量
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/11 - 23:40
 * @Version: v1.0
 */
public class Main05 {
    public static void main(String[] args) {
        try(FileInputStream stream = new FileInputStream("test.txt")) {
            System.out.println(stream.available());     //查看剩余量

            System.out.println((char) stream.read());
            System.out.println(stream.available());     //查看剩余量
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
