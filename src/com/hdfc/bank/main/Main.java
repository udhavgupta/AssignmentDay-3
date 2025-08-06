package com.hdfc.bank.main;

import com.hdfc.bank.models.*;
import com.hdfc.bank.service.LoanService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HomeLoan homeLoan1 = new HomeLoan(101, "Udhav", 500000, "157/ Nanak Nagar");
        PersonalLoan personalLoan1 = new PersonalLoan(102, "Shivam", 300000, "Wedding");

        List<Loan> loans = new ArrayList<>();
        loans.add(homeLoan1);
        loans.add(personalLoan1);

        LoanService loanService = new LoanService();
        for (Loan loan : loans) {
            loanService.printEMIDetails(loan);
        }

        System.out.println(homeLoan1);
        System.out.println(personalLoan1.toString());
    }
}
