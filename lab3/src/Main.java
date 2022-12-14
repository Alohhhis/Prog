
import java.util.function.BinaryOperator;
import java.util.function.Function;

import aliveObjects.*;
import lifelessObjects.*;

public class Main {
    public static void main(String[] args) {
        Astronauts astronauts = new Astronauts("Коротышки", Lifable.ALIVE, Location.SPACESHIP, 44);
        Astronomers astronomers = new Astronomers("Давилонские астрономы", Lifable.ALIVE, Location.OBSERVATORY, 7);
        MrSprutus mrSprutus = new MrSprutus("Мистер Спрутус", Lifable.ALIVE, Location.SPRUTUS_OFFICE, 38);
        Policeman policeman = new Policeman("Комиссар Ржигль", Lifable.ALIVE, Location.MOON, 44);
        HugeSeeds hugeSeeds = new HugeSeeds("Огромные семена", Location.SPACESHIP, SeedsCondition.NEUTRAL);
        SpaceObject spaceObject = new SpaceObject("Космический корабль", Location.OUTER_SPACE, Trajectory.TO_THE_MOON, 105, Movement.IS_FLYING);
        int f = 0;
        System.out.println(astronomers.toWatch() + spaceObject.getObjectName());
        System.out.println(spaceObject.getAttention() + astronomers.getObjectName());
        if (spaceObject.getSpeed() < 100) {
            System.out.println(spaceObject.toGetSpeed() + Speeds.НЕДОСТАТОЧНАЯ_ЧТОБЫ_ВЫЙТИ_ИЗ_СФЕРЫ_ЗЕМНОГО_ПРИЯТЖЕНИЯ);
        }
        if (spaceObject.getSpeed() < 500 && spaceObject.getSpeed() > 99) {
            f = 1;
            System.out.println(spaceObject.toGetSpeed() + Speeds.ДОСТАТОЧНАЯ_ЧТОБЫ_ВЫЙТИ_ИЗ_СФЕРЫ_ЗЕМНОГО_ПРИЯТЖЕНИЯ);
        }
        if (spaceObject.getSpeed() < 1001 && spaceObject.getSpeed() > 499) {
            System.out.println(spaceObject.toGetSpeed() + Speeds.ДОСТАТОЧНАЯ_ЧТОБЫ_ВЫЙТИ_ИЗ_СФЕРЫ_СОЛНЕЧНОГО_ПРИЯТЖЕНИЯ);
        }
        if (spaceObject.getSpeed() > 1000) {
            System.out.println(spaceObject.toGetSpeed() + Speeds.ДОСТАТОЧНАЯ_ЧТОБЫ_ВЫЙТИ_ИЗ_СФЕРЫ_ГАЛАКТИЧЕСКОГО_ПРИЯТЖЕНИЯ);
        }
        if (f == 1) {
            spaceObject.changeMovement(Movement.WAITING_FOR_ARRIVAL);
        }
        System.out.println(astronomers.calculateTrajectory() + spaceObject.getObjectName() + " " + spaceObject.getObjectMovement() + " в " + spaceObject.getObjectLocation());
        if (spaceObject.getObjectTrajectory() == Trajectory.TO_THE_MOON) {
            System.out.println(astronomers.makeSure() + spaceObject.getObjectName() + " " + spaceObject.getObjectMovement() + " " + spaceObject.getObjectTrajectory());
        }
        System.out.println(astronomers.toSay() + Describable.IMMEDEATLY + " " + mrSprutus.getObjectName());
        System.out.println(mrSprutus.toSay() + " " + OptionsForWhatToDo.TO_CONTINUE + " " + astronomers.toWatch() + spaceObject.getObjectName());
        System.out.print(mrSprutus.ringThePhone() + policeman.getObjectName() + " " + mrSprutus.toTell() + spaceObject.getObjectName() + " " + spaceObject.getObjectMovement());
        if (astronauts.getNumberOfPeople() != 0) {
            System.out.println(" c " + astronauts.getObjectName() + " на борту ");
        } else {
            System.out.println(" без " + astronauts.getObjectName() + " на борту ");
        }
        System.out.print("C " + astronauts.getObjectName() + " " + OptionsForWhatToDo.TO_GET_RID_OF + " " + Describable.AS_SOON_AS_POSSIBLE + " потому что " + astronauts.getObjectName() + " намерены " + OptionsForWhatToDo.TO_SOW + " ");
        System.out.println(hugeSeeds.getObjectName() + " " + astronauts.toIncitePoorPeople());
        System.out.print(policeman.toSay() + " но " + policeman.toAsk() + ArrivalInfo.PLACE_OF_ARRIVAL + " " + ArrivalInfo.TIME_OF_ARRIVAL + " " + ArrivalInfo.COUNT_OF_ASTRONAUTS);
    }

}
