package termproject;

public class dvds extends Products{
    private String Director;

    public dvds(String BarcodeNumber, String Name, String Director, int Quantity, double Price) {
        super(BarcodeNumber, Name, Quantity, Price);
        this.Director = Director;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "DVD " + "BARCODE = " + super.getBarcodeNumber() + " DIRECTOR = " + Director + super.toString() +' ';
    }
    
}
