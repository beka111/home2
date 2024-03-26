package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 0));
        System.out.println(permission(15, 12));
        System.out.println(permission(33, 5));
        System.out.println(permission(45, 35));
        System.out.println(permission(10, 10));
    }

    public static String permission(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Oставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt();
        return age;
    }
}