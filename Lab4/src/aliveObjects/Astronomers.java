package aliveObjects;


public class Astronomers extends Person {
    public Astronomers(String objectName, Lifable objectLifable, Location objectLocation, int numberOfPeople) {
        super(objectName, objectLifable, objectLocation, numberOfPeople);
    }

    public String toWatch() {
        //System.out.print(getObjectName() + " наблюдают за ");
        return getObjectName() + " наблюдают за ";
    }

    public String makeSure() {
        //System.out.print(getObjectName() + " убедились, что ");
        return getObjectName() + " убедились, что ";
    }

    public String calculateTrajectory() {
        //System.out.print(getObjectName() + " рассчитали траекторию объекта:  ");
        return getObjectName() + " рассчитали траекторию объекта:  ";
    }

    @Override
    public String toSay() {
        return getObjectName() + " сообщили ";
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