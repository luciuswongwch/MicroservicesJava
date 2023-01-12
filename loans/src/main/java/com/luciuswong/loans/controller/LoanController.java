package com.luciuswong.loans.controller;

import com.luciuswong.loans.model.Loan;
import com.luciuswong.loans.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {
    @Autowired
    private LoanRepository loanRepository;

    @PostMapping("/myLoans")
    public List<Loan> getLoanDetails(@RequestBody Loan loan) {
        List<Loan> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(loan.getCustomerId());
        if (loans != null) {
            return loans;
        } else {
            return null;
        }
    }
}
