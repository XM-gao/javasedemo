package com.neuedu.package01.stringbufferbuilder;

public class StringBufferExample {
    public static void main(String[] args) {
     pj();
    }

    /**
     * 1:拼接
     *  如： tom  22  java1  天津
     *       lili 20  java2   北京
     */
    public static  void pj(){
        String[][] strings=new String[2][4];
        strings[0]=new String[]{"tom","22","java1","天津"};
        strings[1]=new String[]{"lili","20","java2","北京"};
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<strings.length;i++){
            for(int j=0;j<strings[i].length;j++) {
                stringBuffer.append(strings[i][j]+"-");
            }
           stringBuffer.append("\n");
        }
        stringBuffer.delete(15,16);
        stringBuffer.delete(32,33);
        System.out.println(stringBuffer);
        System.out.println("字符数"+stringBuffer.length());
        System.out.println("空间容量："+stringBuffer.capacity());
    }


}
