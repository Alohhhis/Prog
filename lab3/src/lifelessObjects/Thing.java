package lifelessObjects;

import aliveObjects.Location;

abstract class Thing implements GetWholeInfoAboutLifelessObjects {
    protected String objectName;
    protected Location objectLocation;
    protected int speed;
    protected Movement objectMovement;
    protected SeedsCondition seedsCondition;
    protected Trajectory objectTrajectory;

    public Thing(String objectName, Location objectLocation) {
        this.objectName = objectName;
        this.objectLocation = objectLocation;
    }


}
