package ConstructionManagementSystem;

import java.util.Scanner;

public class MaterialUsage extends ConstructionMaterial{

    Constructor constructor=new Constructor();
    Scanner sc = new Scanner(System.in);

    public MaterialUsage() {
        double materialBalance=0;
        int quantity=0;
        System.out.println("YOU'VE SELECTED MATERIAL USAGE");

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


        materialBalance-=quantity;

        if (materialBalance>=2){
            System.out.println("Material is ready to be used!!!");
        } else {
            System.out.println("Material is not ready to be used, IT SHOULD BE ABOVE 2 TONS!!!");
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
