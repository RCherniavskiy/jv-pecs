package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String brand;
    private boolean caterpillarDrive;

    public Bulldozer() {
    }

    public Bulldozer(String brand, boolean caterpillarDrive, String name, String color) {
        this.brand = brand;
        this.caterpillarDrive = caterpillarDrive;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
