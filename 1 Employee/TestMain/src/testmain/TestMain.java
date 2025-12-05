package testmain;  // Thêm dòng này
// SimpleTest.java - Chỉ hiển thị INPUT và OUTPUT
public class TestMain {
    public static void main(String[] args) {
        System.out.println("===== QUICK TEST - Employee Class =====");
        
        // Test 1
        System.out.println("\n[Test 1 - getName()]");
        Employee e1 = new Employee(1, "John Doe", 1000.0, 180);
        System.out.println("Input:    new Employee(1, \"John Doe\", 1000.0, 180)");
        System.out.println("Output:   e1.getName() = \"" + e1.getName() + "\"");
        System.out.println("Expected: \"JOHN DOE\"");
        System.out.println("Result:   " + ("JOHN DOE".equals(e1.getName()) ? "✅" : "❌"));
        
        // Test 2
        System.out.println("\n[Test 2 - getSalary() - No Bonus]");
        Employee e2 = new Employee(2, "Alice Smith", 1500.0, 180);
        System.out.println("Input:    new Employee(2, \"Alice Smith\", 1500.0, 180)");
        System.out.println("Output:   e2.getSalary() = " + e2.getSalary());
        System.out.println("Expected: 1500.0");
        System.out.println("Result:   " + (Math.abs(1500.0 - e2.getSalary()) < 0.001 ? "✅" : "❌"));
        
        // Test 3
        System.out.println("\n[Test 3 - getSalary() - With Bonus]");
        Employee e3 = new Employee(3, "Bob Wilson", 1000.0, 200);
        System.out.println("Input:    new Employee(3, \"Bob Wilson\", 1000.0, 200)");
        System.out.println("Output:   e3.getSalary() = " + e3.getSalary());
        System.out.println("Expected: 1200.0 (1000 × 1.2)");
        System.out.println("Result:   " + (Math.abs(1200.0 - e3.getSalary()) < 0.001 ? "✅" : "❌"));
        
        // Test 4
        System.out.println("\n[Test 4 - toString()]");
        Employee e4 = new Employee(4, "Michael Brown", 1000.0, 210);
        System.out.println("Input:    new Employee(4, \"Michael Brown\", 1000.0, 210)");
        System.out.println("Output:   e4.toString() = \"" + e4.toString() + "\"");
        System.out.println("Expected: \"MICHAEL BROWN - 1200.00\"");
        System.out.println("Result:   " + ("MICHAEL BROWN - 1200.00".equals(e4.toString()) ? "✅" : "❌"));
        
        // Summary
        System.out.println("\n" + "=".repeat(40));
        System.out.println("QUICK CHECK:");
        System.out.println("1. Name uppercase? " + ("JOHN DOE".equals(e1.getName()) ? "✅" : "❌"));
        System.out.println("2. Salary calculation? " + (Math.abs(1200.0 - e3.getSalary()) < 0.001 ? "✅" : "❌"));
        System.out.println("3. toString format? " + ("MICHAEL BROWN - 1200.00".equals(e4.toString()) ? "✅" : "❌"));
    }
}