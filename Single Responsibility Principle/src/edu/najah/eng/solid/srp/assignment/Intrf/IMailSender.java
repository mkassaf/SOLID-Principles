package edu.najah.eng.solid.srp.assignment.Intrf;

import edu.najah.eng.solid.srp.assignment.MailMessage;

public interface IMailSender {
    void sendEmail(MailMessage mailMessage);
}
