package com.yann._39_backtracking;

import com.yann._39_backtracking._50;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class _50Test {      // 测试类, 是一个新类,
    private static _50.Solution1 solution1;
    private static _50.Solution2 solution2;
//      private static String copyright;      //定义类属性 类型,值
//    private static _50.Solution2  solution2 = new _50.Solution2();  // 一行定义并引用也可以


    @BeforeClass
    public static void steup() {
        solution1 = new _50.Solution1();  // 创建对象把引用给类属性
        solution2 = new _50.Solution2();
//                                    Hero.copyright = "版权";
//        只是写法上好看

    }

    @Test
    public void test1() {
//        _50.Solution1 solution1 =new _50.Solution1();       // 在方法里定义也可以
        assertEquals(1024.00000, _50Test.solution1.myPow(2.00000, 10), 0.00001);
        assertEquals(1024.00000, solution2.myPow(2.00000, 10), 0.00001);
    }
}
