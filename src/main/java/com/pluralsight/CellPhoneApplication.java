package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("what is the serial number: ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine());

        System.out.println("what model is the phone: "));
        phone.setModel(scanner.nextLine());

        System.out.println("what is the carrier: "));
        phone.setCarrier(scanner.nextLine());

        System.out.println("what is the phone number: ");
        phone.setPhoneNumber(scanner.nextInt());

        System.out.println("who is the owner of the phone: ");
        phone.setOwner(scanner.nextInt());

        System.out.println("what is the serial number: ");
        phone.setSerialNumber(scanner.nextInt());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
