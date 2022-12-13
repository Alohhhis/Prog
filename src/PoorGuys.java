public class PoorGuys extends Person implements Death, PersonSay{
    public PoorGuys(String name, String mood, String condition, Locations location) {
        super(name, mood, condition, location);
    }

    static void obedienceToTheRich() {
        System.out.print("Слушаются богачей");
    }

    static void disobedienceToTheRich() {
        System.out.print("не сушаются богачей");
    }

    @Override
    public String PersonSay() {
        return person.getName() + " сказали: что они всё равно повинуются богачам";
    }

    @Override
    public void sayName() {
        System.out.print("Нас зовут" + this.name);
    }
    @Override
    public String Dead(Person person) {
        return person.getName() + "умирают из-за того, что они не ели уже месяц";
    }
}
