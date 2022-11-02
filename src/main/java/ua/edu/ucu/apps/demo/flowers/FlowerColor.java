package ua.edu.ucu.apps.demo.flowers;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
