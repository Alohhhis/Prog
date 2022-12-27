package lifelessObjects;

import aliveObjects.Location;

public class SpaceObject extends Thing {
    public static double getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }
    public SpaceObject(String objectName, String secondName, Location objectLocation, Trajectory objectTrajectory, int speed, Movement objectMovement, int distanse, ObjectSize objectSize) {
        super(objectName, objectLocation, objectSize);
        this.objectTrajectory = objectTrajectory;
        this.speed = speed;
        this.secondName=secondName;
        this.objectMovement = objectMovement;
        this.distance = distance;
    }
    private class Motor{
        public void startMotor(){
            System.out.println("Двигатель наинает работать");
        }
    }
    public void start(){
        Motor motor= new Motor();
        motor.startMotor();
        class Fuel{  ///вложенный класс ЛОКАЛЬНЫЙ
            public void burning(){
                System.out.println("Fuel is burning");
            }
        }
        Fuel fuel=new Fuel();
        test(fuel);
    }
    private void test(Object object){

    }
protected ObjectSize objectSize;
    protected int distance;
    protected String secondName;
    protected Trajectory objectTrajectory;
    protected int speed;
    protected Movement objectMovement;

    public String getAttention() {
        return getObjectName() + " завладел внимением ";
    }

    public String toGetSpeed() {
        return getObjectName() + " приобрёл скорость ";
    }

    public void changeMovement(Movement m) {
        this.objectMovement = m;
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
    public int getDistance() {
        return this.distance;
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
    public OperationMode getOperationMode() {
        return this.operationMode;
    }

    @Override
    public CurvatureOfLine getLineCurvature() {
        return this.lineCurvature;
    }

    @Override
    public SeedsCondition getSeedsCondition() {
        return this.seedsCondition;
    }

    public void setObjectSize(ObjectSize objectSize) {
        this.objectSize = objectSize;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSecondName() {
        return secondName;
    }
}
