public class SpaceObject extends Things implements ChangeTrajectory, changeSpeed, changeArrivalStatus, ThingAction, GetSpeed{
    private Things spaceObject;

    public SpaceObject(String name, String speed, Trajectories trajectory, ArrivalStatus arrivalStatus, Locations location) {
        super(name, location);
        this.speed = speed;
        this.trajectory = trajectory;
        this.arrivalStatus = arrivalStatus;
    }

    @Override
    public void changeArrivalStatus(ArrivalStatus a) {
        spaceObject.arrivalStatus = a;
    }

    @Override
    public void changeSpeed(String s) {
        spaceObject.speed = s;
    }

    @Override
    public void changeTrajectory(Trajectories t) {
        spaceObject.trajectory = t;
    }

    @Override
    public String ThingAction(Things thing) {
        return thing.getName() + " летел в открытом космосе ";
    }

    @Override
    public String GetSpeed(SpaceObject spaceObject, Howlist howlist) {
        return spaceObject.getName()+ " приобретает скорость " + Howlist.GRDUALLY;
    }

}
