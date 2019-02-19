package com.course.testng;

import org.testng.annotations.Test;

public class test {
    public static void main( String[] args )//main方法的话是可以直接运行的一个方法,不用加@Test;一个java程序必须有main方法。
   // 一个程序，无论复杂或简单，总体上都是一个“函数”；这个函数就称为“main() 函数”，也就是“主函数”。比如有个“做菜”程序，那么“ 做菜 ”这个过程就是“主函数”。在主函数中，根据情况，可能还需要调用“买菜，切菜，炒菜”等子函数。
    //main函数在程序中大多数是必须存在的，但是依然有例外情况，比如windows编程中可以编写一个动态链接库（dll）模块，这是其他windows程序可以使用的代码。由于DLL模块不是独立的程序，因此不需要main函数。
    {
        System.out.println( "Hello World!" );
    }

   @Test
   //加@Test就为了做测试，就像跑一个main方法一样
    public void testCase1(){
        System.out.println("This is testCase1");
    }

}

