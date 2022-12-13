import java.util.Objects;

abstract public class Things {
    protected Locations location;
    protected String name;
    protected SeedCondition condition;
    protected Trajectories trajectory;
    protected String speed;
    protected ArrivalStatus arrivalStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Things things = (Things) o;
        return location == things.location && Objects.equals(name, things.name) && condition == things.condition && trajectory == things.trajectory && Objects.equals(speed, things.speed) && arrivalStatus == things.arrivalStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, name, condition, trajectory, speed, arrivalStatus);
    }

    public Things(String name, Locations location) {
        this.name = name;
        this.location = location;
    }

    public Locations getLocation(){return location;}
    public String getName() {
        return name;
    }

    public SeedCondition getCondition() {
        return condition;
    }

    public String getSpeed() {
        return speed;
    }

    public ArrivalStatus getArrivalStatus() {
        return arrivalStatus;

    }

}
