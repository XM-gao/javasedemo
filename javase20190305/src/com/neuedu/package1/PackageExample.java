/**
 *
 */
package com.neuedu.package1;


/*import com.neuedu.homework.second.Car;*/
import com.neuedu.homework.second.*;
import com.neuedu.homework.second.three.Student;

/**
 * 包：一般使用的域名的反写实现的
 *    目的：1：层次清楚
 *          2：解决文件同名问题
 * 所在包的引用使用package
 * 位置：在文件的开始：除了注释
 * 在磁盘中包就是文件夹的嵌套
 *
 *
 *如果所有的类不在同一个包中，需要导入类所在的包，使用的关键字import
 *  import 包名.类名；//导入一个类的引用
 *  import 包名.*；//导入的包中所有的类，不包含子包
 */
public class PackageExample {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Car car=new Car("","",2);

        Student student=new Student();//alt+enter 导入包

    }
}
