package com.neoteric.project;

import com.neoteric.project.Insurance.InsType;
import com.neoteric.project.Insurance.InsuranceData;

public class InsService {
    InsType insuranceType = null;
    public InsType insuranceGetPolicy(InsuranceData details){
        if(details.insAge >=35  && details.insSalary >=90000){
             insuranceType = new InsType();
            insuranceType.InsPolicyType = "Health-policy";



        }
        return insuranceType;

    }
}
