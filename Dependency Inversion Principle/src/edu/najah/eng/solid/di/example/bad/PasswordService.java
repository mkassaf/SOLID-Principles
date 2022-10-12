package edu.najah.eng.solid.di.example.bad;

import edu.najah.eng.solid.di.example.bad.hash.Base64Hasher;

public class PasswordService {

    private Base64Hasher hasher = new Base64Hasher();
    void hashPassword(String password) {
        int result = hasher.hashPassword(password);
        System.out.println("result: " + result);
    }

}
