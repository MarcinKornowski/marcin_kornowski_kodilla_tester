package com.kodilla.stream;

public class User {
    private String userName;
    private int age;
    private int numberOfPosts;
    private String group;

    public User(String userName, int age, int numberOfPosts, String group) {
        this.userName = userName;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public String getGroup() {
        return group;
    }
}
