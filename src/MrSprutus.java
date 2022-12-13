public class MrSprutus extends Person implements Death, PersonAction, PersonSay {
    public MrSprutus(String name, String mood, String condition, int age, Locations location) {
        super(name, mood, condition, location);
        this.age = age;
    }

    @Override
    public String PersonSay(){
        return person.getName() + " отдаёт приказ ";
    }

    void sayAge() {
        System.out.print("Мне " + this.age + "лет");
    }
    @Override
    public String Dead(Person person) {
        return person.getName() + "умирает из-за того, что его шибануло током";
    }

    @Override
    public String PersonAction(Person person) {
        return person.getName() + " звонит по телефону";
    }

}
