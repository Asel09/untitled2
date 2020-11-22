package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkWeather(generateRandomAge(), 12));
        System.out.println(checkWeather(17, 34));
        System.out.println(checkWeather(23, 10));
        System.out.println(checkWeather(78, -90));
        System.out.println(checkWeather(42, 12));
    }

    private static int generateRandomAge() {
        Random random = new Random();
        int randomage = random.nextInt(70);
        System.out.println("random age: " + randomage);
        return randomage;

    }

    

    public static String checkWeather(int age, int temp) {
        String result;
        if (age > 20 && age < 45 && temp < 30 && temp > -20) {
            result = "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            result = "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            result = "Можно идти гулять";
        } else {
            result = "Оставайтесь дома";
        }
        return result;
    }


}
