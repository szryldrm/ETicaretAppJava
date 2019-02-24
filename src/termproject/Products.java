
package termproject;

public abstract class Products {
    private String BarcodeNumber;
    private String ProductName;
    private int Quantity;
    private double Price;

    public Products(String BarcodeNumber, String Name, int Quantity, double Price) {
        this.BarcodeNumber = BarcodeNumber;
        this.ProductName = Name;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public String getBarcodeNumber() {
        return BarcodeNumber;
    }

    public void setBarcodeNumber(String BarcodeNumber) {
        this.BarcodeNumber = BarcodeNumber;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return " PRODUCT NAME = " + ProductName + " QUANTITY = " + Quantity + " WITHOUT TAX PRICE = " + Price + ' ';
    }
}
