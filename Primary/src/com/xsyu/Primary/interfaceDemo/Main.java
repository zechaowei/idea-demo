package com.xsyu.Primary.interfaceDemo;

/**
 * ClassName: Main
 * Package: com.xsyu.Primary.interfaceDemo
 * Description: 接口
 *      1、接口不同于继承，接口可以同时实现多个
 *      2、接口同样支持向下转型
 *      3、从Java8开始，接口中可以存在方法的默认实现；如果方法在接口中存在默认实现，那么实现类中不强制要求进行实现    ----> Study接口
 *      4、接口中不允许存在成员变量和成员方法，但是可以存在静态变量和静态方法
 *      5、接口是可以继承自其他接口的,并且接口没有继承数量限制，接口支持多继承
 *      6、Object类中提供的克隆方法
 *
 *
 * @Author: Mr.weizechao
 * @Create: 2023/1/15 - 20:24
 * @Version: v1.0
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("小明", 18, "男");
        student.study();

        Teacher teacher = new Teacher("芳芳", 25, "女");
        teacher.study();

        /**
         * 接口同样支持向下转型
         */
        System.out.println();
        Study study = new Teacher("小王", 27, "男");
        //直接判断引用的对象是不是 Teacher 类型
        if(study instanceof Teacher){
            Teacher teacher1 = (Teacher) study;
            teacher1.study();
        }

        //可以直接通过`接口名.`的方式使用静态内容
        System.out.println("Study接口中的静态成员变量为：" + Study.a);
        Study.testStatic();


        /**
         * Object类中提供的克隆方法
         * 总结：原对象和克隆对象，是两个不同的对象，但是他们的各种属性都是完全一样的
         *      运行结果:Person{name='小明', age=18, sex='男'}
         *              Person{name='小明', age=18, sex='男'}
         *              false
         */
        System.out.println();
        Student clone = (Student) student.clone();

        System.out.println(student);
        System.out.println(clone);
        System.out.println(student == clone);
    }
}
