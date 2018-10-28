package com.testMaven.learning;

import org.testng.annotations.Test;

public class test1 {

    @Test
    public void  test(){
        int a= 4,b=2;
        int c= a+b;
        int d= a-b;
        System.out.println("a 加 b = "+c);
        System.out.println("a 减 b = "+d);

    }

}
