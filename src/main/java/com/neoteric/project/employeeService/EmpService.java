package com.neoteric.project.employeeService;

import com.neoteric.project.employeemodel.EmpId;
import com.neoteric.project.employeemodel.Employee;

import java.util.UUID;

public class EmpService {
    EmpId empid = null;
    public EmpId empIDGenerate(Employee empData){
        if(empData.employeeAge>=25){
            empid = new EmpId();
            empid.employeeId = UUID.randomUUID().toString();

        }
        return empid;
    }
}
