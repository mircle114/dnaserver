package com.dnavault;

import com.google.gson.Gson;


import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class GsonTester {

    public GsonTester(){}

    public static Student deser(String jsonString)
    {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        Student returnObj = gson.fromJson(jsonString, Student.class);
       /// System.out.println(returnObj);

        ///jsonString = gson.toJson(returnObj);
       ///System.out.println(jsonString);

        return returnObj;
    }
}

