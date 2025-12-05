/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmain;

/**
 *
 * @author Admin
 */
// TestMain.java - Format INPUT → OUTPUT → EXPECTED
public class TestMain {
    public static void main(String[] args) {
        System.out.println("========== ACCOUNT CLASS TEST ==========");
        System.out.println("Format: INPUT → OUTPUT → EXPECTED → RESULT\n");
        
        int passedTests = 0;
        int totalTests = 8;
        
        // ========== TEST 1: Constructor & getAccHolder() - Normal name ==========
        System.out.println("=== TEST 1: getAccHolder() - Normal name formatting ===");
        System.out.println("INPUT: new Account(\"john\", 1000.0, true)");
        System.out.println("LOGIC: \"john\" → first letter uppercase → \"John\"");
        
        Account a1 = new Account("john", 1000.0, true);
        String output1 = a1.getAccHolder();
        String expected1 = "John";
        
        System.out.println("OUTPUT:   \"" + output1 + "\"");
        System.out.println("EXPECTED: \"" + expected1 + "\"");
        
        if (expected1.equals(output1)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 2: getAccHolder() - All uppercase name ==========
        System.out.println("=== TEST 2: getAccHolder() - All uppercase name ===");
        System.out.println("INPUT: new Account(\"JANE DOE\", 2000.0, false)");
        System.out.println("LOGIC: \"JANE DOE\" → \"Jane doe\" (only first letter of first word uppercase)");
        
        Account a2 = new Account("JANE DOE", 2000.0, false);
        String output2 = a2.getAccHolder();
        String expected2 = "Jane doe";
        
        System.out.println("OUTPUT:   \"" + output2 + "\"");
        System.out.println("EXPECTED: \"" + expected2 + "\"");
        
        if (expected2.equals(output2)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 3: getAccHolder() - Mixed case name ==========
        System.out.println("=== TEST 3: getAccHolder() - Mixed case name ===");
        System.out.println("INPUT: new Account(\"aLiCe SmItH\", 1500.0, true)");
        System.out.println("LOGIC: \"aLiCe SmItH\" → \"Alice smith\"");
        
        Account a3 = new Account("aLiCe SmItH", 1500.0, true);
        String output3 = a3.getAccHolder();
        String expected3 = "Alice smith";
        
        System.out.println("OUTPUT:   \"" + output3 + "\"");
        System.out.println("EXPECTED: \"" + expected3 + "\"");
        
        if (expected3.equals(output3)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 4: getAccHolder() - Empty name ==========
        System.out.println("=== TEST 4: getAccHolder() - Empty name ===");
        System.out.println("INPUT: new Account(\"\", 500.0, false)");
        System.out.println("LOGIC: Empty string \"\" → return \"Unknown\"");
        
        Account a4 = new Account("", 500.0, false);
        String output4 = a4.getAccHolder();
        String expected4 = "Unknown";
        
        System.out.println("OUTPUT:   \"" + output4 + "\"");
        System.out.println("EXPECTED: \"" + expected4 + "\"");
        
        if (expected4.equals(output4)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 5: getAccHolder() - Single character name ==========
        System.out.println("=== TEST 5: getAccHolder() - Single character name ===");
        System.out.println("INPUT: new Account(\"a\", 100.0, true)");
        System.out.println("LOGIC: \"a\" → \"A\" (single char becomes uppercase)");
        
        Account a5 = new Account("a", 100.0, true);
        String output5 = a5.getAccHolder();
        String expected5 = "A";
        
        System.out.println("OUTPUT:   \"" + output5 + "\"");
        System.out.println("EXPECTED: \"" + expected5 + "\"");
        
        if (expected5.equals(output5)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 6: getFee() - Loyal customer ==========
        System.out.println("=== TEST 6: getFee() - Loyal customer ===");
        System.out.println("INPUT: new Account(\"Bob\", 1000.0, true)");
        System.out.println("LOGIC: isLoyal=true → fee = 0.0 (no fee)");
        
        Account a6 = new Account("Bob", 1000.0, true);
        double output6 = a6.getFee();
        double expected6 = 0.0;
        
        System.out.println("OUTPUT:   " + output6);
        System.out.println("EXPECTED: " + expected6);
        System.out.println("CALCULATION: loyal customer → fee = 0");
        
        if (Math.abs(expected6 - output6) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 7: getFee() - Non-loyal customer ==========
        System.out.println("=== TEST 7: getFee() - Non-loyal customer ===");
        System.out.println("INPUT: new Account(\"Charlie\", 1000.0, false)");
        System.out.println("LOGIC: isLoyal=false → fee = 5% of balance (1000 * 0.05 = 50.0)");
        
        Account a7 = new Account("Charlie", 1000.0, false);
        double output7 = a7.getFee();
        double expected7 = 1000.0 * 0.05; // 50.0
        
        System.out.println("OUTPUT:   " + output7);
        System.out.println("EXPECTED: " + expected7);
        System.out.println("CALCULATION: 1000.0 × 0.05 = 50.0");
        
        if (Math.abs(expected7 - output7) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 8: toString() Format - Non-loyal customer ==========
        System.out.println("=== TEST 8: toString() Format - Non-loyal customer ===");
        System.out.println("INPUT: new Account(\"david\", 1250.5, false)");
        System.out.println("LOGIC: 1) getAccHolder() → \"David\"");
        System.out.println("       2) balance → 1250.5 (display as-is, no formatting)");
        System.out.println("       3) Format: \"accHolder, balance\"");
        
        Account a8 = new Account("david", 1250.5, false);
        String output8 = a8.toString();
        String expected8 = "David, 1250.5";
        
        System.out.println("OUTPUT:   \"" + output8 + "\"");
        System.out.println("EXPECTED: \"" + expected8 + "\"");
        
        if (expected8.equals(output8)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED");
            System.out.println("HINT: Check: 1) Name formatting, 2) ', ' format, 3) Balance as-is (no .0 for .5)\n");
        }
        
        // ========== BONUS TEST: Edge Cases ==========
        System.out.println("=== BONUS TEST: Edge Cases ===");
        
        // Test with null name (should handle gracefully)
        try {
            System.out.println("\nNote: Should handle null accHolder gracefully");
            System.out.println("If accHolder is null, getAccHolder() should not crash");
        } catch (Exception e) {
            System.out.println("Error with null accHolder: " + e.getMessage());
        }
        
        // Test with balance 0
        System.out.println("\nINPUT: new Account(\"Test\", 0.0, false)");
        Account a9 = new Account("Test", 0.0, false);
        System.out.println("balance=0.0, isLoyal=false, getFee(): " + a9.getFee());
        System.out.println("Expected: 0.0 (5% of 0 is 0)");
        
        // Test with very small balance
        System.out.println("\nINPUT: new Account(\"Test\", 1.0, false)");
        Account a10 = new Account("Test", 1.0, false);
        System.out.println("balance=1.0, isLoyal=false, getFee(): " + a10.getFee());
        System.out.println("Expected: 0.05 (1.0 × 0.05 = 0.05)");
        
        // ========== FINAL SUMMARY ==========
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passedTests + "/" + totalTests);
        
        double score = (passedTests * 10.0) / totalTests;
        System.out.printf("Score: %.1f/10.0%n", score);
        
        System.out.println("=".repeat(50));
        
        if (passedTests == totalTests) {
            System.out.println("🎉 EXCELLENT! All tests passed!");
            System.out.println("Your Account class is perfectly implemented.");
        } else {
            System.out.println("⚠️  Some tests failed. Check the output above.");
            System.out.println("Failed tests: " + (totalTests - passedTests));
        }
        
        // ========== QUICK REFERENCE ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("QUICK REFERENCE - ALL TEST CASES:");
        System.out.println("=".repeat(60));
        
        String[][] testCases = {
            {"new Account(\"john\", 1000.0, true).getAccHolder()", "\"John\""},
            {"new Account(\"JANE DOE\", 2000.0, false).getAccHolder()", "\"Jane doe\""},
            {"new Account(\"aLiCe SmItH\", 1500.0, true).getAccHolder()", "\"Alice smith\""},
            {"new Account(\"\", 500.0, false).getAccHolder()", "\"Unknown\""},
            {"new Account(\"a\", 100.0, true).getAccHolder()", "\"A\""},
            {"new Account(\"Bob\", 1000.0, true).getFee()", "0.0"},
            {"new Account(\"Charlie\", 1000.0, false).getFee()", "50.0"},
            {"new Account(\"david\", 1250.5, false).toString()", "\"David, 1250.5\""}
        };
        
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test " + (i+1) + ":");
            System.out.println("  " + testCases[i][0]);
            System.out.println("  → Expected: " + testCases[i][1]);
            if (i < testCases.length - 1) System.out.println();
        }
        
        // ========== ADDITIONAL PRACTICE ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ADDITIONAL PRACTICE CASES:");
        System.out.println("=".repeat(60));
        
        System.out.println("1. new Account(\"JOHN\", 0.0, false).getFee()");
        System.out.println("   → Expected: 0.0 (5% of 0 = 0)");
        System.out.println();
        System.out.println("2. new Account(\"\", 1000.0, true).toString()");
        System.out.println("   → Expected: \"Unknown, 1000.0\"");
        System.out.println();
        System.out.println("3. new Account(\"b\", 200.0, false).getFee()");
        System.out.println("   → Expected: 10.0 (200 × 0.05 = 10)");
        System.out.println();
        System.out.println("4. new Account(\"mARY aNN\", 3000.0, true).getAccHolder()");
        System.out.println("   → Expected: \"Mary ann\"");
    }
}