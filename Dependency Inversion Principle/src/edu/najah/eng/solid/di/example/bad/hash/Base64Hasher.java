package edu.najah.eng.solid.di.example.bad.hash;

public class Base64Hasher {

    public int hashPassword(String password) {
        int hash = 7;
        for (int i = 0; i < password.length(); i++) {
            hash = hash*31 + password.charAt(i);
        }
        return hash;
    }
}
