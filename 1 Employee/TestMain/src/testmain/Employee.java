package testmain;  // Thêm dòng này

public class Employee {
    // 1. KHAI BÁO THUỘC TÍNH (ATTRIBUTES) - theo yêu cầu đề bài
    private int id;
    private String name;
    private double baseSalary;
    private int workHours;
    
    // 2. CONSTRUCTORS - theo yêu cầu đề bài
    // 2.1 Constructor mặc định (không tham số)
    public Employee() {
        // Khởi tạo giá trị mặc định
        this.id = 0;
        this.name = "";
        this.baseSalary = 0.0;
        this.workHours = 0;
    }
    
    // 2.2 Constructor có tham số (khởi tạo tất cả thuộc tính)
    public Employee(int id, String name, double baseSalary, int workHours) {
        this.id = id;                       // Gán id từ tham số
        this.name = name;                   // Gán name từ tham số
        this.baseSalary = baseSalary;       // Gán baseSalary từ tham số
        this.workHours = workHours;         // Gán workHours từ tham số
    }
    
    // 3. GETTER METHODS (có thể thêm nếu cần, nhưng đề bài chỉ yêu cầu 3 methods dưới)
    // Lưu ý: Đề không yêu cầu getter cho id, baseSalary, workHours
    // nhưng có thể thêm nếu muốn truy cập từ bên ngoài
    
    // 4. PHƯƠNG THỨC getName() - theo yêu cầu đề bài
    public String getName() {
        // Trả về tên ở dạng viết hoa toàn bộ (UPPERCASE)
        // Sử dụng phương thức toUpperCase() của class String
        return this.name.toUpperCase();
    }
    
    // 5. PHƯƠNG THỨC getSalary() - theo yêu cầu đề bài
    public double getSalary() {
        // Logic tính lương:
        // - Nếu workHours >= 200: lương = baseSalary * 1.2 (tăng 20%)
        // - Ngược lại: lương = baseSalary (không tăng)
        
        if (this.workHours >= 200) {
            // Có thưởng 20%
            return this.baseSalary * 1.2;
        } else {
            // Không có thưởng
            return this.baseSalary;
        }
        
        // Có thể viết ngắn gọn hơn bằng toán tử 3 ngôi:
        // return (this.workHours >= 200) ? this.baseSalary * 1.2 : this.baseSalary;
    }
    
    // 6. PHƯƠNG THỨC toString() - theo yêu cầu đề bài
    public String toString() {
        // Format: "NAME - salary"
        // Trong đó:
        // - NAME: tên viết hoa (gọi getName())
        // - salary: lương cuối cùng (gọi getSalary()) làm tròn 2 số thập phân
        
        // Cách 1: Sử dụng String.format() - khuyến nghị
        // "%.2f" định dạng số thập phân với 2 chữ số sau dấu phẩy
        return String.format("%s - %.2f", this.getName(), this.getSalary());
        
        // Cách 2: Sử dụng printf trong concatenation
        // return this.getName() + " - " + String.format("%.2f", this.getSalary());
    }
    
    // 7. CÁC PHƯƠNG THỨC BỔ SUNG (không bắt buộc nhưng hữu ích)
    // 7.1 Getter cho id
    public int getId() {
        return this.id;
    }
    
    // 7.2 Getter cho baseSalary
    public double getBaseSalary() {
        return this.baseSalary;
    }
    
    // 7.3 Getter cho workHours
    public int getWorkHours() {
        return this.workHours;
    }
    
    // 7.4 Setter methods (nếu cần thay đổi giá trị sau khi tạo đối tượng)
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}