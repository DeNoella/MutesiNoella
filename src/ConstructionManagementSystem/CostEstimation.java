package ConstructionManagementSystem;

import java.util.Scanner;

public class CostEstimation extends ConstructionMaterial{
    Constructor constructor=new Constructor();
    Scanner sc=new Scanner(System.in);

    public CostEstimation() {
        int quantity;
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


        if(quantity>=5 && quantity<=15){
        int cost= 20000*quantity;
            System.out.println("Your cost is $"+cost);

        } else if(quantity>15){
            int cost= 180000*quantity;
            System.out.println("Your cost is $"+cost);

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
