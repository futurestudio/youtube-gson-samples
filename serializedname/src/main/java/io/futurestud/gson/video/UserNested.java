package io.futurestud.gson.video;

public class UserNested {
    private String name;
    private String email;
    private int age;
    private boolean isDeveloper;

    // new
    private UserAddress userAddress;

    public UserNested(String name, String email, int age, boolean isDeveloper, UserAddress userAddress) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.userAddress = userAddress;
    }
}
