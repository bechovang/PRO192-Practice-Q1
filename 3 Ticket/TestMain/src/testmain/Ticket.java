/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmain;

public class Ticket {
    // 1. KHAI BAO THUOC TINH (ATTRIBUTES)
    private String movieName;
    private String seatType;
    private double basePrice;
    
    // 2. CONSTRUCTORS
    // 2.1 Constructor mac dinh (khong tham so)
    public Ticket() {
        this.movieName = "";
        this.seatType = "";
        this.basePrice = 0.0;
    }
    
    // 2.2 Constructor co tham so
    public Ticket(String movieName, String seatType, double basePrice) {
        this.movieName = movieName;
        this.seatType = seatType;
        this.basePrice = basePrice;
    }
    
    // 3. PHUONG THUC getMovieName() - YEU CAU DAC BIET
    public String getMovieName() {
        // Xu ly chuoi: Cat bo 2 ky tu dau tien, phan con lai viet thuong
        
        // Buoc 1: Kiem tra neu movieName rong, null hoac ngan hon 3 ky tu
        if (movieName == null || movieName.length() <= 2) {
            return "";  // Tra ve chuoi rong
        }
        
        // Buoc 2: Cat bo 2 ky tu dau tien (substring bat dau tu vi tri 2)
        // Vi tri trong string: 0 1 2 3 4...
        // Vi du: "AVENGERS" -> substring(2) = "ENGERS"
        String remainingPart = movieName.substring(2);
        
        // Buoc 3: Chuyen phan con lai thanh chu thuong
        return remainingPart.toLowerCase();
        
        // CACH VIET GON (1 dong):
        // return (movieName == null || movieName.length() <= 2) ? "" : 
        //        movieName.substring(2).toLowerCase();
    }
    
    // 4. PHUONG THUC getFinalPrice() - Logic tinh gia ve
    public double getFinalPrice() {
        // Kiem tra neu seatType la "VIP" (CHU Y: phan biet hoa thuong)
        // Su dung equals() (khong phai equalsIgnoreCase) vi yeu cau case-sensitive
        
        if (seatType != null && seatType.equals("VIP")) {
            // Loai ghe VIP -> cong them 50 vao gia goc
            return basePrice + 50.0;
        } else {
            // Loai ghe khac (Normal hoac bat ky loai nao khac) -> giu nguyen gia
            return basePrice;
        }
        
        // CACH VIET GON (toan tu 3 ngoi):
        // return (seatType != null && seatType.equals("VIP")) ? basePrice + 50.0 : basePrice;
    }
    
    // 5. PHUONG THUC toString() - Dinh dang xuat
    public String toString() {
        // Dinh dang: "movieName, finalPrice"
        // Trong do:
        // - movieName: su dung getMovieName() (da dinh dang)
        // - finalPrice: su dung getFinalPrice() va dinh dang 1 so thap phan
        
        // Su dung String.format() de dinh dang
        // "%.1f" dinh dang so thap phan voi 1 chu so sau dau phay
        return String.format("%s, %.1f", getMovieName(), getFinalPrice());
    }
    
    // 6. CAC PHUONG THUC BO SUNG (khong bat buoc nhung huu ich)
    
    // Getter cho movieName goc (khong dinh dang)
    public String getOriginalMovieName() {
        return this.movieName;
    }
    
    // Getter cho seatType
    public String getSeatType() {
        return this.seatType;
    }
    
    // Getter cho basePrice
    public double getBasePrice() {
        return this.basePrice;
    }
    
    // Setter methods (neu can thay doi gia tri sau khi tao doi tuong)
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
    
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
   
}