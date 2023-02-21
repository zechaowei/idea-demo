package com.xsyu.file.Demo01;

import java.io.File;

/**
 * ClassName: Main02
 * Package: com.xsyu.file.Demo01
 * Description: 创建 hello 文件夹
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/21 - 22:18
 * @Version: v1.0
 */
public class Main02 {
    public static void main(String[] args) {
        File file = new File("hello");
        System.out.println(file.mkdir());       //运行之前删除hello文件夹，因为此时hello文件夹存在，则输出false
    }
}
