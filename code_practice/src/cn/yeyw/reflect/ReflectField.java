package cn.yeyw.reflect;

import cn.yeyw.main.Person;

import java.lang.reflect.Field;

public class ReflectField {
    public static void main(String[] args) throws Exception {

        //0.获取person的class对象
        Class personClass = Person.class;

        //1.Field[] getFields()
        //获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields){
            System.out.println(field);
        }

        System.out.println("---------");

        //获取成员变量a的值
        Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p, "zhagsan");
        System.out.println(p);


        System.out.println("===========分割线===========");
        //Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField: declaredFields){
            System.out.println(declaredField);
        }
        //Field getDeclaredField(String name):获取单个成员变量
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        d.set(p, "666");
        System.out.println(p);

    }
}
