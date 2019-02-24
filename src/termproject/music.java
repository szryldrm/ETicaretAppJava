package termproject;

public class music extends Products{
    private String Artist;

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public music(String BarcodeNumber, String Artist, String ProductName, int Quantity, double Price) {
        super(BarcodeNumber, ProductName, Quantity, Price);
        this.Artist = Artist;
    }
   
    
    @Override
    public String toString() {
        return "BARCODE = " + super.getBarcodeNumber() + " ARTIST = " + Artist + super.toString() +' ';
    }
}
