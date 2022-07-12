public class Player {
    private String name;
    private String playerClass;
    private Integer level;
    private Boolean record;

    public Boolean isRegistered(){
        return this.record;
    }

    public void registerAdventurer(){
        this.record = true;
    }

    public void unregisterAdventurer(){
        this.record = false;
    }
}
