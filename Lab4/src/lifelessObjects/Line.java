package lifelessObjects;

import aliveObjects.Location;

public class Line extends Thing {
    public static double getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    protected CurvatureOfLine lineCurvature;

    public Line(String objectName, CurvatureOfLine lineCurvature) {
        super(objectName);
        this.lineCurvature = lineCurvature;
    }

    public String display() {
        return (getObjectName() + " отображается на экране, степень кривизны: ");
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
    public CurvatureOfLine getCurvatureOfLine() {
        return this.lineCurvature;
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
    public int getDistance() {
        return this.distance;
    }

    @Override
    public ObjectSize getObjectSize() {
        return this.objectSize;
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

    public void setCurvatureOfLine(CurvatureOfLine lineCurvature) {
        this.lineCurvature = lineCurvature;
    }
}
