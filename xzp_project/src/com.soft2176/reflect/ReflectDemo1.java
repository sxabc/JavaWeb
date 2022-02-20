package com.soft2176.reflect;

import com.soft2176.domain.Person;
import com.soft2176.domain.Student;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> cls1 = Class.forName("com.soft2176.domain.Person");
        System.out.println(cls1);
        Class<?> cls2 = Person.class;
        System.out.println(cls2);
        Person p = new Person();
        Class<?> cls3 = p.getClass();
        System.out.println(cls3);
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);
        Class<?> c = Student.class;
        System.out.println(c == cls1);
    }
}
