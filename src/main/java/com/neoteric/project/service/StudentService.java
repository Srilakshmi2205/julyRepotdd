package com.neoteric.project.service;

import com.neoteric.project.model.Admission;
import com.neoteric.project.model.Student;

import java.util.UUID;

public class StudentService {
    Student venkat = new Student();

    public Admission getAdmission(Student venkat){
        Admission admission = null;

          admission  = new Admission();

        if(venkat.age >6) {
            admission.rollNo = "TG" + UUID.randomUUID().toString();
            admission.standard = venkat.standard;
            admission.fee = 1000;

        }
         return admission;

    }


}
