/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmain;

// TestMain.java - Format INPUT → OUTPUT → EXPECTED
public class TestMain {
    public static void main(String[] args) {
        System.out.println("========== ROOM CLASS TEST ==========");
        System.out.println("Format: INPUT → OUTPUT → EXPECTED → RESULT\n");
        
        int passedTests = 0;
        int totalTests = 7;
        
        // ========== TEST 1: Constructor & getType() - Long type ==========
        System.out.println("=== TEST 1: getType() - First 3 chars uppercase ===");
        System.out.println("INPUT: new Room(101, \"Deluxe\", 60.0)");
        System.out.println("LOGIC: Take first 3 chars: \"Del\" → uppercase → \"DEL\"");
        
        Room r1 = new Room(101, "Deluxe", 60.0);
        String output1 = r1.getType();
        String expected1 = "DEL";
        
        System.out.println("OUTPUT:   \"" + output1 + "\"");
        System.out.println("EXPECTED: \"" + expected1 + "\"");
        
        if (expected1.equals(output1)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 2: getType() - Another example ==========
        System.out.println("=== TEST 2: getType() - Another room type ===");
        System.out.println("INPUT: new Room(102, \"Standard\", 45.0)");
        System.out.println("LOGIC: Take first 3 chars: \"Sta\" → uppercase → \"STA\"");
        
        Room r2 = new Room(102, "Standard", 45.0);
        String output2 = r2.getType();
        String expected2 = "STA";
        
        System.out.println("OUTPUT:   \"" + output2 + "\"");
        System.out.println("EXPECTED: \"" + expected2 + "\"");
        
        if (expected2.equals(output2)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 3: getType() - Short type (2 chars) ==========
        System.out.println("=== TEST 3: getType() - Short type (2 chars) ===");
        System.out.println("INPUT: new Room(103, \"VIP\", 55.0)");
        System.out.println("LOGIC: Type has only 2 chars → entire type uppercase → \"VIP\"");
        
        Room r3 = new Room(103, "VIP", 55.0);
        String output3 = r3.getType();
        String expected3 = "VIP";
        
        System.out.println("OUTPUT:   \"" + output3 + "\"");
        System.out.println("EXPECTED: \"" + expected3 + "\"");
        
        if (expected3.equals(output3)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 4: getType() - Very short type (1 char) ==========
        System.out.println("=== TEST 4: getType() - Very short type (1 char) ===");
        System.out.println("INPUT: new Room(104, \"A\", 40.0)");
        System.out.println("LOGIC: Type has only 1 char → entire type uppercase → \"A\"");
        
        Room r4 = new Room(104, "A", 40.0);
        String output4 = r4.getType();
        String expected4 = "A";
        
        System.out.println("OUTPUT:   \"" + output4 + "\"");
        System.out.println("EXPECTED: \"" + expected4 + "\"");
        
        if (expected4.equals(output4)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 5: getRentPrice() - Area > 50 ==========
        System.out.println("=== TEST 5: getRentPrice() - Area > 50 ===");
        System.out.println("INPUT: new Room(105, \"Suite\", 60.5)");
        System.out.println("LOGIC: area=60.5 (>50) → rent price = 200.0");
        
        Room r5 = new Room(105, "Suite", 60.5);
        double output5 = r5.getRentPrice();
        double expected5 = 200.0;
        
        System.out.println("OUTPUT:   " + output5);
        System.out.println("EXPECTED: " + expected5);
        System.out.println("CALCULATION: area > 50 → price = 200");
        
        if (Math.abs(expected5 - output5) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 6: getRentPrice() - Area <= 50 ==========
        System.out.println("=== TEST 6: getRentPrice() - Area <= 50 ===");
        System.out.println("INPUT: new Room(106, \"Basic\", 40.0)");
        System.out.println("LOGIC: area=40.0 (<=50) → rent price = 100.0");
        
        Room r6 = new Room(106, "Basic", 40.0);
        double output6 = r6.getRentPrice();
        double expected6 = 100.0;
        
        System.out.println("OUTPUT:   " + output6);
        System.out.println("EXPECTED: " + expected6);
        System.out.println("CALCULATION: area <= 50 → price = 100");
        
        if (Math.abs(expected6 - output6) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 7: toString() Format - Area > 50 ==========
        System.out.println("=== TEST 7: toString() Format - Area > 50 ===");
        System.out.println("INPUT: new Room(107, \"Family\", 65.0)");
        System.out.println("LOGIC: 1) getType() → first 3 chars \"Fam\" → \"FAM\"");
        System.out.println("       2) getRentPrice() → area=65 (>50) → 200");
        System.out.println("       3) Format: \"roomId - TYPE - rentPrice\" (whole number)");
        
        Room r7 = new Room(107, "Family", 65.0);
        String output7 = r7.toString();
        String expected7 = "107 - FAM - 200";
        
        System.out.println("OUTPUT:   \"" + output7 + "\"");
        System.out.println("EXPECTED: \"" + expected7 + "\"");
        
        if (expected7.equals(output7)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED");
            System.out.println("HINT: Check: 1) Format with spaces, 2) TYPE uppercase, 3) Whole number price\n");
        }
        
        // ========== BONUS TEST: Boundary & Edge Cases ==========
        System.out.println("=== BONUS TEST: Boundary & Edge Cases ===");
        
        // Test with area exactly 50 (boundary)
        System.out.println("\nINPUT: new Room(108, \"Test\", 50.0)");
        Room r8 = new Room(108, "Test", 50.0);
        System.out.println("area=50.0 (exactly 50), getRentPrice(): " + r8.getRentPrice());
        System.out.println("Expected: 100.0 (area <= 50 includes 50)");
        
        // Test with area just above 50
        System.out.println("\nINPUT: new Room(109, \"Test\", 50.1)");
        Room r9 = new Room(109, "Test", 50.1);
        System.out.println("area=50.1 (just above 50), getRentPrice(): " + r9.getRentPrice());
        System.out.println("Expected: 200.0 (area > 50)");
        
        // Test with empty type string
        System.out.println("\nINPUT: new Room(110, \"\", 30.0)");
        Room r10 = new Room(110, "", 30.0);
        System.out.println("Empty type, getType(): \"" + r10.getType() + "\"");
        System.out.println("Expected: \"\" (empty string)");
        
        // Test with null type
        try {
            System.out.println("\nNote: Should handle null type gracefully");
            System.out.println("If type is null, getType() should not crash");
        } catch (Exception e) {
            System.out.println("Error with null type: " + e.getMessage());
        }
        
        // ========== FINAL SUMMARY ==========
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passedTests + "/" + totalTests);
        
        double score = (passedTests * 10.0) / totalTests;
        System.out.printf("Score: %.1f/10.0%n", score);
        
        System.out.println("=".repeat(50));
        
        if (passedTests == totalTests) {
            System.out.println("🎉 EXCELLENT! All tests passed!");
            System.out.println("Your Room class is perfectly implemented.");
        } else {
            System.out.println("⚠️  Some tests failed. Check the output above.");
            System.out.println("Failed tests: " + (totalTests - passedTests));
        }
        
        // ========== QUICK REFERENCE ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("QUICK REFERENCE - ALL TEST CASES:");
        System.out.println("=".repeat(60));
        
        String[][] testCases = {
            {"new Room(101, \"Deluxe\", 60.0).getType()", "\"DEL\""},
            {"new Room(102, \"Standard\", 45.0).getType()", "\"STA\""},
            {"new Room(103, \"VIP\", 55.0).getType()", "\"VIP\""},
            {"new Room(104, \"A\", 40.0).getType()", "\"A\""},
            {"new Room(105, \"Suite\", 60.5).getRentPrice()", "200.0"},
            {"new Room(106, \"Basic\", 40.0).getRentPrice()", "100.0"},
            {"new Room(107, \"Family\", 65.0).toString()", "\"107 - FAM - 200\""}
        };
        
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test " + (i+1) + ":");
            System.out.println("  " + testCases[i][0]);
            System.out.println("  → Expected: " + testCases[i][1]);
            if (i < testCases.length - 1) System.out.println();
        }
        
        // ========== ADDITIONAL TEST CASES FOR PRACTICE ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ADDITIONAL PRACTICE CASES:");
        System.out.println("=".repeat(60));
        
        System.out.println("1. new Room(201, \"Executive\", 49.9).getRentPrice()");
        System.out.println("   → Expected: 100.0 (area <= 50)");
        System.out.println();
        System.out.println("2. new Room(202, \"Lo\", 55.0).getType()");
        System.out.println("   → Expected: \"LO\" (2 chars → whole type uppercase)");
        System.out.println();
        System.out.println("3. new Room(203, \"Presidential\", 100.0).getType()");
        System.out.println("   → Expected: \"PRE\" (first 3 chars)");
        System.out.println();
        System.out.println("4. new Room(204, \"Single\", 50.0).toString()");
        System.out.println("   → Expected: \"204 - SIN - 100\" (area = 50 → price 100)");
    }
}