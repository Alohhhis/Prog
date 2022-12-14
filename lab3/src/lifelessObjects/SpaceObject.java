package lifelessObjects;

import aliveObjects.Location;

public class SpaceObject extends Thing {
    public SpaceObject(String objectName, Location objectLocation, Trajectory objectTrajectory, int speed, Movement objectMovement) {
        super(objectName, objectLocation);
        this.objectTrajectory = objectTrajectory;
        this.speed = speed;
        this.objectMovement = objectMovement;
    }

    protected Trajectory objectTrajectory;
    protected int speed;
    protected Movement objectMovement;
public String getAttention(){
    return getObjectName()+ " завладел внимением ";
}
public String toGetSpeed(){
   return getObjectName()+" приобрёл скорость ";
}
public void changeMovement(Movement m){
    this.objectMovement=m;
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
    public SeedsCondition getSeedsCondition() {
        return this.seedsCondition;
    }
}
