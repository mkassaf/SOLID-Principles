package edu.najah.eng.solid.srp.example.impl;

import edu.najah.eng.solid.srp.example.Student;
import edu.najah.eng.solid.srp.example.intf.ICalculator;

public class Calculator implements ICalculator {
    public void calculate(Student student) {

        System.out.println("Database db = Database.getConnection()");
        System.out.println("result = db.executeQuery('select * from studentsInfo')");
        System.out.println(student.getId() + "perc = result/100");
    }
}
