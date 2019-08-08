package evgenyt.smartguy;

import java.util.Scanner;

/**
 * Convert dec to hex, you smart guy!
 * Aug 2019 TEY
 */

public class DecToHex {
    private static final Character[] digits = {
            '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B',
            'C', 'D', 'E', 'F'
    };
    private static final int sysBase = 16;

    public static void main(String[] args) {
        // Get int
        System.out.println("Input integer value:");
        int decIntInit = new Scanner(System.in).nextInt();
        String resultStr = "";
        // Minus sign elimination
        int decInt = Math.abs(decIntInit);
        // Cycle of division
        while (decInt > 0) {
            int reminder = decInt % sysBase;
            resultStr = resultStr + digits[reminder];
            decInt = decInt / sysBase;
        }
        // Empty - it was 0
        if (resultStr.equals(""))
            resultStr = "0";
        // Reverse result string
        resultStr = new StringBuilder(resultStr).reverse().toString();
        // Add negative sign
        if (decIntInit < 0)
            resultStr = "-" + resultStr;
        // Print result
        System.out.println("DEC " + decIntInit + " = HEX " + resultStr);
    }
}
