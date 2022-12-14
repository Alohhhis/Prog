package aliveObjects;

public class Policeman extends Person {
    public Policeman(String objectName, Lifable objectLifable, Location objectLocation, double age) {
        super(objectName, objectLifable, objectLocation, age);
    }

    public String toAsk() {
        return getObjectName()  + " попросил сообщить о ";
    }
    @Override
    public String toSay(){
        return getObjectName()+ " сказал, что все необходимые меры будут приняты, ";
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
