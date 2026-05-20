package com.rocnation;

public class Jewelry extends FixedAsset {
    private double karat;


    public Jewelry(String name, double karat) {
        super(name, calculateMarketValue(karat));
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return calculateMarketValue(karat);
    }

    public static double calculateMarketValue(double karat){
        double marketValue = karat * 10000;
        return marketValue;
    }
}
