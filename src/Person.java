import java.util.Objects;

abstract class Person implements Acquaintancer {
    protected String name;
    protected String mood;
    protected String condition;

    protected Locations location;
    protected int age;
    protected int count;

    public Person(String name, String mood, String condition, Locations location) {
        this.location = location;
        this.mood = mood;
        this.name = name;
        this.condition = condition;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(mood, person.mood) && Objects.equals(condition, person.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mood, condition, age);
    }



    public int getCount() {
        return this.count;
    }

    public String getName() {
        return this.name;
    }

    public String getMood() {
        return this.mood;
    }

    public String getCondition() {
        return this.condition;
    }

    public Locations getLocation() {
        return this.location;
    }

    @Override
    public String toString(){
        return "Person { " + "name= '" + name + '\n' + ", mood= '" + mood + '\n' + ", condition= '"
                + condition + '\n' + ", age= " + age + '\n' + ", location=" + location + '}';
    }
    public void sayName() {
        System.out.print("Меня зовут" + this.name);
    }


    //TODO getLocation ()

}
