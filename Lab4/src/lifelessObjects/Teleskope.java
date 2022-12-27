package lifelessObjects;

import aliveObjects.Location;

public class Teleskope extends Thing  {

    public static double getRandomNumber() {
        double x = Math.random();
        return x * 100;
    }

    private Trajectory objectTrajectory;

    public String consistsOf() {
        return "";
    }

    public static class Pipe {//вложенный not static класс
        private String objectName;
        private Trajectory objectTrajectory;
        protected String objectForm;

        public Pipe(String objectName, Trajectory objectTrajectory, String objectForm) {
            this.objectName = objectName;
            this.objectTrajectory = objectTrajectory;
            this.objectForm = objectForm;
        }

        public void changeTrajectory(Trajectory newTrajectory) {

            if (newTrajectory == Trajectory.TO_THE_SUN) {
                objectTrajectory = Trajectory.TO_THE_SUN;
                System.out.println(getObjectName() + " поворачивается к Солнцу ");
            }
            if (newTrajectory == Trajectory.INTO_THE_OPEN_SPACE) {
                objectTrajectory = Trajectory.INTO_THE_OPEN_SPACE;
                System.out.println(getObjectName() + " направляется в даль косомса ");
            }
            if (newTrajectory == Trajectory.TO_THE_MOON) {
                objectTrajectory = Trajectory.TO_THE_MOON;
                System.out.println(getObjectName() + " поворачивается к Луне ");
            }
            if (newTrajectory == Trajectory.TO_THE_SPACE_OBJECT) {
                objectTrajectory = Trajectory.TO_THE_SPACE_OBJECT;
                System.out.println(getObjectName() + " замечает космичсекий объект ");
            }
            if (newTrajectory == Trajectory.TO_THE_EARTH) {
                objectTrajectory = Trajectory.TO_THE_EARTH;
                System.out.println(getObjectName() + " направлен в сторону Земли ");
            }
        }

        public String getObjectName() {

            return (this.objectName);
        }

        public Trajectory getObjectTrajectory() {
            return (this.objectTrajectory);
        }

        public String getObjectForm() {
            return (this.objectForm);
        }

        public String consistsOf() {
            return (getObjectName() + " состоит из сплетения тончайших металлических проводов ");
        }

        public String canSpin() {
            return (getObjectName() + " вращается ");
        }

        public String functional() {
            return (getObjectName() + " выполняет функцию ");
        }
    }

    public static class Screen {//вложенный статичный класс
        private final String objectName;
        private OperationMode operationMode;

        public Screen(String objectName, OperationMode operationMode) {
            this.objectName = objectName;
            this.operationMode = operationMode;
        }

        public void toShow() {
            System.out.println(getObjectName() + " показывает статистику");
        }

        public String getObjectName() {

            return (this.objectName);
        }

    }

    public Teleskope(String objectName, Location objectLocation, Trajectory objectTrajectory, OperationMode operationMode, ObjectSize objectSize) throws IllegalAccessException {
        super(objectName, objectLocation, objectSize);
        this.objectTrajectory = objectTrajectory;
        this.operationMode = operationMode;
        Pipe pipe = new Pipe("Труба", Trajectory.INTO_THE_OPEN_SPACE, "трапецевидная");
        pipe.changeTrajectory(Trajectory.TO_THE_EARTH);
        pipe.changeTrajectory(Trajectory.TO_THE_SPACE_OBJECT);


        Screen screen = new Screen("экран", OperationMode.ON);
        if (screen.operationMode == OperationMode.OFF) {
            System.out.println(getObjectName() + " " + screen.operationMode + " ...запуск программы ");
            System.out.println("Подключение антенны...");
            System.out.println("Подключение экрана...");
            screen.operationMode = OperationMode.ON;
            System.out.println(getObjectName() + " " + screen.operationMode);
            screen.toShow();
        } else {

            screen.toShow();
        }

    }

    public Teleskope(String objectName, Location objectLocation, OperationMode operationMode) {
        super(objectName, objectLocation);
        this.operationMode = operationMode;

    }
public String thinking(){
        return getObjectName()+" вычисляет значения ...";
}
    public String notToResemble() {
        return getObjectName() + " не похож на ";
    }

    public String toResemble() {
        return getObjectName() + " напоминает телевизор ";
    }

    public String hasA() {
        return getObjectName() + " оснащён деталями: ";
    }

    @Override
    public String getObjectName() {
        return this.objectName;
    }

    @Override
    public Location getObjectLocation() {
        return this.objectLocation;
    }

    @Override
    public Trajectory getObjectTrajectory() {
        return this.objectTrajectory;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public Movement getObjectMovement() {
        return this.objectMovement;
    }

    @Override
    public ObjectSize getObjectSize() {
        return this.objectSize;
    }

    @Override
    public CurvatureOfLine getCurvatureOfLine() {
        return this.lineCurvature;
    }

    @Override
    public int getDistance() {
        return this.distance;
    }

    @Override
    public SeedsCondition getSeedsCondition() {
        return this.seedsCondition;
    }

    @Override
    public OperationMode getOperationMode() {
        return this.operationMode;
    }

    @Override
    public CurvatureOfLine getLineCurvature() {
        return this.lineCurvature;
    }

    public void setObjectTrajectory(Trajectory objectTrajectory) {
        this.objectTrajectory = objectTrajectory;
    }
}