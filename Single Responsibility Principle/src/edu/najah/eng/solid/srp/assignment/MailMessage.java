package edu.najah.eng.solid.srp.assignment;

public class MailMessage {

    private String mailAddressFrom;
    private String mailAddressTo;
    private String mailSubject;
    private String mailBody;
    public MailMessage(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {
        //Validate the input (email)
        if(mailAddressFrom != null && !mailAddressFrom.isEmpty() && mailAddressFrom.contains("@") && mailAddressFrom.contains(".")){
            this.mailAddressFrom =  mailAddressFrom;
        }

        //Validate the input (email)
        if(mailAddressTo != null && !mailAddressTo.isEmpty() && mailAddressTo.contains("@") && mailAddressTo.contains(".")){
            this.mailAddressTo =  mailAddressTo;
        }

        //Validate the input
        if(mailSubject != null && !mailSubject.isEmpty() && mailSubject.length() <= 30){
            this.mailSubject =  mailSubject;
        }

        //Validate the input
        if(mailBody != null && !mailBody.isEmpty() ){
            this.mailBody =  mailBody;
        }
    }

    public boolean isValidMessage(){
        if(mailAddressFrom == null || mailAddressFrom.isEmpty() || !mailAddressFrom.contains("@") || !mailAddressFrom.contains(".")){
            return false;
        }
        if(mailAddressTo == null ||  mailAddressTo.isEmpty() ||  !mailAddressTo.contains("@") ||  !mailAddressTo.contains(".")){
            return false;
        }
        if(mailSubject == null ||  mailSubject.isEmpty() ||  mailSubject.length() > 30){
            return false;
        }
        if(mailBody == null || mailBody.isEmpty() ){
            return false;
        }
        return true;
    }
}
