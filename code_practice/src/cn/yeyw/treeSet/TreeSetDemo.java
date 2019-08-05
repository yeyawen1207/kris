package cn.yeyw.treeSet;

import cn.yeyw.main.Person;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

/*        ts.add("abc");
        ts.add("aa");
        ts.add("nba");
        ts.add("cba");

        Iterator it = ts.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        ts.add(new Person("zhangsan", 28));
        ts.add(new Person("lisi", 23));
        ts.add(new Person("wangwu", 23));
        ts.add(new Person("zhouqi", 29));
        ts.add(new Person("zhaoliu", 25));

        Iterator it = ts.iterator();

        while (it.hasNext()){
            //这样的话，会打印1的name,2的age,3的name，4的age
            //System.out.println(((Person)it.next()).getName()+"::"+((Person)it.next()).getAge());
            Person p = (Person)it.next();
            System.out.println(p.getName()+"::"+p.getAge());
        }
    }


    public static String getType(Object o){
        //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法

    }
}
