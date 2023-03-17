package assignmentJava;

public class MeatLover implements PizaStore {

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public int getCalories() {
        return 20;
    }

    @Override
    public String getProductDescription() {
        return "chicken,beaf";
    }

    @Override
    public String itemName() {
        return "MeatLover";
    }
}
