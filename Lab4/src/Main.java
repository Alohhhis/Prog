import aliveObjects.*;
import lifelessObjects.*;



public class Main {
    public static void main(String[] args) {

        Astronauts astronauts = new Astronauts("Коротышки", Lifable.ALIVE, Location.SPACESHIP, 44);
        Astronomers astronomers = new Astronomers("Давилонские астрономы", Lifable.ALIVE, Location.OBSERVATORY, 7);
        MrSprutus mrSprutus = new MrSprutus("Мистер Спрутус", Lifable.ALIVE, Location.SPRUTUS_OFFICE, 38);
        Policeman policeman = new Policeman("Комиссар Ржигль", Lifable.ALIVE, Location.MOON, 44);
        HugeSeeds hugeSeeds = new HugeSeeds("Огромные семена", Location.SPACESHIP, SeedsCondition.NEUTRAL, ObjectSize.HUGE);
        SpaceObject spaceObject = new SpaceObject("Космический корабль", "ракета", Location.OUTER_SPACE, Trajectory.TO_THE_MOON, 0, Movement.IS_FLYING, 9872, null);
        Globe moon = new Globe("Луна", Location.OUTER_SPACE, ObjectSize.BIG);
        Globe earth = new Globe("Земля", Location.OUTER_SPACE, ObjectSize.HUGE);

        System.out.println(mrSprutus.toPromise() + astronomers.getObjectName());
        System.out.println(mrSprutus.toTell() + astronomers.getObjectName());
        System.out.println(astronomers.toWatch() + earth.getObjectName() + " " + Describable.CONTINIOUSLY);
        //непроверяемое исключение (в рантайме)
        try{
            spaceObject.setSpeed((int) spaceObject.getRandomIntegerBetweenRange(1, 11) / spaceObject.getSpeed());
        }
        catch (ArithmeticException arithmeticException){
            System.err.println("попытка делить на 0");
        }
        Teleskope teleskope = null;
        try {//checked
            teleskope = new Teleskope("Гравитонный телескоп", Location.OBSERVATORY, Trajectory.INTO_THE_OPEN_SPACE, OperationMode.ON, ObjectSize.MEDIUM)  {
                @Override
                public String consistsOf() {
                    return ("Состоит из телевизора и рупора");
                }
            };
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        teleskope.setObjectTrajectory(Trajectory.TO_THE_EARTH);
        Teleskope.Pipe pipe = new Teleskope.Pipe("труба", Trajectory.INTO_THE_OPEN_SPACE, "трапецевидная");
        Teleskope.Screen screen = new Teleskope.Screen("экран", OperationMode.OFF);

        Teleskope earthTeleskope = new Teleskope("Оптический телескоп", Location.EARTH, OperationMode.ON) {
            @Override
            public String consistsOf() {
                return ("Состоит из окуляров");
            }
        };
        spaceObject.start();

        int f = 0;
        Antenna antenna = new Antenna("антенна", OperationMode.OFF);
        teleskope.setObjectTrajectory(Trajectory.TO_THE_SPACE_OBJECT);
        if (teleskope.getObjectTrajectory() == Trajectory.TO_THE_SPACE_OBJECT) {
            System.out.println(teleskope.getObjectName() + " следит за " + spaceObject.getObjectName());
            System.out.println(teleskope.thinking());
            System.out.println("Cкорость объекта: " + spaceObject.getSpeed() + " световых лет/час ");
            System.out.println("Расстояние до объекта: " + teleskope.getRandomNumber() + " световых лет.");
        }

        SpaceWaves spaceWaves = new SpaceWaves("волны тяготения", "гравитоны", Location.OUTER_SPACE);
        System.out.println(teleskope.notToResemble() + earthTeleskope.getObjectName());
        System.out.println(teleskope.toResemble());
        System.out.println(teleskope.hasA() + pipe.getObjectName() + " ," + screen.getObjectName());
        System.out.println(pipe.getObjectName() + " " + pipe.getObjectForm());
        System.out.println(pipe.canSpin() + ", " + pipe.consistsOf());
        System.out.println(pipe.functional() + antenna.getObjectName());
        System.out.println(antenna.catchWaves());
        if (antenna.getOperationMode() == OperationMode.OFF) {
            System.out.println("Включение антенны...");
            antenna.setOperationMode(OperationMode.ON);
            System.out.println(antenna.catchWaves() + spaceWaves.getObjectName());
        }
        Line line = new Line("Кривая линия", CurvatureOfLine.LITTLE_CURVED);
        int i = (int) line.getRandomIntegerBetweenRange(1, 4);
        if (antenna.getOperationMode() == OperationMode.ON) {

            if (i == 1) {
                line.setCurvatureOfLine(CurvatureOfLine.STRAIGHT);
                spaceObject.setObjectSize(ObjectSize.LITTLE);
            }
            if (i == 2) {
                line.setCurvatureOfLine(CurvatureOfLine.LITTLE_CURVED);
                spaceObject.setObjectSize(ObjectSize.MEDIUM);
            }
            if (i == 3) {
                line.setCurvatureOfLine(CurvatureOfLine.MEDIUM_CURVED);
                spaceObject.setObjectSize(ObjectSize.BIG);
            }
            if (i == 4) {
                line.setCurvatureOfLine(CurvatureOfLine.VERY_CURVED);
                spaceObject.setObjectSize(ObjectSize.HUGE);
            }
        }
        System.out.println(line.display() + line.getCurvatureOfLine() + " " + spaceObject.getObjectName() + " " + spaceObject.getObjectSize());
        System.out.println(teleskope.thinking());

        spaceObject.setSpeed((int) spaceObject.getRandomIntegerBetweenRange(18, 37) + spaceObject.getSpeed());
        System.out.println("Cкорость объекта: " + spaceObject.getSpeed() + " световых лет/час ");
        System.out.println("Расстояние до объекта: " + (int) teleskope.getRandomNumber() + " световых лет.");
        spaceObject.setSpeed((int) spaceObject.getRandomIntegerBetweenRange(38, 68) + spaceObject.getSpeed());
        System.out.println("Cкорость объекта: " + spaceObject.getSpeed() + " световых лет/час ");
        spaceObject.setSpeed((int) spaceObject.getRandomIntegerBetweenRange(15, 72) + spaceObject.getSpeed());
        spaceObject.start();
        System.out.println(astronomers.makeSure() + " это " + spaceObject.getSecondName());

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
