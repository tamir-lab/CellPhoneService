package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone Iphone = new CellPhone();


        CellPhone phoneNew = new CellPhone();

        System.out.print("What is the serial number?");
        int serialNumber1 = scanner.nextInt();
        phoneNew.setSerialNumber(serialNumber1);
        scanner.nextLine();
        System.out.print("What model is the phone? ");
        String model1 = scanner.nextLine();
        phoneNew.setModel(model1);
        System.out.print("Who is the carrier? ");
        String carrier1 = scanner.nextLine();
        phoneNew.setCarrier(carrier1);
        System.out.print("What is the phone number? ");
        String number1 = scanner.nextLine();
        phoneNew.setPhoneNumber(number1);
        System.out.print("WHo is the owner of the phone? ");
        String owner1 = scanner.nextLine();
        phoneNew.setOwner(owner1);


        serialNumber1 = phoneNew.getSerialNumber();
        model1 = phoneNew.getModel();
        carrier1 = phoneNew.getCarrier();
        number1 = phoneNew.getPhoneNumber();
        owner1 = phoneNew.getOwner();

        System.out.println("Serial number: " + serialNumber1);
        System.out.println("Model: "+ model1);
        System.out.println("Carrier: " + carrier1);
        System.out.println("Phone number: " + number1);
        System.out.println("Owner: " + owner1);

        CellPhone phone2 = new CellPhone();

        phone2.setSerialNumber(3184);
        phone2.setModel("Samsung");
        phone2.setCarrier("T-Mobile");
        phone2.setPhoneNumber("384533518");
        phone2.setOwner("Dolores Sholz");

        display(phoneNew);
        display(phone2);
        phoneNew.dial( phone2.getPhoneNumber() );
        phone2.dial( phoneNew.getPhoneNumber() );

        scanner.close();

    }

    public static void display(CellPhone phone) {
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println();
    }
}
