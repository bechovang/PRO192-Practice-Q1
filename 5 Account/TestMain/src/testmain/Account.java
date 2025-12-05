/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmain;

public class Account {
    // 1. KHAI BAO THUOC TINH (ATTRIBUTES)
    private String accHolder;
    private double balance;
    private boolean isLoyal;
    
    // 2. CONSTRUCTORS
    // 2.1 Constructor mac dinh (khong tham so)
    public Account() {
        this.accHolder = "";
        this.balance = 0.0;
        this.isLoyal = false;
    }
    
    // 2.2 Constructor co tham so
    public Account(String accHolder, double balance, boolean isLoyal) {
        this.accHolder = accHolder;
        this.balance = balance;
        this.isLoyal = isLoyal;
    }
    
    // 3. PHUONG THUC getAccHolder() - YEU CAU DAC BIET
    public String getAccHolder() {
        // Xu ly chuoi: 
        // - Neu accHolder rong ("") -> tra ve "Unknown"
        // - Neu co ten -> chu cai dau viet hoa, con lai viet thuong
        
        // Buoc 1: Kiem tra neu accHolder rong hoac null
        if (accHolder == null || accHolder.isEmpty()) {
            return "Unknown";  // Tra ve "Unknown" cho ten rong
        }
        
        // Buoc 2: Chuan hoa ten
        // 2.1: Lay ky tu dau tien va chuyen thanh chu hoa
        char firstChar = Character.toUpperCase(accHolder.charAt(0));
        
        // 2.2: Lay phan con lai cua ten va chuyen thanh chu thuong
        String restOfName = "";
        if (accHolder.length() > 1) {
            restOfName = accHolder.substring(1).toLowerCase();
        }
        
        // Buoc 3: Gop lai va tra ve
        return firstChar + restOfName;
        
        // CACH VIET GON (1 dong):
        // return (accHolder == null || accHolder.isEmpty()) ? "Unknown" : 
        //        Character.toUpperCase(accHolder.charAt(0)) + 
        //        (accHolder.length() > 1 ? accHolder.substring(1).toLowerCase() : "");
    }
    
    // 4. PHUONG THUC getFee() - Logic tinh phi
    public double getFee() {
        // Logic tinh phi dua tren trang thai loyal:
        // - isLoyal = true -> phi = 0
        // - isLoyal = false -> phi = 5% cua balance
        
        if (isLoyal) {
            return 0.0;
        } else {
            // Tinh 5% cua balance (balance * 0.05)
            return balance * 0.05;
        }
        
        // CACH VIET GON (toan tu 3 ngoi):
        // return isLoyal ? 0.0 : balance * 0.05;
    }
    
    // 5. PHUONG THUC toString() - Dinh dang xuat
    public String toString() {
        // Dinh dang: "accHolder, balance"
        // Trong do:
        // - accHolder: su dung getAccHolder() (da dinh dang)
        // - balance: hien thi nguyen ban (khong format)
        
        // CHU Y: Balance hien thi nguyen ban, khong format
        // Vi du: 1250.5 -> "1250.5" (khong phai "1250.50")
        
        // Cach 1: Su dung String.valueOf() hoac cong chuoi
        return getAccHolder() + ", " + balance;
        
        // Cach 2: Su dung String.format() nhung khong dinh dang so
        // return String.format("%s, %s", getAccHolder(), balance);
    }
    
    // 6. CAC PHUONG THUC BO SUNG (khong bat buoc nhung huu ich)
    
    // Getter cho accHolder goc (khong dinh dang)
    public String getOriginalAccHolder() {
        return this.accHolder;
    }
    
    // Getter cho balance
    public double getBalance() {
        return this.balance;
    }
    
    // Getter cho isLoyal
    public boolean isLoyal() {
        return this.isLoyal;
    }
    
    // Setter methods (neu can thay doi gia tri sau khi tao doi tuong)
    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setLoyal(boolean isLoyal) {
        this.isLoyal = isLoyal;
    }
    
    // PHUONG THUC DEMO de test nhanh
    public static void main(String[] args) {
        System.out.println("=== DEMO TEST ACCOUNT CLASS ===\n");
        
        // Test 1: Khach hang loyal
        Account acc1 = new Account("john", 1000.0, true);
        System.out.println("Account 1 (Loyal customer):");
        System.out.println("  Original name: \"" + acc1.getOriginalAccHolder() + "\"");
        System.out.println("  Formatted name: \"" + acc1.getAccHolder() + "\"");
        System.out.println("  Balance: " + acc1.getBalance());
        System.out.println("  Is loyal: " + acc1.isLoyal());
        System.out.println("  Fee: " + acc1.getFee());
        System.out.println("  toString(): " + acc1.toString());
        System.out.println();
        
        // Test 2: Khach hang khong loyal
        Account acc2 = new Account("JANE DOE", 2000.0, false);
        System.out.println("Account 2 (Non-loyal customer):");
        System.out.println("  Formatted name: \"" + acc2.getAccHolder() + "\"");
        System.out.println("  Fee: " + acc2.getFee() + " (5% of 2000 = " + (2000.0 * 0.05) + ")");
        System.out.println("  toString(): " + acc2.toString());
        System.out.println();
        
        // Test 3: Ten rong
        Account acc3 = new Account("", 500.0, false);
        System.out.println("Account 3 (Empty name):");
        System.out.println("  Formatted name: \"" + acc3.getAccHolder() + "\"");
        System.out.println("  toString(): " + acc3.toString());
        System.out.println();
        
        // Test 4: Ten viet hoa toan bo
        Account acc4 = new Account("BOB SMITH", 1500.0, true);
        System.out.println("Account 4 (All uppercase):");
        System.out.println("  Formatted name: \"" + acc4.getAccHolder() + "\"");
        System.out.println("  toString(): " + acc4.toString());
        System.out.println();
        
        // Test 5: Balance co so thap phan
        Account acc5 = new Account("david", 1250.5, false);
        System.out.println("Account 5 (Decimal balance):");
        System.out.println("  Formatted name: \"" + acc5.getAccHolder() + "\"");
        System.out.println("  Fee: " + acc5.getFee() + " (5% of 1250.5 = " + (1250.5 * 0.05) + ")");
        System.out.println("  toString(): " + acc5.toString());
        System.out.println("  Note: Balance should show as 1250.5 (not 1250.50)");
        System.out.println();
        
        // Test 6: Ten chi co 1 ky tu
        Account acc6 = new Account("a", 100.0, false);
        System.out.println("Account 6 (Single char name):");
        System.out.println("  Formatted name: \"" + acc6.getAccHolder() + "\"");
        System.out.println("  Fee: " + acc6.getFee());
        System.out.println("  toString(): " + acc6.toString());
    }
}