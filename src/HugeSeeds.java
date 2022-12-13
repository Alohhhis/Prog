public class HugeSeeds extends Things implements changeCondition, ThingAction {
    public HugeSeeds(String name, SeedCondition condition, Locations location){
        super(name, location);
        this.condition = condition;
    }

    @Override
    public void changeCondition(SeedCondition c){
        this.condition = c;}

    @Override
    public String ThingAction(Things thing) {
        return thing.getName() + " лежат в мешочке на корабле";
    }
}

