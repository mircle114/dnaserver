package com.dnavault;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.function.Supplier;


public class GsonTester <T>
{
    private final static GsonBuilder builder = new GsonBuilder();
    private final static Gson gson = builder.create();

    public GsonTester(T type)
    {
      builder.setPrettyPrinting();
    }

    public static Gson getGson()
    {
        return gson;
    }

    public static <T> String serialize(T typeObj)
    {
       String serialized = getGson().toJson(typeObj);
       return serialized;
    }

    public static <T> T deSerialize(String jsonString, Class<T> cls) throws Exception
    {
        T objT = getGson().fromJson(jsonString,cls);
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


