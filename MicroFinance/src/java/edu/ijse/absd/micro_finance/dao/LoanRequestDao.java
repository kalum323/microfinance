/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dao;

import edu.ijse.absd.micro_finance.model.LoanRequest;


/**
 *
 * @author Thilina Kalum
 */
public interface LoanRequestDao {
    public void saveLoanRequest(LoanRequest loanRequest);
}
