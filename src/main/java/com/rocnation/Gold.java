package com.rocnation;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double weight) {
        super(name, calculateMarketValue(weight));
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return calculateMarketValue(weight);
    }

    public static double calculateMarketValue(double weight){
        double marketValue = weight * 4530;
        return marketValue;
    }
}
