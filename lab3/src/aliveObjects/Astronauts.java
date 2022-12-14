package aliveObjects;

public class Astronauts extends Person {
    public Astronauts(String objectName, Lifable objectLifable, Location objectLocation, int numberOfPeople) {
        super(objectName, objectLifable, objectLocation, numberOfPeople);
    }

    public String toIncitePoorPeople() {
        return getObjectName() + " подстрекают бедняков путём " + WayToIncite.CALLING_THEM_STUPID;

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
