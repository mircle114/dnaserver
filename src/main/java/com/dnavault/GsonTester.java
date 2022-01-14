package com.dnavault;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.function.Supplier;


public class GsonTester <T>
{

    public GsonTester(T type)
    {

    }

    public static <T> T deSerialize(String jsonString, Class<T> cls) throws Exception
    {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        T objT = gson.fromJson(jsonString,cls);
        return objT;
    }

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
    }

    // Some misc examples
       // TypeToken<T> typeToken = new TypeToken<T>() {};
       // TypeToken.getParameterized(ArrayList.class, myClass).getType();
      //  T objType = gson.fromJson(jsonString, get(Student.class));
        //return (T) marks;
    //}


}


