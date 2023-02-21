package com.xsyu.file.Demo01;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Main
 * Package: com.xsyu.file.Demo01
 * Description:
 * File类，它是专门用于表示一个文件或文件夹。
 * 只不过它只是代表这个文件，但并不是这个文件本身。
 * 通过File对象，可以更好地管理和操作硬盘上的文件
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/21 - 20:25
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.createNewFile());// 当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件
        System.out.println(file.exists());      // 判断文件是否存在
        System.out.println("文件的大小为: " + file.length());  // 获取文件的大小
        System.out.println(file.isDirectory());     // 是否为一个文件夹
        System.out.println("是否可读: " + file.canRead());         // 是否可读
        System.out.println("是否可写: " + file.canWrite());        // 是否可写
        System.out.println("是否可执行: " + file.canExecute());
    }
}