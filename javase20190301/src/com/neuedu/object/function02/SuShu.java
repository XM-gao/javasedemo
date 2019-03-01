package com.neuedu.object.function02;

public class SuShu {//ctrl+all+l 代码格式化

    boolean fun(int num) {
        boolean flag = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
