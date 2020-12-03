package com.yzl.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class prop {
    public static Object getParamFromProp(String key){
        InputStream is=prop.class.getClassLoader().getResourceAsStream("pram.properties");
        BufferedReader br= new BufferedReader(new InputStreamReader(is));
        Properties props = new Properties();
        try {
            props.load(br);
            return props.get(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(prop.getParamFromProp("password"));
    }
}
