package cuo;

import java.util.Scanner;

/**
 * @Author xhy
 * @Date 2023/5/4 10:28
 * @description: 测试类
 * @Title: Test
 * @Package cuo
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner sc= new Scanner(System.in);
        System.out.println("输入你要设置的年龄:");
        int age= sc.nextInt();
        p.setAge(age);
        System.out.println("他的年纪是:"+p.getAge());

    }
}
