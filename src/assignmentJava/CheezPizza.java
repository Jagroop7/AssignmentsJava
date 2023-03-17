package assignmentJava;

public class CheezPizza implements PizaStore {

    @Override
    public int getPrice() {
        return 22;
    }

    @Override
    public int getCalories() {
        return 15;
    }

    @Override
    public String getProductDescription() {
        return "Dairy Products only";
    }

    @Override
    public String itemName() {
        return "CheezPizza";
    }
}
