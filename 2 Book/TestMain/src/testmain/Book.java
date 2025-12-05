/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmain;

public class Book {
    // 1. KHAI BAO THUOC TINH (ATTRIBUTES)
    private String title;
    private double price;
    private String category;
    
    // 2. CONSTRUCTORS
    // 2.1 Constructor mac dinh (khong tham so)
    public Book() {
        this.title = "";
        this.price = 0.0;
        this.category = "";
    }
    
    // 2.2 Constructor co tham so
    public Book(String title, double price, String category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }
    
    // 3. PHUONG THUC getTitle() - YEU CAU DAC BIET
    public String getTitle() {
        // Xu ly chuoi: ky tu dau viet thuong, cac ky tu con lai viet hoa
        
        // Buoc 1: Kiem tra neu title rong hoac null
        if (title == null || title.isEmpty()) {
            return "";  // Tra ve chuoi rong
        }
        
        // Buoc 2: Lay ky tu dau tien va chuyen thanh chu thuong
        char firstChar = Character.toLowerCase(title.charAt(0));
        
        // Buoc 3: Lay phan con lai cua chuoi va chuyen thanh chu hoa
        String restOfString = "";
        if (title.length() > 1) {
            restOfString = title.substring(1).toUpperCase();
        }
        
        // Buoc 4: Gop lai va tra ve
        return firstChar + restOfString;
        
        // CACH VIET GON (1 dong):
        // return (title == null || title.isEmpty()) ? "" : 
        //        Character.toLowerCase(title.charAt(0)) + 
        //        (title.length() > 1 ? title.substring(1).toUpperCase() : "");
    }
    
    // 4. PHUONG THUC getSalePrice() - Logic giam gia
    public double getSalePrice() {
        // Kiem tra category co phai la "IT" khong (khong phan biet hoa thuong)
        // Su dung equalsIgnoreCase() de so sanh khong phan biet chu hoa/chu thuong
        
        if (category != null && category.equalsIgnoreCase("IT")) {
            // Category la "IT" (it, IT, It, iT) -> giam 15% (nhan voi 0.85)
            return price * 0.85;
        } else {
            // Category khong phai "IT" -> giu nguyen gia
            return price;
        }
        
        // CACH VIET GON (toan tu 3 ngoi):
        // return (category != null && category.equalsIgnoreCase("IT")) ? price * 0.85 : price;
    }
    
    // 5. PHUONG THUC toString() - Dinh dang xuat
    public String toString() {
        // Dinh dang: "TITLE, salePrice"
        // Trong do:
        // - TITLE: su dung getTitle() (da dinh dang)
        // - salePrice: su dung getSalePrice() va dinh dang 2 so thap phan
        
        // Su dung String.format() de dinh dang
        // "%.2f" dinh dang so thap phan voi 2 chu so sau dau phay
        return String.format("%s, %.2f", getTitle(), getSalePrice());
    }
    
    // 6. CAC PHUONG THUC BO SUNG (khong bat buoc nhung huu ich)
    
    // Getter cho title goc (khong dinh dang)
    public String getOriginalTitle() {
        return this.title;
    }
    
    // Getter cho price goc
    public double getPrice() {
        return this.price;
    }
    
    // Getter cho category
    public String getCategory() {
        return this.category;
    }
    
    // Setter methods (neu can thay doi gia tri sau khi tao doi tuong)
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    // PHUONG THUC DEMO de test nhanh
    public static void main(String[] args) {
        System.out.println("=== DEMO TEST BOOK CLASS ===\n");
        
        // Test 1: Book voi category IT
        Book book1 = new Book("Java", 100.0, "IT");
        System.out.println("Book 1:");
        System.out.println("  Original title: " + book1.getOriginalTitle());
        System.out.println("  Formatted title: " + book1.getTitle());
        System.out.println("  Category: " + book1.getCategory());
        System.out.println("  Sale price: " + book1.getSalePrice());
        System.out.println("  toString(): " + book1.toString());
        System.out.println();
        
        // Test 2: Book voi category khong phai IT
        Book book2 = new Book("Math", 150.0, "Science");
        System.out.println("Book 2:");
        System.out.println("  Original title: " + book2.getOriginalTitle());
        System.out.println("  Formatted title: " + book2.getTitle());
        System.out.println("  Category: " + book2.getCategory());
        System.out.println("  Sale price: " + book2.getSalePrice());
        System.out.println("  toString(): " + book2.toString());
        System.out.println();
        
        // Test 3: Category "it" (chu thuong)
        Book book3 = new Book("Python", 200.0, "it");
        System.out.println("Book 3 (category lowercase):");
        System.out.println("  toString(): " + book3.toString());
        System.out.println("  Note: Should apply discount for 'it'");
        System.out.println();
        
        // Test 4: Title ngan (1 ky tu)
        Book book4 = new Book("A", 50.0, "IT");
        System.out.println("Book 4 (single char title):");
        System.out.println("  getTitle(): " + book4.getTitle());
        System.out.println("  toString(): " + book4.toString());
    }
}