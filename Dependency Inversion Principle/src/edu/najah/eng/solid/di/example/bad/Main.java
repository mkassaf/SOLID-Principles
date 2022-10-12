package edu.najah.eng.solid.di.example.bad;

public class Main {

    public static void main(String[] args) {
        PasswordService passwordService = new PasswordService();
        passwordService.hashPassword("passowrd");
    }
}
