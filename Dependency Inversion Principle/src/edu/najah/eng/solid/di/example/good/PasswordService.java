package edu.najah.eng.solid.di.example.good;

import edu.najah.eng.solid.di.example.good.impl.Base64Hasher;
import edu.najah.eng.solid.di.example.good.intf.PasswordEncoder;

public class PasswordService {

    private PasswordEncoder encoder;

    void hashPassword(String password) {
        if (encoder == null){
            System.err.println("Encoder is null, please set encoder before calling it");
            return;
        }
        int result = encoder.encoder(password);
        System.out.println("result: " + result);
    }


    public PasswordEncoder getEncoder() {
        return encoder;
    }

    public void setEncoder(PasswordEncoder encoder) {
        this.encoder = encoder;
    }
}
