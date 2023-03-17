package assignmentJava;

public class VegLover implements PizaStore {
    @Override
    public String toString() {
        return "VegLover{}";

    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public int getCalories() {
        return 120;
    }

    @Override
    public String getProductDescription() {
        return "green vegetables only";
    }

    @Override
    public String itemName() {
        return "VegLover";
    }
}

