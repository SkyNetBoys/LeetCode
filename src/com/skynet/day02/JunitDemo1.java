package com.skynet.day02;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class JunitDemo1 {

    @Rule
    public TestName testName = new TestName();

    @Test
    public void testcase_001(){
        System.out.println(testName.getMethodName());
    }

    @Test
    public void testcase_002(){
        System.out.println(testName.getMethodName());
    }
}
