package com.hdfc.bank.service;

import com.hdfc.bank.models.Loan;

public class LoanService {

    public void printEMIDetails(Loan loan) {
        double emi = loan.calculateEMI();
        loan.printDetails();
        System.out.println("EMI: " + emi);

        if (loan instanceof com.hdfc.bank.models.HomeLoan) {
            com.hdfc.bank.models.HomeLoan homeLoan = (com.hdfc.bank.models.HomeLoan) loan;
            System.out.println("Loan Amount : " + homeLoan.getLoanAmount());
        } else if (loan instanceof com.hdfc.bank.models.PersonalLoan) {
            com.hdfc.bank.models.PersonalLoan personalLoan = (com.hdfc.bank.models.PersonalLoan) loan;
            System.out.println("Loan Amount :" + personalLoan.getLoanAmount());
        }
    }
}
