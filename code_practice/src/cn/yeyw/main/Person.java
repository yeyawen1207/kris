package cn.yeyw.main;

public class Person implements Comparable{
    private String name;
    private int age;

    public String a;
    protected int b;
    int c;
    private String d;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String food){
        System.out.println("eat..."+food);
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

/*        if (this.age > p.age)
            return 1;
        if (this.age<p.age)
            return -1;
        else {
            return this.name.compareTo(p.name);
        }*/
        //高级写法
        int temp = this.age - p.age;
        return temp==0?this.name.compareTo(p.name):temp;
    }
}
