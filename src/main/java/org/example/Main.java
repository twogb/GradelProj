package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
            HumanClass myObject = new HumanClass("Svitlana", "Dubynka");

            String json = new Gson().toJson(myObject);
            System.out.println(json);
    }
}