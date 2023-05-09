package cuo;
/**
 * @Author xhy
 * @Date 2023/5/4 10:08
 * @description: 继承自Exception类
 * @Title: MyException
 * @Package cuo
 */

public class MyException extends Exception{
    String msg;
    public MyException(String msg) {
        super(msg);
    }
}
