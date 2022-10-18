package edu.najah.eng.solid.srp.assignment.Impl;
import edu.najah.eng.solid.srp.assignment.Intrf.IMailSender;
import edu.najah.eng.solid.srp.assignment.MailMessage;

public class MailSender implements IMailSender{
    MailSender(){
        //making connection
    }
    public void sendEmail(MailMessage mailMessage)  {
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } 
        else {
            //show error message for the user
        }

    }
}
