package com.AE;

/**
 * Created by Angel on 11/19/16.
 */
public class Hamburger{
        private String breadRollType;
        private int meatPatty;
        private double price;
        private int lettuce;
        private int tomato;
        private int cheeseSlice;
        private int bacon;

    public Hamburger(String breadRollType, int meatPatty, double price) {
        this.breadRollType = breadRollType;
        this.meatPatty = meatPatty;
        this.price = price;
    }

        public double costPerLettuce(int lettuce){
            this.lettuce = lettuce;
            double pricePerlettuce = .20;
            return lettuce*pricePerlettuce;
        }

        public double costPerBacon(int bacon){
            this.bacon = bacon;
            double pricePerBacon = .70;
            return bacon*pricePerBacon;
        }

        public double costPerTomato(int tomato){
            this.tomato = tomato;
            double pricePerTomato = .30;
            return tomato*pricePerTomato;
        }

        public double costPerCheeseSlice(int cheeseSlice){
            this.cheeseSlice = cheeseSlice;
            double pricePerCheeseSlice = .60;
            return cheeseSlice*pricePerCheeseSlice;
        }

        public double customBurger(int bacon, int tomato, int lettuce, int cheeseSlice){
        return costPerBacon(this.bacon = bacon) + costPerLettuce(this.lettuce = lettuce) + costPerTomato(this.tomato = tomato) +
                costPerCheeseSlice(this.cheeseSlice = cheeseSlice) + price;
    }





        public String getBreadRollType() {
            return breadRollType;
        }

        public int getMeatPatty() {
            return meatPatty;
        }

        public double getPrice()
        {
            if (lettuce != 0 || tomato != 0 || bacon != 0 || cheeseSlice != 0){
                System.out.println("you ordered a custom burger not a regular burger");
                return -1;
            }else{
                return price;
            }
        }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCheeseSlice() {
        return cheeseSlice;
    }

    public int getBacon() {
        return bacon;
    }
}
