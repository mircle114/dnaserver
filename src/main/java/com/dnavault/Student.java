package com.dnavault;

import java.lang.reflect.*;
import java.lang.reflect.Modifier;

public class Student
{
    private String name;
    // transient (do not include this as part of serialization object)
    private transient int valtest;
    private transient int age;

    public Student(){}

    public int getValtest()
    {
        return this.valtest;
    }

    public void setValtest(int inInt)
    {
        this.valtest = inInt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString()
    {
        return this.toString(true);
    }
    
    public String toString(boolean addAll) 
    {
        Field[] allFields = Student.class.getDeclaredFields();
        String output = this.getClass().getTypeName();
        output += "[";
        for(Field field : allFields )
        {
            boolean isTransientField = Modifier.isTransient(field.getModifiers());
           
            //System.out.printf("addAll: %s\n",addAll);
            if(addAll)
            {
                output += field.getName(); 
                output += ":, ";
            }
            else if(!isTransientField)
            {
                output += field.getName(); 
                output += ":, ";   
            }


        }
        output += "]";
        return output;
    }
}
