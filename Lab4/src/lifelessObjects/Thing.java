package lifelessObjects;

import aliveObjects.Location;

abstract class Thing implements GetWholeInfoAboutLifelessObjects {
    protected String objectName;
    protected Location objectLocation;
    protected int speed;
    protected Movement objectMovement;
    protected SeedsCondition seedsCondition;
    protected Trajectory objectTrajectory;


    protected OperationMode operationMode;
    protected CurvatureOfLine lineCurvature;
    protected int distance;
    protected ObjectSize objectSize;

    public Thing(String objectName) {
        this.objectName = objectName;
    }

    public Thing(String objectName, Location objectLocation) {
        this.objectName = objectName;
        this.objectLocation = objectLocation;
    }

    public Thing(String objectName, Location objectLocation, ObjectSize objectSize) {
        this.objectName = objectName;
        this.objectLocation = objectLocation;
        this.objectSize = objectSize;
    }

}
