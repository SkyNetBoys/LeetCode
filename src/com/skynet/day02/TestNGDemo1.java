package com.skynet.day02;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestNGDemo1 {
    String testcaseName = "";

    @BeforeMethod
    public void beforeMethod(Method method) {
        testcaseName = method.getName();
    }

    @Test
    public void testcase_001() {
        System.out.println(testcaseName);
    }

    @Test
    public void testcase_002() {
        System.out.println(testcaseName);
    }
}
