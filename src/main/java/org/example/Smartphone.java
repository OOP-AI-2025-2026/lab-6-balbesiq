package org.example;

public class Smartphone implements GPS,Cellular {
    private double xCoord;
    private double yCoord;

    public Smartphone(double xCoord,double yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    @Override
    public double[] getCoordinates(){
        return new double[]{xCoord,yCoord};
    }

    @Override
    public void makeCall() {
        System.out.println("Calling");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving");
    }

}
