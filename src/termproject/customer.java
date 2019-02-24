package termproject;

public class customer extends user{
    private String CustomerName;
    private String MobilePhone;
    private double Amount;

    public customer(String CustomerName, String MobilePhone, double Amount, String Mail, String Password) {
        super(Mail, Password);
        this.CustomerName = CustomerName;
        this.MobilePhone = MobilePhone;
        this.Amount = Amount;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
    
    
}
