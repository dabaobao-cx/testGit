package com.testMaven.learning;

import org.testng.annotations.Test;

public class testNG {

    @Test
    public void  test(){
        int a= 4,b=2;
        int c= a/b;
        int d= a*b;
        System.out.println("a 除 b = "+c);
        System.out.println("a 乘 b = "+d);


    }

}
