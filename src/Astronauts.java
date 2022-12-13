public class Astronauts extends Person implements Death {

    public Astronauts(String name, String mood, String condition, int count, Locations location) {
        super(name, mood, condition, location);
        this.count = count;

    }
public int getCount(){
        return count;
}

    public String incitePoorGuys(Person person, WayToIncite wayToIncite) {
        return " подстрекать бедняков неповиновению богачам путём: " + WayToIncite.THREATEN ;
    }

    @Override
    public void sayName() {
        System.out.print("Нас зовут" + this.name);
    }
    @Override
    public String Dead(Person person) {
        return person.getName() + "умирают из-за потери гермитичности корабля";
    }


}
