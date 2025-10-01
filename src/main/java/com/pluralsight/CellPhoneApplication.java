package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("what is the serial number: ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("what model is the phone: ");
        phone.setModel(scanner.nextLine());

        System.out.println("what is the carrier: ");
        phone.setCarrier(scanner.nextLine());

        System.out.println("what is the phone number: ");
        phone.setPhoneNumber(String.valueOf(scanner.nextInt()));

        System.out.println("who is the owner of the phone: ");
        phone.setOwner(String.valueOf(scanner.nextInt()));

        System.out.println("what is the serial number: ");
        phone.setSerialNumber(scanner.nextInt());

        System.out.println("\nCellPhone Detaills");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("CellPhone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
