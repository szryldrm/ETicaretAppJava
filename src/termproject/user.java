package termproject;

public abstract class user {
    private String Mail;
    private String Password;

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    

    public user(String Mail, String Password) {
        this.Mail = Mail;
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "user{" + "Mail=" + Mail + ", Password=" + Password + '}';
    }
    
    
}
