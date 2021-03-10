package com.javateam.jse;
 
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
 
public class ReflectionTest2 {
 
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 
        DemoVO demoVO = new DemoVO();
 
        demoVO.setVisit1("abcd1234");
        Method method = demoVO.getClass().getDeclaredMethod("getVisit1");
        
        System.out.println(method.invoke(demoVO));
 
    }
 
}