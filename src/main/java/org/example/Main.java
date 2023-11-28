package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
            HumanClass myObject = new HumanClass();
            Gson gson = new Gson();
            String json = gson.toJson(myObject);
            System.out.println(json);
    }
}