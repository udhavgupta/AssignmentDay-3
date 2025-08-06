package com.hdfc.bank.models;

public abstract class Loan {
    private final int loanId;
    private String customerName;
    private double loanAmount;

    public static final String BANK_NAME = "HDFC Life";

    public Loan(int loanId, String customerName, double loanAmount) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount=loanAmount;
    }

    public abstract double calculateEMI();

    // Non-abstract method to print common loan details
    public void printDetails() {
        System.out.println("Loan ID: " + loanId + " | Customer: " + customerName + " | Type: " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Loan ID: " + loanId + " | Customer: " + customerName + "| Type: " + this.getClass().getSimpleName() + " | EMI: " + calculateEMI() + " | Loan Amount: " + loanAmount;
    }

    public int getLoanId() {
        return loanId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
