package com.neoteric.project;

import com.neoteric.project.employeeService.EmpService;
import com.neoteric.project.employeemodel.EmpId;
import com.neoteric.project.employeemodel.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpServiceTest {
    @Test
    public void test(){
        Employee emp = new Employee();
        emp.employeeName = "Raju";
        emp.employeeGender = "Male";
        emp.employeeBloodGrp = "B+ve";
        emp.employeeAddress = "Hyd";
        emp.employeeAge = 26;

        EmpService empService = new EmpService();
        EmpId empid = empService.empIDGenerate(emp);

        Assertions.assertNotNull(empid.employeeId);
        Assertions.assertEquals("Male",emp.employeeGender);
    }
}
