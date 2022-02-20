package com.soft2176.reflect;

import com.soft2176.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields){
            System.out.println(field);
        }
        System.out.println("================================");
        Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p,"����");
        System.out.println(p);
        System.out.println("================================");
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field declaredField : declaredFields){
            System.out.println(declaredField);
        }
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
