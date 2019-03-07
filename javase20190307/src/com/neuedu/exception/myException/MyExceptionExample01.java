package com.neuedu.exception.myException;

public class MyExceptionExample01 {
    /**
     * 自定义异常：
     *    实现：当String为null ，异常信息输出“字符串为空”
     *         当String为hello，异常信息输出“打招呼”
     */
    //应用
    public static void main(String[] args) {

        String str=null;
         try{
            new Controller01().controller(str);
         }catch (MyException01 e){
             System.out.println(e.getMes());
         }catch (MyException02 e){
             System.out.println(e.getMes());
         }
    }
}

/**
 * 产生异常的处理
 */
class Controller01{
    public void controller(String str) throws MyException01,MyException02{
        if(str==null){
            throw new MyException01("字符串为空");
        }else if("hello".equals(str)){
            throw  new MyException02("打招呼");
        }
    }
}

//自定义的异常
class MyException01 extends Exception{
    //参数：用来传值
    private String mes;
    //子类构造器：接受参数，父类处理
    public MyException01(String mes){
        super(mes);
    }
    //get 取值
    public  String getMes(){
        return super.getMessage();
    }
}


class MyException02 extends Exception{
    //参数：用来传值
    private String mes;
    //子类构造器：接受参数，父类处理
    public MyException02(String mes){
        super(mes);
    }
    //get 取值
    public  String getMes(){
        return super.getMessage();
    }
}