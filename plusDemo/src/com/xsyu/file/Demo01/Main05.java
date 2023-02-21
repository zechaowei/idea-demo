package com.xsyu.file.Demo01;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName: Main05
 * Package: com.xsyu.file.Demo01
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/21 - 22:27
 * @Version: v1.0
 */
public class Main05 {
    public static void main(String[] args) {
        File file = new File("/");
        System.out.println(Arrays.toString(file.list()));       //快速获取问价家下的文件名称列表
        for (File listFile : file.listFiles()) {                //所有子文件的File对象
            System.out.println(listFile.getAbsolutePath());     //获取文件的绝对路径
        }
    }
}
