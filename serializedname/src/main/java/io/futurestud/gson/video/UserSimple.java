package io.futurestud.gson.video;

import com.google.gson.annotations.SerializedName;

public class UserSimple {
    @SerializedName(value = "fullName", alternate = "full name")
    private String name;

    private String email;
    private int age;
    private boolean isDeveloper;

    public UserSimple(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    public String getName() {
        return name;
    }
}
