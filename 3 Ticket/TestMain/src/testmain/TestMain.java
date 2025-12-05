/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmain;

// TestMain.java - Format INPUT → OUTPUT → EXPECTED
public class TestMain {
    public static void main(String[] args) {
        System.out.println("========== TICKET CLASS TEST ==========");
        System.out.println("Format: INPUT → OUTPUT → EXPECTED → RESULT\n");
        
        int passedTests = 0;
        int totalTests = 7;
        
        // ========== TEST 1: Constructor & getMovieName() - Long name ==========
        System.out.println("=== TEST 1: getMovieName() - Remove first 2 chars, lowercase ===");
        System.out.println("INPUT: new Ticket(\"AVENGERS\", \"Normal\", 100.0)");
        System.out.println("LOGIC: Remove first 2 chars: \"AVENGERS\" → \"ENGERS\" → lowercase → \"engers\"");
        
        Ticket t1 = new Ticket("AVENGERS", "Normal", 100.0);
        String output1 = t1.getMovieName();
        String expected1 = "engers";
        
        System.out.println("OUTPUT:   \"" + output1 + "\"");
        System.out.println("EXPECTED: \"" + expected1 + "\"");
        
        if (expected1.equals(output1)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 2: getMovieName() - Another example ==========
        System.out.println("=== TEST 2: getMovieName() - Another movie ===");
        System.out.println("INPUT: new Ticket(\"SPIDERMAN\", \"VIP\", 200.0)");
        System.out.println("LOGIC: Remove first 2 chars: \"SPIDERMAN\" → \"IDERMAN\" → lowercase → \"iderman\"");
        
        Ticket t2 = new Ticket("SPIDERMAN", "VIP", 200.0);
        String output2 = t2.getMovieName();
        String expected2 = "iderman";
        
        System.out.println("OUTPUT:   \"" + output2 + "\"");
        System.out.println("EXPECTED: \"" + expected2 + "\"");
        
        if (expected2.equals(output2)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 3: getMovieName() - Short name (<=2 chars) ==========
        System.out.println("=== TEST 3: getMovieName() - Short name (2 chars) ===");
        System.out.println("INPUT: new Ticket(\"IT\", \"Normal\", 50.0)");
        System.out.println("LOGIC: Name has 2 chars → remove first 2 chars → empty string \"\"");
        
        Ticket t3 = new Ticket("IT", "Normal", 50.0);
        String output3 = t3.getMovieName();
        String expected3 = "";
        
        System.out.println("OUTPUT:   \"" + output3 + "\"");
        System.out.println("EXPECTED: \"" + expected3 + "\"");
        
        if (expected3.equals(output3)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 4: getMovieName() - Very short name (1 char) ==========
        System.out.println("=== TEST 4: getMovieName() - Very short name (1 char) ===");
        System.out.println("INPUT: new Ticket(\"A\", \"VIP\", 100.0)");
        System.out.println("LOGIC: Name has 1 char → remove first 2 chars → empty string \"\"");
        
        Ticket t4 = new Ticket("A", "VIP", 100.0);
        String output4 = t4.getMovieName();
        String expected4 = "";
        
        System.out.println("OUTPUT:   \"" + output4 + "\"");
        System.out.println("EXPECTED: \"" + expected4 + "\"");
        
        if (expected4.equals(output4)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 5: getFinalPrice() - Normal seat ==========
        System.out.println("=== TEST 5: getFinalPrice() - Normal seat ===");
        System.out.println("INPUT: new Ticket(\"TITANIC\", \"Normal\", 100.0)");
        System.out.println("LOGIC: seatType=\"Normal\" (not VIP) → price unchanged");
        
        Ticket t5 = new Ticket("TITANIC", "Normal", 100.0);
        double output5 = t5.getFinalPrice();
        double expected5 = 100.0;
        
        System.out.println("OUTPUT:   " + output5);
        System.out.println("EXPECTED: " + expected5);
        System.out.println("CALCULATION: 100.0 (no VIP addition)");
        
        if (Math.abs(expected5 - output5) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 6: getFinalPrice() - VIP seat ==========
        System.out.println("=== TEST 6: getFinalPrice() - VIP seat ===");
        System.out.println("INPUT: new Ticket(\"AVATAR\", \"VIP\", 150.0)");
        System.out.println("LOGIC: seatType=\"VIP\" → add 50 to base price");
        
        Ticket t6 = new Ticket("AVATAR", "VIP", 150.0);
        double output6 = t6.getFinalPrice();
        double expected6 = 200.0; // 150 + 50
        
        System.out.println("OUTPUT:   " + output6);
        System.out.println("EXPECTED: " + expected6);
        System.out.println("CALCULATION: 150.0 + 50 = 200.0");
        
        if (Math.abs(expected6 - output6) < 0.001) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED\n");
        }
        
        // ========== TEST 7: toString() Format - VIP seat ==========
        System.out.println("=== TEST 7: toString() Format - VIP seat ===");
        System.out.println("INPUT: new Ticket(\"AVENGERS\", \"VIP\", 100.0)");
        System.out.println("LOGIC: 1) getMovieName() → \"engers\"");
        System.out.println("       2) getFinalPrice() → 100+50=150.0");
        System.out.println("       3) Format: \"movieName, finalPrice\" with 1 decimal place");
        
        Ticket t7 = new Ticket("AVENGERS", "VIP", 100.0);
        String output7 = t7.toString();
        String expected7 = "engers, 150.0";
        
        System.out.println("OUTPUT:   \"" + output7 + "\"");
        System.out.println("EXPECTED: \"" + expected7 + "\"");
        
        if (expected7.equals(output7)) {
            System.out.println("RESULT: ✅ PASSED\n");
            passedTests++;
        } else {
            System.out.println("RESULT: ❌ FAILED");
            System.out.println("HINT: Check: 1) Movie name format, 2) ', ' format, 3) 1 decimal place\n");
        }
        
        // ========== BONUS TEST: Case sensitivity & Edge Cases ==========
        System.out.println("=== BONUS TEST: Case sensitivity & Edge Cases ===");
        
        // Test with "vip" lowercase (should NOT add 50)
        System.out.println("\nINPUT: new Ticket(\"TEST\", \"vip\", 100.0)");
        Ticket t8 = new Ticket("TEST", "vip", 100.0);
        System.out.println("seatType=\"vip\" (lowercase), getFinalPrice(): " + t8.getFinalPrice());
        System.out.println("Expected: 100.0 (case-sensitive, only \"VIP\" adds 50)");
        
        // Test with empty movie name
        System.out.println("\nINPUT: new Ticket(\"\", \"Normal\", 50.0)");
        Ticket t9 = new Ticket("", "Normal", 50.0);
        System.out.println("Empty movie name, getMovieName(): \"" + t9.getMovieName() + "\"");
        System.out.println("Expected: \"\" (empty string)");
        
        // ========== FINAL SUMMARY ==========
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passedTests + "/" + totalTests);
        
        double score = (passedTests * 10.0) / totalTests;
        System.out.printf("Score: %.1f/10.0%n", score);
        
        System.out.println("=".repeat(50));
        
        if (passedTests == totalTests) {
            System.out.println("🎉 EXCELLENT! All tests passed!");
            System.out.println("Your Ticket class is perfectly implemented.");
        } else {
            System.out.println("⚠️  Some tests failed. Check the output above.");
            System.out.println("Failed tests: " + (totalTests - passedTests));
        }
        
        // ========== QUICK REFERENCE ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("QUICK REFERENCE - ALL TEST CASES:");
        System.out.println("=".repeat(60));
        
        String[][] testCases = {
            {"new Ticket(\"AVENGERS\", \"Normal\", 100.0).getMovieName()", "\"engers\""},
            {"new Ticket(\"SPIDERMAN\", \"VIP\", 200.0).getMovieName()", "\"iderman\""},
            {"new Ticket(\"IT\", \"Normal\", 50.0).getMovieName()", "\"\""},
            {"new Ticket(\"TITANIC\", \"Normal\", 100.0).getFinalPrice()", "100.0"},
            {"new Ticket(\"AVATAR\", \"VIP\", 150.0).getFinalPrice()", "200.0"},
            {"new Ticket(\"AVENGERS\", \"VIP\", 100.0).toString()", "\"engers, 150.0\""},
            {"new Ticket(\"A\", \"VIP\", 100.0).getMovieName()", "\"\""}
        };
        
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test " + (i+1) + ":");
            System.out.println("  " + testCases[i][0]);
            System.out.println("  → Expected: " + testCases[i][1]);
            if (i < testCases.length - 1) System.out.println();
        }
    }
}