package com.xsyu.file.Demo01;

import java.io.File;

/**
 * ClassName: Main04
 * Package: com.xsyu.file.Demo01
 * Description: 删除文件夹
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/21 - 22:25
 * @Version: v1.0
 */
public class Main04 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println("删除文件: " + file.delete());// 删除文件
    }
}
