package lifelessObjects;

import aliveObjects.Location;

public interface GetWholeInfoAboutLifelessObjects {
    public String getObjectName();
    public Location getObjectLocation();
    public Trajectory getObjectTrajectory();
    public int getSpeed();
    public Movement getObjectMovement();
    public SeedsCondition getSeedsCondition();
}
