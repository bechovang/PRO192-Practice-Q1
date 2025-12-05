/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmain;

/**
 *
 * @author Admin
 */
public class Room {
    // 1. KHAI BAO THUOC TINH (ATTRIBUTES)
    private int roomId;
    private String type;
    private double area;
    
    // 2. CONSTRUCTORS
    // 2.1 Constructor mac dinh (khong tham so)
    public Room() {
        this.roomId = 0;
        this.type = "";
        this.area = 0.0;
    }
    
    // 2.2 Constructor co tham so
    public Room(int roomId, String type, double area) {
        this.roomId = roomId;
        this.type = type;
        this.area = area;
    }
    
    // 3. PHUONG THUC getType() - YEU CAU DAC BIET
    public String getType() {
        // Xu ly chuoi: Lay 3 ky tu dau tien va viet hoa
        // Neu type ngan hon 3 ky tu, tra ve toan bo type viet hoa
        
        // Buoc 1: Kiem tra neu type rong hoac null
        if (type == null || type.isEmpty()) {
            return "";  // Tra ve chuoi rong
        }
        
        // Buoc 2: Kiem tra do dai cua type
        if (type.length() >= 3) {
            // Type co >= 3 ky tu: lay 3 ky tu dau tien
            String firstThreeChars = type.substring(0, 3);
            return firstThreeChars.toUpperCase();
        } else {
            // Type co < 3 ky tu: lay toan bo type
            return type.toUpperCase();
        }
        
        // CACH VIET GON (1 dong):
        // return (type == null || type.isEmpty()) ? "" : 
        //        (type.length() >= 3 ? type.substring(0, 3).toUpperCase() : type.toUpperCase());
    }
    
    // 4. PHUONG THUC getRentPrice() - Logic tinh gia thue
    public double getRentPrice() {
        // Logic tinh gia dua tren dien tich:
        // - area > 50: gia 200
        // - area <= 50: gia 100
        
        // Su dung toan tu so sanh > va <=
        if (area > 50.0) {
            return 200.0;
        } else {
            // Bao gom ca truong hop area = 50.0
            return 100.0;
        }
        
        // CACH VIET GON (toan tu 3 ngoi):
        // return area > 50.0 ? 200.0 : 100.0;
    }
    
    // 5. PHUONG THUC toString() - Dinh dang xuat
    public String toString() {
        // Dinh dang: "roomId - TYPE - rentPrice"
        // Trong do:
        // - TYPE: su dung getType() (da dinh dang)
        // - rentPrice: su dung getRentPrice() va hien thi so nguyen
        
        // CHU Y: rentPrice la so nguyen (200, 100) khong co so thap phan
        // Su dung String.format() voi %d (integer)
        // getRentPrice() tra ve double, can ep kieu ve int
        return String.format("%d - %s - %.0f", roomId, getType(), getRentPrice());
        
        // HOAC co the ep kieu ro rang:
        // int price = (int) getRentPrice();
        // return roomId + " - " + getType() + " - " + price;
    }
    
    // 6. CAC PHUONG THUC BO SUNG (khong bat buoc nhung huu ich)
    
    // Getter cho roomId
    public int getRoomId() {
        return this.roomId;
    }
    
    // Getter cho type goc (khong dinh dang)
    public String getOriginalType() {
        return this.type;
    }
    
    // Getter cho area
    public double getArea() {
        return this.area;
    }
    
    // Setter methods (neu can thay doi gia tri sau khi tao doi tuong)
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    // PHUONG THUC DEMO de test nhanh
    public static void main(String[] args) {
        System.out.println("=== DEMO TEST ROOM CLASS ===\n");
        
        // Test 1: Phong co dien tich lon (>50)
        Room room1 = new Room(101, "Deluxe", 60.0);
        System.out.println("Room 1 (area > 50):");
        System.out.println("  Room ID: " + room1.getRoomId());
        System.out.println("  Original type: " + room1.getOriginalType());
        System.out.println("  Formatted type: " + room1.getType());
        System.out.println("  Area: " + room1.getArea());
        System.out.println("  Rent price: " + room1.getRentPrice());
        System.out.println("  toString(): " + room1.toString());
        System.out.println();
        
        // Test 2: Phong co dien tich nho (<=50)
        Room room2 = new Room(102, "Standard", 45.0);
        System.out.println("Room 2 (area <= 50):");
        System.out.println("  Formatted type: " + room2.getType());
        System.out.println("  Rent price: " + room2.getRentPrice());
        System.out.println("  toString(): " + room2.toString());
        System.out.println();
        
        // Test 3: Type ngan (2 ky tu)
        Room room3 = new Room(103, "VIP", 55.0);
        System.out.println("Room 3 (short type 2 chars):");
        System.out.println("  Original type: \"" + room3.getOriginalType() + "\"");
        System.out.println("  Formatted type: \"" + room3.getType() + "\"");
        System.out.println("  toString(): " + room3.toString());
        System.out.println();
        
        // Test 4: Type rat ngan (1 ky tu)
        Room room4 = new Room(104, "A", 40.0);
        System.out.println("Room 4 (very short type 1 char):");
        System.out.println("  Formatted type: \"" + room4.getType() + "\"");
        System.out.println("  toString(): \"" + room4.toString() + "\"");
        System.out.println();
        
        // Test 5: Dien tich chinh xac 50 (boundary)
        Room room5 = new Room(105, "Family", 50.0);
        System.out.println("Room 5 (area = 50 exactly):");
        System.out.println("  Rent price: " + room5.getRentPrice());
        System.out.println("  toString(): " + room5.toString());
        System.out.println("  Note: area = 50 → price should be 100 (<=50)");
        System.out.println();
        
        // Test 6: Type dai (nhieu hon 3 ky tu)
        Room room6 = new Room(106, "Presidential", 80.0);
        System.out.println("Room 6 (long type > 3 chars):");
        System.out.println("  Formatted type: " + room6.getType());
        System.out.println("  toString(): " + room6.toString());
    }
}