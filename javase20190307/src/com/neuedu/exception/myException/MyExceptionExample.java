package com.neuedu.exception.myException;

public class MyExceptionExample {
    /**
     * 自定义异常：
     *    实现：当String为null ，异常信息输出“字符串为空”
     *         当String为hello，异常信息输出“打招呼”
     */
    public static void main(String[] args) {

        String str="hello";
         try{
            new Controller().controller(str);
         }catch (MyException e){
             System.out.println(e.getMes());
         }
    }
}

class Controller{
    public void controller(String str) throws MyException{
        if(str==null){
            throw new MyException("字符串为空");
        }else if("hello".equals(str)){
            throw  new MyException("打招呼");
        }
    }
}

class MyException extends RuntimeException{
    //参数：用来传值
    private String mes;
    //子类构造器：接受参数，父类处理
    public MyException(String mes){
        super(mes);
    }
    //get 取值
    public  String getMes(){
        return super.getMessage();
    }
}