package com.xsyu.Middle.Java_IO.Demo02;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: Main07plus
 * Package: com.xsyu.Middle.Java_IO.Demo02
 * Description: 写入内容
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/12 - 1:23
 * @Version: v1.0
 */
public class Main07plus {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {          //append:true表示开启追加模式
            fos.write('c');     //同read一样，可以直接写入内容
            fos.write("Hello World!".getBytes());  //也可以直接写入byte[]
            fos.write("Hello World!".getBytes(), 0, 1);    //同上输入流
            fos.flush();    //建议在最后执行一次刷新操作(强制写入)来保证数据正确写入到硬盘文件中
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
