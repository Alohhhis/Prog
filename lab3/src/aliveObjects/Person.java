package aliveObjects;

import java.util.Objects;

abstract class Person implements GetWholeInfoAboutAliveObjects {
    protected String objectName;
    protected Lifable objectLifable;
    protected Location objectLocation;
    protected double age;
    protected int numberOfPeople;

    public Person(String objectName, Lifable objectLifable, Location objectLocation, double age) {
        this.objectName = objectName;
        this.objectLifable = objectLifable;
        this.objectLocation = objectLocation;
        this.age = age;
    }

    public Person(String objectName, Lifable objectLifable, Location objectLocation, int numberOfPeople) {
        this.objectName = objectName;
        this.objectLifable = objectLifable;
        this.objectLocation = objectLocation;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.age, age) == 0 && numberOfPeople == person.numberOfPeople && Objects.equals(objectName, person.objectName) && objectLifable == person.objectLifable && objectLocation == person.objectLocation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectName, objectLifable, objectLocation, age, numberOfPeople);
    }

    @Override
    public String toString() {
        return "Person { " + "objectName= '" + objectName + '\n' + ", objectLifable= '"
                + objectLifable + '\n' + ", age= " + age + '\n' + ", objectLocation=" + objectLocation + '}';
    }

    public String toSay() {
        return("");
    }

    public String toTell() {
        return(" сказал ");
    }
}
