package com.hdfc.bank.models;

public class PersonalLoan extends Loan {
    private String purpose;

    // Constructor
    public PersonalLoan(int loanId, String customerName, double loanAmount, String purpose) {
        super(loanId, customerName, loanAmount);
        this.purpose = purpose;
    }

    // Overriding EMI calculation formula for Personal Loan
    @Override
    public double calculateEMI() {
        return getLoanAmount() * 0.15 / 12;  // Example EMI calculation formula for Personal Loan
    }

    // Overriding printDetails() to include specific PersonalLoan info
    @Override
    public void printDetails() {
        super.printDetails();  // Call to the super class method
        System.out.println("Purpose: " + purpose);
    }

    // Method Overloading: applyInsurance() with different parameters
    public void applyInsurance() {
        System.out.println("Applying basic Personal Loan insurance.");
    }

    public void applyInsurance(String additionalCover) {
        System.out.println("Applying Personal Loan insurance with additional cover: " + additionalCover);
    }
}
