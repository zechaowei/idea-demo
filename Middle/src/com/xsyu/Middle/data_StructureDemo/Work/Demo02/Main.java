package com.xsyu.Middle.data_StructureDemo.Work.Demo02;

import com.xsyu.Middle.data_StructureDemo.Demo03.LinkedStack;

/**
 * ClassName: Main
 * Package: com.xsyu.Middle.data_StructureDemo.Work.Demo02
 * Description: 括号匹配
 *
 * @Author: Mr.weizechao
 * @Create: 2023/2/5 - 10:35
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        LinkedStack<Character> stack = new LinkedStack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                Character ch = stack.pop();
                if (c == ')' && ch != '(')
                    return false;
                if(c == ']' && ch != ']')
                    return false;
                if (c == '}' && ch != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
