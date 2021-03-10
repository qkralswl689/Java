package com.javateam.jse;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
 
 
public class ClassReflection {
   
    String name;
    int age;
   
    void test() throws SecurityException, ClassNotFoundException {
       
       
        String thisMethodName = this.getClass().getDeclaredMethods().toString();
               
        String className = this.getClass().getName();
        Method[] methods = Class.forName(className).getDeclaredMethods();
        Field[] fields = Class.forName(className).getDeclaredFields();
       
        // String mName = this.getClass().getDeclaredMethods().
       
        System.out.println("this method : "+thisMethodName);
       
        for (Method method : methods) {
            System.out.println(method.getName());  
        } // for
       
/*      for (Field field : fields) {
            System.out.println(field);
        }*/
        // System.out.println(this.getClass().getName());
    }
 
    public static void main(String[] args) throws SecurityException, ClassNotFoundException {
       
        ClassReflection cf = new ClassReflection();
       // cf.test();
 
        // Method[] methods = Class.forName("com.javateam.jse.ClassReflection").getMethods();// getMethods : 보유하고 있는것 전부
        
        //Method[] methods = Class.forName("com.javateam.jse.ClassReflection").getDeclaredMethods();
        
        /*
        Field [] flds =  Class.forName("com.javateam.jse.ClassReflection").getDeclaredFields();

//        for (Method method : methods) {
//            System.out.println(method);
//        }
        
        for(Field fld : flds) {
        	System.out.println(flds);
        }*/
  
       
    } // main
 
}