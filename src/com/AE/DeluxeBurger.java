package com.AE;

/**
 * Created by Angel on 11/19/16.
 */
public class DeluxeBurger extends Hamburger {
    private int chips = 1;
    private int soda = 1;



    public DeluxeBurger(String breadRollType, int meatPatty, double price) {
        super(breadRollType, meatPatty, price);
    }

    public int getChips() {
        return chips;
    }

    public int getSoda() {
        return soda;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + chips + soda;
    }
}
