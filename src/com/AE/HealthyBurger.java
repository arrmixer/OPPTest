package com.AE;

/**
 * Created by Angel on 11/19/16.
 */
public class HealthyBurger extends Hamburger{
    private int turkeyPatty;
    private int lowFatCheeseSlice;
    private int romaineLettuce;
    private int babyTomato;
    public HealthyBurger(int turkeyPatty, double price) {
        super("brown rye", 0, price);
    }


    public double costPerRomaineLettuce(int romainelettuce) {
       this.romaineLettuce = romainelettuce;
        double costPerRomainLettuce = .40;
        return romainelettuce*costPerRomainLettuce;
    }


    public double costPerBabyTomato(int babytomato) {
        this.babyTomato = babytomato;
        double costPerBabyTomato = .30;
        return babytomato*costPerBabyTomato;

    }

    public double costPerCheeseSlice(int lowFatCheeseSlice) {
       this.lowFatCheeseSlice = lowFatCheeseSlice;
        double costPerLowFatCheeseSlice = .80;
        return lowFatCheeseSlice*costPerLowFatCheeseSlice;
    }


    public double customHealthyBurger(int babytomato, int romaineLettuce, int lowFatCheeseSlice) {
        double price = getPrice();
        return costPerCheeseSlice(this.lowFatCheeseSlice = lowFatCheeseSlice) + costPerBabyTomato(this.babyTomato = babytomato) +
                costPerLettuce(this.romaineLettuce = romaineLettuce ) + price;
    }

    public int getTurkeyPatty() {
        return turkeyPatty;
    }

    public int getLowFatCheeseSlice() {
        return lowFatCheeseSlice;
    }

    @Override
    public double getPrice() {
        if (romaineLettuce != 0 || babyTomato != 0 || lowFatCheeseSlice != 0){
            System.out.println("you ordered a " + getClass().getSimpleName() + " not a regular burger");
            return -1;
        }else{
            return super.getPrice();
        }

    }
}
