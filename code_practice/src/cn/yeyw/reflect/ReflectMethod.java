package cn.yeyw.reflect;

import cn.yeyw.main.Person;

import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args) throws Exception {
        //0.获取person的class对象
        Class personClass = Person.class;

        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        //获取指定名称的方法
        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p, "rice");

        //获取所有方法
        Method[] methods = personClass.getMethods();
        for (Method method:methods){
            System.out.println(method);
        }

    }
}
