package ConstructionManagementSystem;

public class Constructor {
    private String id;
    private String name;
    private double materialQuantity;
    private double materialBalance;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaterialQuantity() {
        return materialQuantity;
    }

    public void setMaterialQuantity(double materialQuantity) {
        this.materialQuantity = materialQuantity;
    }

    public double getMaterialBalance() {
        return materialBalance;
    }

    public void setMaterialBalance(double materialBalance) {
        this.materialBalance = materialBalance;
    }
}
