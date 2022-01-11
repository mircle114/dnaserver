package com.dnavault.lab;

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
    public <T> T deserialize(T theClass, String jsonString)
    {
        //String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        T returnObj = gson.fromJson(jsonString, (Type) theClass);
        System.out.println(returnObj);

        jsonString = gson.toJson(returnObj);
        System.out.println(jsonString);

        return returnObj;
    }
}

