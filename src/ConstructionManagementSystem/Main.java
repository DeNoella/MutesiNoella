package ConstructionManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Constructor constructor = new Constructor();
        System.out.println("Construction Management System");
        System.out.println("===============================");

        int id;
        String name;
        int quantity;
        int choice=0;


        while (true) {
            System.out.println("Enter id: ");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid ID, Try again Please!!!");
                sc.next();
            }
        }


        do {
            System.out.println("Enter name: ");
            name = sc.next();
            constructor.setName(name);
        } while (!name.matches("[a-zA-Z]+"));


        System.out.println("OPERATIONS");
        System.out.println("==========");
        System.out.println("1.MATERIAL USAGE");
        System.out.println("2.MATERIAL DELIVERY");
        System.out.println("3.COST ESTIMATION");
        System.out.println("0.EXIT");

        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                MaterialUsage materialUsage = new MaterialUsage();

                break;

            case 2:
                MaterialDelivery materialDelivery = new MaterialDelivery();

                break;

            case 3:
                CostEstimation costEstimation = new CostEstimation();

                break;

            case 0:
                System.out.println("THANK YOU FOR USING THE SYSTEM");
                System.exit(0);
                break;

            default:
                    System.out.println("INVALID CHOICE");
                    break;
        }
    }
}





