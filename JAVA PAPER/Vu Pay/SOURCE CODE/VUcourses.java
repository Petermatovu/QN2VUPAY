/*
 * Project: VUPay
 * Class: VUCourses
 * Author: Talemwa Derrick
 * Purpose: Victoria University Course Lookup System
 * Date: February 2026
 */

import java.util.Scanner;

public class VUcourses {

    public static void main(String[] args) {

        // ----- Variable declarations -----
        String enteredCode;     // Code entered by applicant
        String moduleName;      // Course name
        int tuition;            // Tuition fee

        // ----- Scanner for user input -----
        Scanner input = new Scanner(System.in);

        // ----- System Header -----
        System.out.println("================================================");
        System.out.println("        VICTORIA UNIVERSITY — VUPay SYSTEM      ");
        System.out.println("================================================");
        System.out.println();

        // ----- Prompt user -----
        System.out.print("Enter Module Code: ");
        enteredCode = input.nextLine().toUpperCase();

        System.out.println();
        System.out.println("--------------- COURSE DETAILS ----------------");

        // ----- Decision structure -----
        if (enteredCode.equals("BSF")) {

            moduleName = "BSc. Software Engineering";
            tuition = 900000;

            System.out.println("Module Name : " + moduleName);
            System.out.println("Module Code : " + enteredCode);
            System.out.println("Tuition Fee : UGX " + tuition);

        } else if (enteredCode.equals("BIT")) {

            moduleName = "BSc. Information Technology";
            tuition = 750000;

            System.out.println("Module Name : " + moduleName);
            System.out.println("Module Code : " + enteredCode);
            System.out.println("Tuition Fee : UGX " + tuition);

        } else if (enteredCode.equals("BCS")) {

            moduleName = "BSc. Computer Science";
            tuition = 800000;

            System.out.println("Module Name : " + moduleName);
            System.out.println("Module Code : " + enteredCode);
            System.out.println("Tuition Fee : UGX " + tuition);

        } else if (enteredCode.equals("BCE")) {

            moduleName = "BSc. Computer Engineering";
            tuition = 950000;

            System.out.println("Module Name : " + moduleName);
            System.out.println("Module Code : " + enteredCode);
            System.out.println("Tuition Fee : UGX " + tuition);

        } else {

            System.out.println("Wrong Module Code details");

        }

        System.out.println("------------------------------------------------");

        // Close scanner
        input.close();
    }
}