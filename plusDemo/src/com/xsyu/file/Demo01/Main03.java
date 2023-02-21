package com.xsyu.file.Demo01;

import java.io.File;

/**
 * ClassName: Main03
 * Package: com.xsyu.file.Demo01
 * Description:创建 文件夹 mkdirs()
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/21 - 22:21
 * @Version: v1.0
 */
public class Main03 {
    public static void main(String[] args) {
        File file = new File("hello/test");     //在hello文件夹下创建test文件夹
        System.out.println(file.mkdirs());
    }
}
