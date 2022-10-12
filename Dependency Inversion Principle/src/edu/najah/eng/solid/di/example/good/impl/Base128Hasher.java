package edu.najah.eng.solid.di.example.good.impl;

import edu.najah.eng.solid.di.example.good.intf.PasswordEncoder;

public class Base128Hasher implements PasswordEncoder {

    public int hashPassword(String password) {
        int hash = 128;
        for (int i = 0; i < password.length(); i++) {
            hash = hash*65 + password.charAt(i);
        }
        return hash;
    }

    @Override
    public int encoder(String password) {
        return hashPassword(password);
    }
}
