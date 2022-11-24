package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello new world!");

        System.out.println(add(3, 4));

        System.out.println(biggerThan100(177));


    }

    public static int add(int a, int b){
        return a+b;
    }

    public static String biggerThan100(int c) {
        if (c > 100) {
            return "Number is bigger than 100";
        }
        else {
            return "Number is smaller than 100";
        }
    }


}