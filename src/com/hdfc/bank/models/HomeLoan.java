package com.hdfc.bank.models;

public class HomeLoan extends Loan {
    private String propertyAddress;

    public HomeLoan(int loanId, String customerName, double loanAmount, String propertyAddress) {
        super(loanId, customerName, loanAmount);
        this.propertyAddress = propertyAddress;
    }

    @Override
    public double calculateEMI() {
        return getLoanAmount() * 0.12 / 12;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Property Address: " + propertyAddress);
    }

    public void applyInsurance() {
        System.out.println("Applying basic Home Loan insurance.");
    }

    public void applyInsurance(double coverageAmount) {
        System.out.println("Applying Home Loan insurance with coverage: " + coverageAmount);
    }
}
