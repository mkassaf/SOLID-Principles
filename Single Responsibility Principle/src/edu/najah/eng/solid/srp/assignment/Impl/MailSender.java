public class MailSender implements IMailSender{
    Mailsender(){
        //making connection
    }
    @Override
    public void sendEmail(MailMessage mailMessage)  {
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } 
        else {
            //show error message for the user
        }

    }
}
