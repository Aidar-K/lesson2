package com.company;

public class Main {
    public static String classic(int age, int temp) {


        if (age > 20 && age < 45 && temp > -20 && temp > 30) {
            return ("Можно идти гулять");
        }
        else if (age < 20 && temp > 0 && temp < 28) {
            return ("Можно идти гулять");
        }
        else if (age > 45 && temp < -10 && temp < 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }

    public static void main(String[] args) {
        System.out.println(classic(30,25));
        System.out.println(classic(30,25));
        System.out.println(classic(30,25));
        System.out.println(classic(30,25));
        System.out.println(classic(30,25));
    }
}
