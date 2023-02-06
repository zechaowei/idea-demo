package com.xsyu.Middle.list.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo03
 * Package: com.xsyu.Middle.list.Demo
 * Description:
 *              列表中允许存在相同元素，所以说我们可以添加两个一模一样的
 *              但是删除只会删除一个，并且删除第一个相同的元素
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/6 - 16:46
 * @Version: v1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = "哟唉嘛干你";
        list.add(str);
        list.add(str);
        list.remove(str);
        System.out.println(list);
    }
}
