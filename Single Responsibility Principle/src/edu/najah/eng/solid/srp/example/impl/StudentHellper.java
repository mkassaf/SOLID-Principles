package edu.najah.eng.solid.srp.example.impl;

import edu.najah.eng.solid.srp.example.Student;
import edu.najah.eng.solid.srp.example.intf.IStudentHellper;

public class StudentHellper implements IStudentHellper {
    public void addStudent(Student student) {
        String interQuery = getInsertQuery(student);
        DatabaseHellper.insertNewRecord(interQuery);
    }

    private String getInsertQuery(Student student) {
        StringBuilder query = new StringBuilder();
        query.append("Insert into Student Value (");
        query.append(student.getName());


        return query.toString();
    }
}
