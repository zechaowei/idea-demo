package com.xsyu.file.Demo01;

import java.io.File;

/**
 * ClassName: Main06
 * Package: com.xsyu.file.Demo01
 * Description:     求当前磁盘下内存剩余量
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/21 - 22:39
 * @Version: v1.0
 */
public class Main06 {
    public static void main(String[] args) {
        File file = new File("/");
        System.out.println("内存剩余容量: " + file.getFreeSpace() / 1024 / 1024 / 1024 + "G");
    }
}
