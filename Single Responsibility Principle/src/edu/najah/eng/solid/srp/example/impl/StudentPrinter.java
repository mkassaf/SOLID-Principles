package edu.najah.eng.solid.srp.example.impl;

import edu.najah.eng.solid.srp.example.Student;
import edu.najah.eng.solid.srp.example.intf.IStudentPrinter;

public class StudentPrinter implements IStudentPrinter {


    public void print(Student student) {

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getDateOfBirth());
        System.out.println(student.getAddress().toString());
    }
}
