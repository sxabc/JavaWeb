package com.soft2176.annotation;

import com.sun.source.tree.TryTree;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class<?> cls = c.getClass();
        Method[] methods = cls.getMethods();
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for(Method method : methods){
            if(method.isAnnotationPresent(Check.class)){
                try{
                    method.invoke(c);
                }catch(Exception e){
                    number++;
                    bw.write(method.getName()+"�������쳣��");
                    bw.newLine();
                    bw.write("�쳣�����ƣ�" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("�쳣�����ƣ�" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("���β���һ������" + number + "���쳣");
        bw.flush();
        bw.close();
    }
}
