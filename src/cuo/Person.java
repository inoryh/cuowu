package cuo;

/**
 * @Author xhy
 * @Date 2023/5/4 10:22
 * @description: 自定义类person
 * @Title: Person
 * @Package cuo
 */

public class Person {
    private String name;
    private int age;

    static int MAXAGE=100;

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int a) {
        if (a>MAXAGE||a<=0){
            try {
                throw new MyException("输入的年龄不符合规范");
            } catch (MyException e) {
                throw new RuntimeException(e);
            }
        }
        age = a;

    }
}
