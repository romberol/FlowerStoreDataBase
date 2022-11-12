package ua.edu.ucu.apps.demo.flowers;

public enum FlowerType {
    CHAMOMILE("CHAMOMILE"), ROSE("ROSE"), TULIP("TULIP");
    private final String stringRepresentation;

    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
