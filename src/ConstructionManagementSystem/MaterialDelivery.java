package ConstructionManagementSystem;

import java.util.Scanner;

public class MaterialDelivery extends ConstructionMaterial{
    Constructor constructor=new Constructor();
    Scanner sc = new Scanner(System.in);

    public MaterialDelivery() {
        double materialBalance=0;
        int quantity;
        System.out.println("YOU'VE SELECTED MATERIAL DELIVERY");

        while(true){
            System.out.println("ENTER QUANTITY OF THE MATERIAL DELIVERY: ");
            if(sc.hasNextInt()){
                quantity = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid Quantity, Try again Please and Enter a Numeric value!!!");
                sc.next();
            }
        }

        while(true){
            System.out.println("ENTER BALANCE OF THE MATERIAL DELIVERY: ");
            if(sc.hasNextInt()){
                materialBalance = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid balance, Try again Please and Enter a Numeric value!!!");
                sc.next();
            }
        }

        if (quantity>=1 && quantity<=10) {
        materialBalance+=quantity;
            System.out.println("Material Delivery is: "+materialBalance);
        } else {
            System.out.println("Invalid Quantity!! Try again between 1 and 10");
        }
    }






    @Override
    public int receiveMaterial() {
        return 0;
    }

    @Override
    public int useMaterial() {
        return 0;
    }

    @Override
    public int estimationCost() {
        return 0;
    }
}
