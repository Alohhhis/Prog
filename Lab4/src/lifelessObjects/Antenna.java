package lifelessObjects;

import aliveObjects.Location;

public class Antenna extends Thing {
    protected OperationMode operationMode;

    public Antenna(String objectName, OperationMode operationMode) {
        super(objectName);
        this.operationMode = operationMode;
    }

    public String catchWaves() {
        if (getOperationMode() == OperationMode.ON) {
            boolean flag = true;
            return (getObjectName() + " улавливает ");
        } else {
            boolean flag = false;
            return (getObjectName() + " не работает, так как она выключена ");
        }
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
    public OperationMode getOperationMode() {
        return this.operationMode;
    }

    @Override
    public CurvatureOfLine getLineCurvature() {
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

    public void setOperationMode(OperationMode operationMode) {
        this.operationMode = operationMode;
    }
}