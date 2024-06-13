package Parcial1;

public class parcial1{
    
    private String name;
    private int initialQuantity;
    private int soldQuantity;

    public parcial1(String name, int initialQuantity) {
        this.name = name;
        this.initialQuantity = initialQuantity;
        this.soldQuantity = 0;
    }

    public String getName() {
        return name;
    }

    public int getInitialQuantity() {
        return initialQuantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void sell(int quantity) {
        this.soldQuantity += quantity;
    }

    public int getAvailableQuantity() {
        return initialQuantity - soldQuantity;
    }

    public boolean isOutOfStock() {
        return getAvailableQuantity() == 0;
    }

    public void duplicateInventory() {
        this.initialQuantity *= 2;
        this.soldQuantity = 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", initialQuantity=" + initialQuantity +
                ", soldQuantity=" + soldQuantity +
                ", availableQuantity=" + getAvailableQuantity() +
                '}';
    }
}
