# ETicaretAppJava
Java E-Ticaret Uygulaması

E-Ticaret Uygulaması
Ana Classlar:
1- Product ve User adında birer adet abstract classlarımız bulunmaktadır.<br>
2- Product classımızda subclasslarımızın ortak attributeleri olan BarcodeName, ProductName, Quantity ve Price bulunmaktadır.<br> Ayrıca sub classlarımız için constractor ve toString methodları bulunmaktadır. Bu attributelerin get ve setleri tanımlanmıştır.<br>
3- Product classını extend eden Book, Dvd ve Music adında sub classlarımız bulunuyor. Bu classların extra attributeleri ile birlikte constractorları ve toStringleri bulunuyor.<br>
4- User classımızda subclasslarımızın ortak attributeleri olan Mail ve Password bulunmaktadır. Ayrıca sub classlarımız için constractor ve toString methodları bulunmaktadır.<br>
5- User classını extend eden admin ve customer adında sub classlarımız bulunuyor. Bu classların extra attributeleri ile birlikte constractorları ve toStringleri bulunuyor. Ayrıca bu attributelerin get ve setleri tanımlanmıştır.<br>
6- Test Kısmında ise örnek olarak birkaç tane testcaseler bulunmaktadır. Ayrıca ArrayListlerimiz ve JSwing için gerekli olan Form tanımlamaları burada bulunmaktadır.<br>
7- Tasarım olarak Javanın jSwing arayüzü kullanılmıştır. Bu arayüz içersinde jLabel, jButon, jList, jTable, jComboBox kullanılmıştır.<br>

Program Kullanımı  ; 
Login Menu : 
1-Admin Testcase Olarak 1 Adet Admin Bulunmaktadır. (Mail : sezer@yildirim.com Password : 123)
2-Customer Testcase Olarak 1 Adet Customer Bulunmaktadır.(Mail : ilke@cetin.com Password : 321)
3- Yeni Bir Customer Oluşturmak İçin Gerekli Alanlar Doldurulur ve Gift Voucher Kısmında Direkt Olarak Amount Girmek Yerine Hediye Çekleri Kodu Oluşturduk. Bu Hediye Çekleri Kodları
12412312 -> 10 TL
12412414 -> 50 TL
51231231 -> 100 TL
61212414 -> 500 TL
64523412 -> 1000 TL
Bu çeklerden birini girerek kayıt olabilirsiniz.

Admin Menu : 
1-For Product  
Product Search : Enter Barcode Number and Click Search Button.  
Add : Firstly, You Should Choose Product in The Combobox and Enter Barcode Number, Name, Quantity, Price and Author( for book ) / Director ( for dvd ) / Artist ( for cd ). Then You Must Click Add Button.  
Update : Firstly, You Must Use Product Search, You Should Do Necessary Regulation Without Barcode Number and Click Update Button.  
Delete : Firstly, You Must Use Product Search and Click Delete Button.   
For Admin  
Search : Enter User Mail and Clich Search Button  
Update : Firstly, You Must Use User Search, You Should Do Necessary Regulation Without User Mail and Click Update Button.  

Customer Menu : 
1- İlk olarak Please Choose Product ComboBox’ından Ürün Tipi Seçilir. Ürün tipi seçildikten sonra jTable’ımızda bu ürünler anlık olarak görüntülenir. Testcase olarak her kategori için 2’şer tane ürün girişi MainForm’da yapılmaktadır.
2- Kullanıcı Almak istediği ürünün barkod numarasını Enter Barcode Number Alanına girer ve Add to Cart Butonuna Basar.
3- Her eklediği üründe Total Amount Anlık Olarak Artar.
4- Alışverişi bitirmek istediği zaman eğer Yeterli amounta sahipse Customer Satın Almayı Başarı İle Tamamlar. Eğer Yeterli Değilse Sepetini Temizleyip Yeniden Amountu Yetecek Kadar Ürün Ekler.

Sezer YILDIRIM
sezer.yildirim@live.com
www.github.com/szryldrm
