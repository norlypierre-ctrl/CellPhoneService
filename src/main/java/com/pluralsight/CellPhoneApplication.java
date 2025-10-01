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

        System.out.println("what is the phone number for 2 phone: ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("who is the owner of the 2 phone: ");
        phone.setOwner(scanner.nextLine());

        CellPhone phone2 = new CellPhone();

        System.out.println("what is the serial number for 2 phone: ");
        phone2.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("what model is the 2 phone: ");
        phone2.setModel(scanner.nextLine());

        System.out.println("what is the carrier for 2 phone: ");
        phone2.setCarrier(scanner.nextLine());

        System.out.println("what is the phone number of 2 phone: ");
        phone2.setPhoneNumber(scanner.nextLine());

        System.out.println("who is the owner of the 2 phone: ");
        phone2.setOwner(scanner.nextLine());

        display(phone);
        display(phone2);

        System.out.println("\n Phone Calls ");

        phone.dial(phone2.getPhoneNumber());
        phone2.dial(phone.getPhoneNumber());

        scanner.close();
    }

     public static void display(CellPhone phone){
            System.out.println("\nPhone Details: ");
            System.out.println("Serial Number: " + phone.getSerialNumber());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Carrier: " + phone.getCarrier());
            System.out.println("CellPhone Number: " + phone.getPhoneNumber());
            System.out.println("Owner: " + phone.getOwner());

    }
}
