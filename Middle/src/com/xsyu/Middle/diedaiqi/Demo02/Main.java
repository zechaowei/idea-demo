package com.xsyu.Middle.diedaiqi.Demo02;

import java.util.Iterator;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.diedaiqi.Demo02
 * Description:
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 22:58
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        for (Test it = test; it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }

    static class Test implements Iterator<String> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public String next() {
            return "Hello World!";
        }
    }
}
