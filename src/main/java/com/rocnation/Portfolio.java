package com.rocnation;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }



    public String getOwner() {
        return owner;
    }

    public void add(Valuable asset){
        this.assets.add(asset);
    }

    public double getValue(){
        double netWorth = 0;

        //loop through assets (valuable things) and add up the values
        for (Valuable asset: assets){
            netWorth += asset.getValue();
        }

        return netWorth;
    }
}
