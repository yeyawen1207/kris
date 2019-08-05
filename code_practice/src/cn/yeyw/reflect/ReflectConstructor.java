package cn.yeyw.reflect;

import cn.yeyw.main.Person;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Constructor;

public class ReflectConstructor {
    public static void main(String[] args) throws Exception {
        //0.获取person的class对象
        Class personClass = Person.class;
        //获取构造器
        Constructor con = personClass.getConstructor(String.class, int.class);
        System.out.println(con);

        //创建对象,调用其中一个构造函数
        Object person = con.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("-------------------------");

        //创建对象，调用空参构造函数
        Constructor con1 = personClass.getConstructor();
        Object person2 = con1.newInstance();
        System.out.println(person2);
        //等效于
        Object op = personClass.newInstance();
        System.out.println(op);




    }
}
