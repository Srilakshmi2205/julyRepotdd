package com.neoteric.project;

import com.neoteric.project.Insurance.InsType;
import com.neoteric.project.Insurance.InsuranceData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsuranceTestService {
    @Test
    public void InsuranceTest(){
        InsuranceData ins = new InsuranceData();
        ins.insHolderName = "Ramu";
        ins.insMailId = "RAmuaaa@gmail.com";
        ins.insAddress = "India";
        ins.insAge = 35;
        ins.insSalary = 95000;

        InsService insService = new InsService();
        InsType insuranceType = insService.insuranceGetPolicy(ins);

        Assertions.assertEquals("India",ins.insAddress);
        Assertions.assertNotNull(insuranceType.InsPolicyType);
        

    }
}
