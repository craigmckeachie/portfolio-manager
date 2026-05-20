package com.rocnation;


public class App {
    public static void main(String[] args) {

        // Create the main Portfolio instance for Jay-Z
        Portfolio hovaPortfolio = new Portfolio("S. Carter Billionaire Holdings", "Shawn 'Jay-Z' Carter");

        // 1. Jewelry: Jacob & Co. Chain (Calculates value internally based on 24.0 karat gold/diamonds)
        // Constructor signature assumed: Jewelry(String name, double karat)
        Jewelry customChain = new Jewelry("Jacob & Co. Blueprint Diamond Chain", 24.0);
        hovaPortfolio.add(customChain);

        // 2. Gold: Physical bullion holdings (Calculates value internally based on 75.5 kg weight)
        // Constructor signature assumed: Gold(String name, double weight)
        Gold bullion = new Gold("Swiss Vault Gold Bars", 75.5);
        hovaPortfolio.add(bullion);

        // 3. House: Bel-Air estate (Calculates value internally based on square footage and bedrooms)
        // Constructor signature assumed: House(String name, int yearBuilt, int squareFeet, int bedrooms)
        House belAirEstate = new House("Bel-Air Mega Mansion", 2017, 30000, 8);
        hovaPortfolio.add(belAirEstate);

        // 4. Checking Account: Cash balance (Value is directly tied to the balance)
        // Constructor signature assumed: CheckingAccount(String name, String accountNumber, double balance)
        CheckingAccount businessCash = new CheckingAccount("Roc Nation Corporate Reserve", "CK-99PROBS-01", 15000000.0);
        hovaPortfolio.add(businessCash);

        // 5. Credit Card: Outstanding liability (Value is directly tied to the negative balance)
        // Constructor signature assumed: CreditCard(String name, String accountNumber, double balance)
        CreditCard blackCard = new CreditCard("Amex Centurion Black Card", "CC-HOVA-4444", -320000.0);
        hovaPortfolio.add(blackCard);


        // Print header
        System.out.println("=== ROCOPERATIONS ASSET MANAGEMENT ===");
        System.out.println("Portfolio Owner: " + hovaPortfolio.getOwner());
        System.out.println("-------------------------------------");


        double netWorth = hovaPortfolio.getValue();
        // Print the final aggregated net worth
        System.out.println("-------------------------------------");
        System.out.printf("TOTAL CALCULATED NET WORTH: $%,.0f%n", netWorth);
        System.out.println("=====================================");

        System.out.println("=====================================");
    }
}