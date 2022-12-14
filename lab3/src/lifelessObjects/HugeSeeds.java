package lifelessObjects;

import aliveObjects.Location;

public class HugeSeeds extends Thing {
    public HugeSeeds(String objectName, Location objectLocation, SeedsCondition seedsCondition) {
        super(objectName, objectLocation);
        this.seedsCondition = seedsCondition;
    }

    void changeCondition(SeedsCondition c) {
        this.seedsCondition = c;
        if (c == SeedsCondition.HAVE_SPROUTED) {
            System.out.print(getObjectName() + " прорастают ");
        }
        if (c == SeedsCondition.ARE_DEAD) {
            System.out.print(getObjectName() + " не прорастут ");
        }
        if (c == SeedsCondition.HAVE_SPROUTED) {
            System.out.print(getObjectName() + " проросли ");
        }
    }

    protected SeedsCondition seedsCondition;

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
