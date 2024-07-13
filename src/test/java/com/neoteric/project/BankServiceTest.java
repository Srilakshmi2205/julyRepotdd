package com.neoteric.project;

import com.neoteric.project.bankmodel.Account;
import com.neoteric.project.bankmodel.BankData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;



public class BankServiceTest {
    @Test
    public void Test(){
        BankData bank = new BankData();
        bank.accountHolder = "Sri";
        bank.accountType ="savings";
        bank.aadhaarNo = "221808030195";
        bank.age = 22;
        bank.amount = 4000;

        BankService bankService = new BankService();
        Account account = bankService.createAccount(bank);


        Assertions.assertEquals(4000,bank.amount);
        Assertions.assertNotNull(account.ifscCode);






    }

}
