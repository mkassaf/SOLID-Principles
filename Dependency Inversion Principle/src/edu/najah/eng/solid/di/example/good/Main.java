package edu.najah.eng.solid.di.example.good;


import edu.najah.eng.solid.di.example.good.impl.Base128Hasher;
import edu.najah.eng.solid.di.example.good.impl.Base64Hasher;

public class Main {

    public static void main(String[] args) {
        PasswordService passwordService = new PasswordService();

        passwordService.setEncoder(new Base64Hasher());//set the encoder

        passwordService.hashPassword("passowrd");


        passwordService.setEncoder(new Base128Hasher());//Change the encoder

        passwordService.hashPassword("passowrd");
    }
}
