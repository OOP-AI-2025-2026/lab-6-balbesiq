package org.example;

public class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o){
        Car other = (Car) o;
        if (this.price < other.price) return 1;
        else if (this.price > other.price) return -1;

        if (this.year > other.year) return 1;
        else if (this.year < other.year) return -1;

        if (this.horsePower > other.horsePower) return 1;
        else if (this.horsePower < other.horsePower) return -1;

        return 0;
    }
}
