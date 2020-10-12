package com.yann.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class sumUtilTest {

    @Before
    public void before(){
        System.out.println("测试前准备");
    }




    @Test
    public void testSum1(){
        int result = sumUtil.sum1(1,2);
        Assert.assertEquals(result,3);
    }

    @Test
    public void  testSum2(){
        int result = sumUtil.sum2(1,2,3);
        Assert.assertEquals(result,6);
    }
    @After
    public void after(){
        System.out.println("测试后清朝");
    }
}