package aliveObjects;

public class MrSprutus extends Person {
    public MrSprutus(String objectName, Lifable objectLifable, Location objectLocation, double age) {
        super(objectName, objectLifable, objectLocation, age);
    }

    @Override
    public String toSay() {
        return getObjectName() + " отдал распоряжение ";

    }

    public String ringThePhone() {
        return getObjectName() + " позвонил по телефону ";

    }

    @Override
    public String toTell() {
        return getObjectName() + " сказал, что ";
    }

    @Override
    public String getObjectName() {
        return this.objectName;
    }

    @Override
    public Location getObjectLocation() {
        return this.objectLocation;
    }

    @Override
    public Lifable getObjectLifable() {
        return this.objectLifable;
    }

    @Override
    public double getAge() {
        return this.age;
    }

    @Override
    public int getNumberOfPeople() {
        return this.numberOfPeople;
    }
}
