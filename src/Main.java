public class Main {
    private static Main o;

    public static void main(String[] args) {

        Policeman policeman = new Policeman("Комиссар Ржигль", "злой полицейский", "alive", 34, Locations.MOON);
        MrSprutus mrSprutus = new MrSprutus("Мистер Спрутус", "весёлый осьминог", "alive", 83, Locations.SPRUTUS_OFFICE);
        Astronauts astronauts = new Astronauts("Коротышки", "бешеные микрочелки", "alive", 15, Locations.SPACESHIP);
        Astronomers astronomers = new Astronomers("Давилонские астрономы", "напряжённые звездочёты", "alive", Locations.OBSERVATORY);
        PoorGuys poorGuys = new PoorGuys("Бедняки", "сводят концы с концами", "alive", Locations.MOON);
        HugeSeeds hugeSeeds = new HugeSeeds("Горох", SeedCondition.NEUTRAL, Locations.SPACESHIP);
        SpaceObject spaceObject = new SpaceObject("Космический корбабль", "достаточная, чтобы выйти из сферы земного притяжения", Trajectories.TO_THE_MOON, ArrivalStatus.STILL_FLYING, Locations.OUTER_SPACE);


        System.out.print(astronomers.See(astronomers) + "..." + '\n');
        Howlist howlist = Howlist.GRDUALLY;
        System.out.print(astronomers.PersonSay() + " " + spaceObject.GetSpeed(spaceObject, howlist) + ", " + spaceObject.speed + '\n');
        System.out.print(astronomers.CalculateTrajectory(astronomers) + ' ' + spaceObject.name + ' ' + astronomers.PersonSay() + spaceObject.ThingAction(spaceObject) + " к " + spaceObject.trajectory + '\n');
        howlist = Howlist.IMMEDEATLY;
        System.out.print(astronomers.PersonAction(astronomers) + howlist + " to " + mrSprutus.name + '\n');
        DoWhat doWhat = DoWhat.TO_CONTINUE;
        System.out.print(mrSprutus.PersonSay() + doWhat + " " + astronomers.name + " " + astronomers.See(astronomers) + '\n' + " после чего " + mrSprutus.PersonAction(mrSprutus) + " " + policeman.name + " и говорит " + ArrivalStatus.WAITING_FOR_ARRIVAL + " " + spaceObject.name);
        if (astronauts.count != 0) {
            System.out.print(" c " + astronauts.name + " на борту " + '\n');
        } else {
            System.out.print(" без " + astronauts.name + " на борту " + '\n');
        }
        System.out.print(DoWhat.TO_GET_RID_OF + " " + Howlist.AS_SOON_AS_POSSIBLE + " c " + astronauts.name + " потому что " + astronauts.name + " намерены сеять повсюду " + hugeSeeds.name + " и " + astronauts.incitePoorGuys(astronauts, WayToIncite.TAKE_AWAY_FOOD) + '\n');
        System.out.print(policeman.PersonAction(policeman) + " что он будет " + DoWhat.TO_TAKE_ACTION + " " + policeman.PersonSay() + " " + ArrInfo.TIME_OF_ARRIVAL + ", " + ArrInfo.PLACE_OF_ARRIVAL + ", " + ArrInfo.COUNT_OF_ASTRONAUTS + " and " + ArrInfo.STATUS);

    }
}
