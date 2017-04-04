package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger angelBurger = new Hamburger("wheat",2,5);
        HealthyBurger healthyBurger = new HealthyBurger(1,6);
        DeluxeBurger deluxeBurger = new DeluxeBurger("white",1,6);
        System.out.println(healthyBurger.getBreadRollType());
        System.out.println(healthyBurger.getPrice());
        System.out.println(angelBurger.getPrice());
        System.out.println(healthyBurger.customHealthyBurger(3,2,2));
        System.out.println(angelBurger.customBurger(2,2,2,2));
        System.out.println(healthyBurger.getPrice());
        System.out.println(angelBurger.getPrice());
        System.out.println(deluxeBurger.getPrice());

    }
}
