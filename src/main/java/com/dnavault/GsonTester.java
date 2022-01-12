package com.dnavault;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.GsonBuilder;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class GsonTester {

    public GsonTester(){}

    public static Student deser(String jsonString)
    {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        Student student = gson.fromJson(jsonString, Student.class);
        return student;
    }

   // public static <T> T deserialize(String jsonString)
    //{
      //  GsonBuilder builder = new GsonBuilder();
       // builder.setPrettyPrinting();
        //Gson gson = builder.create();

       // return g.

        //De-serialization - get the type of the collection.

        //Type objType = new TypeToken<T>(){}.getType();
        //pass the type of collection
//        T marks = gson.fromJson(jsonString, TypeToken.get(new T().getClass().getType()));
     //   System.out.println("marks:" +marks);



        // TypeToken<T> typeToken = new TypeToken<T>() {};
       // TypeToken.getParameterized(ArrayList.class, myClass).getType();

      //  T objType = gson.fromJson(jsonString, get(Student.class));
        //return (T) marks;
    //}

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
    }
}


