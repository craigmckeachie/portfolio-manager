package com.rocnation;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, calculateMarketValue(yearBuilt, squareFeet, bedrooms));
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return calculateMarketValue(yearBuilt, squareFeet, bedrooms);
    }

    public static double calculateMarketValue(int yearBuilt, int squareFeet, int bedrooms){
// 1. Establish the baseline cost per square foot for the Chicago market
        double basePricePerSqFt = 275.0;
        double baselineValue = squareFeet * basePricePerSqFt;

        // 2. Calculate physical depreciation based on the age of the property
        int currentYear = 2026;
        int age = currentYear - yearBuilt;
        if (age < 0) age = 0; // Handle edge case for new construction/future years

        // Depreciate value by 0.5% per year of age, capping maximum depreciation at 40%
        // (This ensures historic Chicago brick bungalows retain solid structural value)
        double depreciationRate = Math.min(age * 0.005, 0.40);
        double depreciatedValue = baselineValue * (1.0 - depreciationRate);

        // 3. Apply a utility premium per bedroom
        // (Reflects the market value premium for higher occupancy layouts)
        double valuePerBedroom = 15000.0;
        double bedroomPremium = bedrooms * valuePerBedroom;

        // 4. Combine factors for the final rough estimate
        double estimatedMarketValue = depreciatedValue + bedroomPremium;

        return Math.round(estimatedMarketValue);
    }
}
