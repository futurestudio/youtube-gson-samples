package io.futurestud.gson.video;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Gson 04 - Change the Naming of Fields with @SerializedName");

        serializeUserSimple();
        deserializeUserSimple();
    }

    private static void serializeUserSimple() {
        UserSimple user = new UserSimple(
                "Norman",
                "norman@futurestud.io",
                27,
                true
        );

        Gson gson = new Gson();
        String json = gson.toJson(user);
    }

    private static void deserializeUserSimple() {
        String userJson = "{'age':26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";

        Gson gson = new Gson();
        UserSimple userSimple = gson.fromJson(userJson, UserSimple.class);

    }
}
