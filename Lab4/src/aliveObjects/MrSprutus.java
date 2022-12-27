package aliveObjects;

public class MrSprutus extends Person {
    public MrSprutus(String objectName, Lifable objectLifable, Location objectLocation, double age) {
        super(objectName, objectLifable, objectLocation, age);
    }

    @Override
    public String toSay() {
        return getObjectName() + " сказал, что ";

    }

    public String ringThePhone() {
        return getObjectName() + " позвонил по телефону ";
    }

    public String toPromise() {
        return getObjectName() + " пообещал деньги ";
    }

    @Override
    public String toTell() {
        return getObjectName() + " отдал распоряжение ";
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
