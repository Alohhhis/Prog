public class Policeman extends Person implements Personality, Death, PersonAction, PersonSay {

    public Policeman(String name, String mood, String condition, int age, Locations location) {
        super(name, mood, condition, location);
        this.age = age;
    }


    @Override
    public void sayAge() {
        System.out.print("Мне " + this.age + "лет");
    }

    @Override
    public String Dead(Person person) {
        return person.getName() + "умирает из-за разрыва сердца";
    }

    @Override
    public String PersonAction(Person person) {
        return person.getName() + " сказал ";
    }
    @Override
    public String PersonSay (){
        return person.getName()+" попростл сообщить о";
    }
}
