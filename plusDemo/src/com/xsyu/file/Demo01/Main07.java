package com.xsyu.file.Demo01;

import java.io.File;

/**
 * ClassName: Main07
 * Package: com.xsyu.file.Demo01
 * Description:     获取当前路径下面的所有文件
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/21 - 22:43
 * @Version: v1.0
 */
public class Main07 {
    public static void main(String[] args) {
        File file = new File(".");
        for (String s : file.list()) {
            System.out.println(s);
        }
    }
}
