package lifelessObjects;

import aliveObjects.Location;

public class SpaceWaves extends Thing {
    protected String secondName;
    public SpaceWaves(String objectName, String secondName, Location objectLocation) {
        super(objectName, objectLocation);
        this.secondName=secondName;
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
    public CurvatureOfLine getCurvatureOfLine() {
        return this.lineCurvature;
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
}
