public class Astronomers extends Person implements Death, See, PersonSay, CalculateTrajectory, PersonAction{
    public Astronomers(String name, String mood, String condition, Locations location) {
        super(name, mood, condition, location);
    }


    @Override
    public String PersonSay(){
        return person.getName() + " убеждаются, что ";
    }
    //TODO добавить объект для вычисления полёта.

    @Override
    public void sayName() {
        System.out.print("Нас зовут" + this.name);
    }
    @Override
    public String Dead(Person person) {
        return person.getName() + "умирают из-за неизвестных обстоятельств ";
    }

    @Override
    public String See(Person person) {
        return person.getName()+ " наблюдают ";
    }

    @Override
    public String CalculateTrajectory(Person person) {
        return person.getName()+ " вычисляют траекторию полёта объекта ";
    }


    @Override
    public String PersonAction(Person person) {
        return person.getName()+" сообщили ";
    }
}
