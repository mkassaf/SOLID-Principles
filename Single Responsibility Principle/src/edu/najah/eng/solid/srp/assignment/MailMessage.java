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
// the constructor and isValidMessage() both validate th inputs and we have Complex Constructor so we can do the following 


public MailMessage(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {
    this.mailAddressFrom=mailAddressFrom ;
    this.mailAddressTo=mailAddressTo;
    this.mailSubject=mailSubject;
    this.mailBody=mailBody;
}

 public boolean isValidMessage() {
        return isValidEmailAddress(mailAddressFrom) && isValidEmailAddress(mailAddressTo) && isValidSubject(mailSubject) && isValidBody(mailBody);
    }

 public boolean isValidMailAddressxFrom(String mailAddressFrom){
        if(mailAddressFrom == null || mailAddressFrom.isEmpty() || !mailAddressFrom.contains("@") || !mailAddressFrom.contains(".")){
            return false;
            else{
            return true
                }
        }
     public boolean IsValidmailAddressTo(String mailAddressTo){
 if(mailAddressTo == null ||  mailAddressTo.isEmpty() ||  !mailAddressTo.contains("@") ||  !mailAddressTo.contains(".")){
            return false;
      else{
            return true
                }
        }

     public boolean isValidmailSubject(String mailSubject){
 if(mailSubject == null ||  mailSubject.isEmpty() ||  mailSubject.length() > 30){
            return false;
      else{
            return true
                }
        }
         public boolean isValidmailBody(String mailBody){
               if(mailBody == null || mailBody.isEmpty() ){
            return false;
                    else{
            return true
                }
        }
