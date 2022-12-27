package lifelessObjects;

import aliveObjects.Location;

public interface GetWholeInfoAboutLifelessObjects {
    public String getObjectName();

    public Location getObjectLocation();

    public Trajectory getObjectTrajectory();

    public int getSpeed();

    public Movement getObjectMovement();

    public SeedsCondition getSeedsCondition();

    public ObjectSize getObjectSize();

    public CurvatureOfLine getCurvatureOfLine();

    public OperationMode getOperationMode();

    public CurvatureOfLine getLineCurvature();

    public int getDistance();

}
