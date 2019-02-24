package termproject;

import java.util.ArrayList;
import javax.swing.JFrame;

public class TermProject {
    public static ArrayList<admin> admins = new ArrayList<admin>();
    public static ArrayList<customer> customers = new ArrayList<customer>();
    
    public static ArrayList<books> books = new ArrayList<books>();
    public static ArrayList<music> music = new ArrayList<music>();
    public static ArrayList<dvds> dvds = new ArrayList<dvds>();
    
    public static JFrame MainFrame = new MainForm();
    public static JFrame LoginFrame;
    public static JFrame AdminFrame;
    public static JFrame CustomerFrame;
    
    public static char userType;
    public static admin admin;
    public static customer customer;

    public static void main(String[] args) { 
        books b1 = new books("392449901", "Korkma Kalbim","Ahmet Batman", 50, 9.00);
        books b2 = new books("392449902", "Küçük Prens","Antoine de Saint-Exupery", 0, 5.32);
        music m1 = new music("655323215", "Aşk İle", "Koray Avcı", 10, 16.99);
        music m2 = new music("655323216", "Aşk İçin Gelmişiz", "Mustafa Ceceli", 10, 16.49);
        dvds d1 = new dvds("123124128", "Self / Less", "Tarsem Singh", 15, 22.99);
        dvds d2 = new dvds("123124129", "Kara Bela", "Burak Aksak", 15, 16.49);
        admin a1 = new admin("sezer@yildirim.com", "123");
        customer c1 = new customer("ilke", "123", 10, "ilke@cetin.com", "321");
        customers.add(c1);
        admins.add(a1);
        books.add(b1); books.add(b2); music.add(m1); music.add(m2); dvds.add(d1); dvds.add(d2);
        MainFrame.setVisible(true);
    }
}
