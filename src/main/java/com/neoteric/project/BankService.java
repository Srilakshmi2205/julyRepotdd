package com.neoteric.project;

import com.neoteric.project.bankmodel.BankData;
import com.neoteric.project.bankmodel.Account;

import java.util.UUID;

public class BankService {
    Account account = null;
    public Account createAccount(BankData details){

         if(details.amount>=4000){
             account=new Account();
             account.accountNo = UUID.randomUUID().toString();
             account.ifscCode = "UNB1234";

         }
         return account;

    }
}
