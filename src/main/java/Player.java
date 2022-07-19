public class Player {
    private String name;
    private String playerClass;
    private Integer level;
    private Boolean record;

    public Player(String name, String playerClass, Integer level){
        this.name = name;
        this.playerClass = playerClass;
        this.level = level;
    }

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
