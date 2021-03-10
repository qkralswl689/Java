package com.javateam.jse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
 
 
public class ClassReflection2 {
 
    void test() throws NoSuchMethodException, SecurityException {
       
        Class<?> thisClass = this.getClass();
        String className = this.getClass().getName(); // Class Name
       
        System.out.println(className);
       
        Method[] thisMethodNames = thisClass.getDeclaredMethods();
       
        // this method Name !
        String thisMethodName = new Exception().getStackTrace()[0].getMethodName();
 
        System.out.println(thisMethodName);
    }
 
    /**
     * @param args
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
       
        new ClassReflection2().test();
    } //
 
}
