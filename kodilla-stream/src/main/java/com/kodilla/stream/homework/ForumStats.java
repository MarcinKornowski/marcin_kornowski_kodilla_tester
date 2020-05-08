package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double getAvgOverForty = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(ForumStats::getNumPost)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(getAvgOverForty);

        double getAvgBelowForty = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(ForumStats::getNumPost)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(getAvgBelowForty);
    }

    public static int getNumPost(User user) {
        return user.getNumberOfPosts();
    }
}
