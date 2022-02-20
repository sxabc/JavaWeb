package com.soft2176.reflect;

import com.soft2176.domain.Person;

import java.lang.invoke.ConstantBootstraps;
import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass =Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);
        Object person = constructor.newInstance("ÕÅÈý",23);
        System.out.println(person);
        System.out.println("================================");
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Object person1 = constructor1.newInstance();
        System.out.println(person1);
        constructor1.setAccessible(true);
    }
}
