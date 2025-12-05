/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmain;

// TestMain.java - Format INPUT → OUTPUT → EXPECTED
public class TestMain {
    public static void main(String[] args) {
        System.out.println("========== BOOK CLASS TEST ==========");
        System.out.println("Format: INPUT → OUTPUT → EXPECTED → RESULT\n");
        
        int passedTests = 0;
        int totalTests = 6;
        
        // ========== TEST 1: Constructor & getTitle() ==========
        System.out.println("=== TEST 1: getTitle() - Lowercase first, uppercase rest ===");
        System.out.println("INPUT: new Book(\"Java\", 100.0, \"IT\")");
        
        Book b1 = new Book("Java", 100.0, "IT");
        String output1 = b1.getTitle();
        String expected1 = "jAVA";
        
        System.out.println("OUTPUT:   \"" + output1 + "\"");
        System.out.println("EXPECTED: \"" + expected1 + "\"");
        System.out.println("LOGIC: First char lowercase + rest uppercase");
        
        if (expected1.equals(output1)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 2: getTitle() with longer title ==========
        System.out.println("=== TEST 2: getTitle() - Longer title ===");
        System.out.println("INPUT: new Book(\"Programming\", 200.0, \"CS\")");
        
        Book b2 = new Book("Programming", 200.0, "CS");
        String output2 = b2.getTitle();
        String expected2 = "pROGRAMMING";
        
        System.out.println("OUTPUT:   \"" + output2 + "\"");
        System.out.println("EXPECTED: \"" + expected2 + "\"");
        
        if (expected2.equals(output2)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 3: getSalePrice() - IT category (lowercase) ==========
        System.out.println("=== TEST 3: getSalePrice() - IT category (lowercase) ===");
        System.out.println("INPUT: new Book(\"C++\", 100.0, \"it\")");
        System.out.println("LOGIC: category=\"it\" (case-insensitive) → 15% discount (×0.85)");
        
        Book b3 = new Book("C++", 100.0, "it");
        double output3 = b3.getSalePrice();
        double expected3 = 100.0 * 0.85; // 85.0
        
        System.out.println("OUTPUT:   " + output3);
        System.out.println("EXPECTED: " + expected3);
        System.out.println("CALCULATION: 100.0 × 0.85 = 85.0");
        
        if (Math.abs(expected3 - output3) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 4: getSalePrice() - IT category (uppercase) ==========
        System.out.println("=== TEST 4: getSalePrice() - IT category (uppercase) ===");
        System.out.println("INPUT: new Book(\"Python\", 200.0, \"IT\")");
        System.out.println("LOGIC: category=\"IT\" → 15% discount (×0.85)");
        
        Book b4 = new Book("Python", 200.0, "IT");
        double output4 = b4.getSalePrice();
        double expected4 = 200.0 * 0.85; // 170.0
        
        System.out.println("OUTPUT:   " + output4);
        System.out.println("EXPECTED: " + expected4);
        System.out.println("CALCULATION: 200.0 × 0.85 = 170.0");
        
        if (Math.abs(expected4 - output4) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 5: getSalePrice() - Non-IT category ==========
        System.out.println("=== TEST 5: getSalePrice() - Non-IT category ===");
        System.out.println("INPUT: new Book(\"Math\", 150.0, \"Science\")");
        System.out.println("LOGIC: category=\"Science\" (not IT) → NO discount");
        
        Book b5 = new Book("Math", 150.0, "Science");
        double output5 = b5.getSalePrice();
        double expected5 = 150.0;
        
        System.out.println("OUTPUT:   " + output5);
        System.out.println("EXPECTED: " + expected5);
        System.out.println("CALCULATION: 150.0 (no discount)");
        
        if (Math.abs(expected5 - output5) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 6: toString() Format ==========
        System.out.println("=== TEST 6: toString() Format ===");
        System.out.println("INPUT: new Book(\"OOP\", 100.0, \"IT\")");
        System.out.println("LOGIC: 1) getTitle() → \"oOP\"");
        System.out.println("       2) getSalePrice() → 100×0.85=85.00");
        System.out.println("       3) Format: \"TITLE, salePrice\" with 2 decimal places");
        
        Book b6 = new Book("OOP", 100.0, "IT");
        String output6 = b6.toString();
        String expected6 = "oOP, 85.00";
        
        System.out.println("OUTPUT:   \"" + output6 + "\"");
        System.out.println("EXPECTED: \"" + expected6 + "\"");
        
        if (expected6.equals(output6)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED");
            System.out.println("HINT: Check: 1) Title format, 2) ', ' format, 3) 2 decimal places\n");
        }
        
        // ========== BONUS TEST: Edge Cases ==========
        System.out.println("=== BONUS TEST: Edge Cases ===");
        
        // Test with empty title
        try {
            System.out.println("INPUT: new Book(\"\", 50.0, \"IT\")");
            Book b7 = new Book("", 50.0, "IT");
            System.out.println("getTitle() on empty string: \"" + b7.getTitle() + "\"");
            System.out.println("Note: Should handle empty string gracefully");
        } catch (Exception e) {
            System.out.println("Error with empty title: " + e.getMessage());
        }
        
        // Test with mixed case IT
        System.out.println("\nINPUT: new Book(\"Test\", 100.0, \"It\")");
        Book b8 = new Book("Test", 100.0, "It");
        System.out.println("Category=\"It\" (mixed case), Sale Price: " + b8.getSalePrice());
        System.out.println("Expected: 85.0 (should be case-insensitive)");
        
        // ========== FINAL SUMMARY ==========
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passedTests + "/" + totalTests);
        
        double score = (passedTests * 10.0) / totalTests;
        System.out.printf("Score: %.1f/10.0%n", score);
        
        System.out.println("=".repeat(50));
        
        if (passedTests == totalTests) {
            System.out.println("🎉 EXCELLENT! All tests passed!");
            System.out.println("Your Book class is perfectly implemented.");
        } else {
            System.out.println("⚠️  Some tests failed. Check the output above.");
            System.out.println("Failed tests: " + (totalTests - passedTests));
        }
        
        // ========== QUICK REFERENCE ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("QUICK REFERENCE - ALL TEST CASES:");
        System.out.println("=".repeat(60));
        
        String[][] testCases = {
            {"new Book(\"Java\", 100.0, \"IT\").getTitle()", "\"jAVA\""},
            {"new Book(\"Programming\", 200.0, \"CS\").getTitle()", "\"pROGRAMMING\""},
            {"new Book(\"C++\", 100.0, \"it\").getSalePrice()", "85.0"},
            {"new Book(\"Python\", 200.0, \"IT\").getSalePrice()", "170.0"},
            {"new Book(\"Math\", 150.0, \"Science\").getSalePrice()", "150.0"},
            {"new Book(\"OOP\", 100.0, \"IT\").toString()", "\"oOP, 85.00\""}
        };
        
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test " + (i+1) + ":");
            System.out.println("  " + testCases[i][0]);
            System.out.println("  → Expected: " + testCases[i][1]);
            if (i < testCases.length - 1) System.out.println();
        }
    }
}