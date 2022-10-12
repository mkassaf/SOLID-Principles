package edu.najah.eng.solid.srp.example;

import edu.najah.eng.solid.srp.example.intf.ICalculator;
import edu.najah.eng.solid.srp.example.intf.IStudentHellper;
import edu.najah.eng.solid.srp.example.intf.IStudentPrinter;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Date dateOfBirth;
    private Address address;


    private IStudentPrinter printer;
    private IStudentHellper studentHellper;
    private ICalculator calculator;



    public void printDetails() {
        printer.print(this);
    }
    public void calculatePercentage() {
        calculator.calculate(this);
    }
    public void addStudent() {
        studentHellper.addStudent(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public IStudentPrinter getPrinter() {
        return printer;
    }

    public void setPrinter(IStudentPrinter printer) {
        this.printer = printer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public IStudentHellper getStudentHellper() {
        return studentHellper;
    }

    public void setStudentHellper(IStudentHellper studentHellper) {
        this.studentHellper = studentHellper;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public void setCalculator(ICalculator calculator) {
        this.calculator = calculator;
    }
}
