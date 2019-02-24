package termproject;

public class books extends Products{
    private String Author;

    public books(String BarcodeNumber, String ProductName, String Author, int Quantity, double Price) {
        super(BarcodeNumber, ProductName, Quantity, Price);
        this.Author = Author;
    }   


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "BOOKS " + "BARCODE = " + super.getBarcodeNumber() + " AUTHOR = " + Author + super.toString() +' ';
    }
    
    
}
