package com.MHryhorovych.ATM;

import java.util.Scanner;

/**
 * @autor Maksym Hryhorovych
 */

public class InputAmount {

    static int amount;

    public static int getAmount() {

        System.out.println("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();
        return amount;
    }
}
