package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /*
    * 预期结果就是这个异常
    *
    * */

    //这是一个测试结果会失败的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcetionFailed(){
        System.out.println("这是一个运行失败的异常测试");
    }

    //这是一个测试结果会成功的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcetionSuccess(){
        System.out.println("这是一个我的异常测试");
        throw new RuntimeException();
    }
}
