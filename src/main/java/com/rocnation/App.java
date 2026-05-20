//package com.rocnation;
//
//import java.util.ArrayList;
//
//public class App {
//    public static void main(String[] args) {
//        // Create the concrete ArrayList to hold Jay-Z's various Valuable assets
//        ArrayList<Valuable> jayZAssets = new ArrayList<>();
//
//        // 1. Jewelry: High-end custom piece
//        Jewelry customChain = new Jewelry("Jacob & Co. Blueprint Diamond Chain", 2500000.0, 24.0);
//        jayZAssets.add(customChain);
//
//        // 2. Gold: Physical bullion holdings
//        Gold bullion = new Gold("Swiss Vault Gold Bars", 5000000.0, 75.5);
//        jayZAssets.add(bullion);
//
//        // 3. House: The legendary Bel-Air estate
//        House belAirEstate = new House("Bel-Air Mega Mansion", 88000000.0, 2017, 30000, 8);
//        jayZAssets.add(belAirEstate);
//
//        // 4. Checking Account: Liquid business capital (Adds to Net Worth)
//        CheckingAccount businessCash = new CheckingAccount("Roc Nation Corporate Reserve", "CK-99PROBS-01", 15000000.0);
//        jayZAssets.add(businessCash);
//
//        // 5. Credit Card: Outstanding liability balance (Subtracts from Net Worth)
//        CreditCard blackCard = new CreditCard("Amex Centurion Black Card", "CC-HOVA-4444", -320000.0);
//        jayZAssets.add(blackCard);
//
//        // Create the main Portfolio instance for Jay-Z
//        Portfolio hovaPortfolio = new Portfolio("S. Carter Billionaire Holdings", "Shawn 'Jay-Z' Carter");
//
//        // Link the assets to his portfolio
//        hovaPortfolio.getAssets().addAll(jayZAssets);
//
//        // Print header
//        System.out.println("=== ROCOPERATIONS ASSET MANAGEMENT ===");
//        System.out.println("Portfolio Owner: " + hovaPortfolio.getOwner());
//        System.out.println("-------------------------------------");
//
//        // Calculate and display individual asset values using Polymorphism (.getValue())
//        double netWorth = 0.0;
//
//        //TODO: Get Value of the portfolio and print it
//
//
//        // Print the final aggregated net worth
//        System.out.println("-------------------------------------");
//        System.out.printf("TOTAL CALCULATED NET WORTH: $%,.2f%n", netWorth);
//        System.out.println("=====================================");
//    }
//}