package cn.yeyw.reflect;

import cn.yeyw.main.Person;

public class RefltctDemo1 {
    public static void main(String[] args) throws Exception {
        //方式1：Class.forname("全类名")
        //多用于配置文件，将类名定义在配置文件中。读取文件，加载类
        Class cls1 = Class.forName("cn.yeyw.main.Person");
        System.out.println(cls1);

        //方式2：类名.class
        //多用于参数的传递
        Class cls2 = Person.class;
        System.out.println(cls2);

        //方式3：对象.getclass()
        //多用于对象的获取字节码方式
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
    }
}
