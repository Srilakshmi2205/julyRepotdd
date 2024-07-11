package com.neoteric.project;

import com.neoteric.project.model.Address;
import com.neoteric.project.model.Admission;
import com.neoteric.project.model.Student;
import com.neoteric.project.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentServiceTest {

    @Test
    public void getStudentAgeGreaterThanSix() {

        Address venkatAddress = new Address();
        venkatAddress.flatNo = "201";
        venkatAddress.area = "Miyapur";
        venkatAddress.city = "Hyd";
        venkatAddress.pinCode = "50090";


        Student venkat = new Student();
        venkat.name = "Venkat";
        venkat.age = 8;
        venkat.standard = "1";
        venkat.address = venkatAddress;

        StudentService service = new StudentService();
        Admission admission = service.getAdmission(venkat);


        Assertions.assertEquals(1000, admission.fee);
        Assertions.assertNotNull(admission.rollNo);
    }
}
